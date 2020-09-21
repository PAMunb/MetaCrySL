package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.util.MetaCrySLSwitch
import br.unb.cic.mcsl.metaCrySL.impl.MetaCrySLFactoryImpl
import br.unb.cic.mcsl.metaCrySL.Rename
import br.unb.cic.mcsl.metaCrySL.DefineLiteralSet
import br.unb.cic.mcsl.metaCrySL.AddConstraint
import br.unb.cic.mcsl.metaCrySL.AddEnsure
import br.unb.cic.mcsl.metaCrySL.AddEvent
import java.util.ArrayList
import br.unb.cic.mcsl.metaCrySL.LiteralSet
import br.unb.cic.mcsl.metaCrySL.Constraint
import br.unb.cic.mcsl.metaCrySL.EnsurePredicate
import br.unb.cic.mcsl.metaCrySL.Event

class ApplyRefinementVisitor extends MetaCrySLSwitch<Void> {
	var name = new String
	var literalSet = new ArrayList<LiteralSet>
	var constraints = new ArrayList<Constraint>
	var ensures = new ArrayList<EnsurePredicate>
	var events = new ArrayList<Event>
	
	new(String name) {
		this.name = name
	}
	
	def getSpec() {
		val newSpec = (new MetaCrySLFactoryImpl()).createSpec()
		newSpec.className = this.name
		newSpec.constraintSpec = (new MetaCrySLFactoryImpl()).createConstraintSpec()
		newSpec.ensureSpec = (new MetaCrySLFactoryImpl()).createEnsureSpec()
		newSpec.eventSpec = (new MetaCrySLFactoryImpl()).createEventSpec()
		
		for(c : constraints) {
			newSpec.constraintSpec.constraints.add(c)
		}
		
		for(e: ensures) {
			newSpec.ensureSpec.ensures.add(e)
		}
		
		for(ev: events) {
			newSpec.eventSpec.events.add(ev)
		}
		
		return newSpec
	}
	
	override Void caseRename(Rename object) {
		this.name = object.type
		return super.caseRename(object)
	}

	override Void caseDefineLiteralSet(DefineLiteralSet object) {
		// TODO: how to handle this case?
		literalSet.add(object.set)
		
		return super.caseDefineLiteralSet(object)
	}
	
	override caseAddConstraint(AddConstraint object) {
		val newConstraint = (new MetaCrySLFactoryImpl()).createConstraint()
		newConstraint.exp = (new MetaCrySLFactoryImpl()).createConstraintExp()
		newConstraint.exp = object.constraint
		
		constraints.add(newConstraint)
		return null
	}
	
	override caseAddEnsure(AddEnsure object) {
		ensures.add(object.ensure)
		return null
	}
	
	override caseAddEvent(AddEvent object) {
		events.add(object.event)
		return null
	}
}