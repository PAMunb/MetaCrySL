package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.AddConstraint
import br.unb.cic.mcsl.metaCrySL.AddEnsure
import br.unb.cic.mcsl.metaCrySL.AddEvent
import br.unb.cic.mcsl.metaCrySL.Constraint
import br.unb.cic.mcsl.metaCrySL.DefineLiteralSet
import br.unb.cic.mcsl.metaCrySL.LiteralSet
import br.unb.cic.mcsl.metaCrySL.Rename
import br.unb.cic.mcsl.metaCrySL.Spec
import br.unb.cic.mcsl.metaCrySL.impl.MetaCrySLFactoryImpl
import br.unb.cic.mcsl.metaCrySL.util.MetaCrySLSwitch
import java.util.ArrayList
import java.util.HashMap
import br.unb.cic.mcsl.metaCrySL.InSet
import br.unb.cic.mcsl.metaCrySL.MetaVariable

class ApplyRefinementVisitor extends MetaCrySLSwitch<Void> {
	var Spec newspec
	var defineVariables = new HashMap<String, LiteralSet>

	new(Spec spec) {
		this.newspec = spec; 
	}

	def getSpec() {
		val factory = new MetaCrySLFactoryImpl()

		//
		// Before returning the updated specification, we 
		// have to set all meta-variables (if any)
		//
		val toInclude = new ArrayList<Constraint>()
		val toRemove = new ArrayList<Constraint>()
		for (c : newspec.constraintSpec.constraints) {
			if (c.exp.booleanExp instanceof InSet) {
				val current = c.exp.booleanExp as InSet
				if (current.literalSet instanceof MetaVariable) {
					val mv = (current.literalSet as MetaVariable).^var
					if (defineVariables.containsKey(mv)) {
						toRemove.add(c)
						val newInsetExp = factory.createInSet()
						newInsetExp.left = current.left
						newInsetExp.literalSet = defineVariables.get(mv)

						val newConstraint = factory.createConstraint
						newConstraint.exp = newInsetExp

						toInclude.add(newConstraint)
					}
				}
			}
		}
		newspec.constraintSpec.constraints.removeAll(toRemove)
		newspec.constraintSpec.constraints.addAll(toInclude)
		//
		return newspec
	}

	override Void caseRename(Rename object) {
//		// TODO: we have to discuss this case here. 
//		// I am not completely sure that the implementation 
//		// should work as it is implemented here. 	
//		this.classType = (new MetaCrySLFactoryImpl()).createSimpleType()
//		classType.typeName = object.type
//
//		return super.caseRename(object)
	}

	override Void caseDefineLiteralSet(DefineLiteralSet object) {
		defineVariables.put("${" + object.^var + "}", object.set)
		return super.caseDefineLiteralSet(object)
	}

	override caseAddConstraint(AddConstraint object) {
		val newConstraint = (new MetaCrySLFactoryImpl()).createConstraint
		newConstraint.exp = (new MetaCrySLFactoryImpl()).createConstraintExp
		newConstraint.exp.booleanExp = object.constraint
		newspec.constraintSpec.constraints.add(newConstraint)
		return super.caseAddConstraint(object)
	}

	override caseAddEnsure(AddEnsure object) {
		newspec.ensureSpec.ensures.add(object.ensure)
		return super.caseAddEnsure(object)
	}

	override caseAddEvent(AddEvent object) {
		newspec.eventSpec.events.add(object.event)
		return super.caseAddEvent(object)
	}
}
