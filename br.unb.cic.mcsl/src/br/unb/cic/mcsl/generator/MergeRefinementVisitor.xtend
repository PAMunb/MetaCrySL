package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.DefineLiteralSet
import br.unb.cic.mcsl.metaCrySL.Rename
import br.unb.cic.mcsl.metaCrySL.impl.MetaCrySLFactoryImpl
import br.unb.cic.mcsl.metaCrySL.util.MetaCrySLSwitch
import br.unb.cic.mcsl.metaCrySL.AddConstraint
import br.unb.cic.mcsl.metaCrySL.AddRequire
import br.unb.cic.mcsl.metaCrySL.AddEnsure
import br.unb.cic.mcsl.metaCrySL.AddEvent
import br.unb.cic.mcsl.metaCrySL.RefinementOpr
import java.util.ArrayList
import br.unb.cic.mcsl.metaCrySL.impl.DefineLiteralSetImpl
import java.util.HashMap
import br.unb.cic.mcsl.metaCrySL.Value

class MergeRefinementVisitor extends MetaCrySLSwitch<Void> {
	var name = new String
	var hasRename = false
	var rename = new String
	val oprList = new ArrayList<RefinementOpr>
	val defineMap = new HashMap<String, ArrayList<Value>>
	
	new(String name) {
		this.name = name
	}
	
	def getRefinement() {
		val newRefinement = (new MetaCrySLFactoryImpl()).createRefinement()
		newRefinement.name = this.name
		
		if(hasRename) {
			val newRename = (new MetaCrySLFactoryImpl()).createRename()
			newRename.type = rename
			oprList.add(newRename)
		}
		
		for(e: defineMap.keySet()) {
			val newDefine = (new MetaCrySLFactoryImpl()).createDefineLiteralSet()
			newDefine.set = (new MetaCrySLFactoryImpl()).createLiteralSet()
			newDefine.^var = e
			newDefine.set.values.addAll(defineMap.get(e))
			oprList.add(newDefine)
		} 
		
		newRefinement.refinements.addAll(oprList)
		
		return newRefinement
	}

	override Void caseRename(Rename object) {
		hasRename = true
		rename = object.type
		return super.caseRename(object)
	}

	override Void caseDefineLiteralSet(DefineLiteralSet object) {
		var values = new ArrayList<Value>
		
		if(defineMap.containsKey(object.^var)) {
			values = defineMap.get(object.^var)
		}
		
		values.addAll(object.set.values)
		defineMap.put(object.^var, values)
		
		return super.caseDefineLiteralSet(object)
	}
	
	override caseAddConstraint(AddConstraint object) {
		oprList.add(object)
		return null
	}
	
	override caseAddEnsure(AddEnsure object) {
		oprList.add(object)
		return null
	}
	
	override caseAddEvent(AddEvent object) {
		oprList.add(object)
		return null
	}

}
