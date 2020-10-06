package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.util.MetaCrySLSwitch
import br.unb.cic.mcsl.metaCrySL.ConjunctionExp
import br.unb.cic.mcsl.metaCrySL.DisjunctionExp
import br.unb.cic.mcsl.metaCrySL.RelationalExp
import br.unb.cic.mcsl.metaCrySL.ImpliesExp

/*
 * Controls variables left, right and operator
 */
class CodeWriterVisitor extends MetaCrySLSwitch<Void> {
	public var String left
	public var String operator
	public var String right
	
	override Void caseConjunctionExp(ConjunctionExp object) {
		return super.caseConjunctionExp(object)
	}
	
	override Void caseDisjunctionExp(DisjunctionExp object) {
		return super.caseDisjunctionExp(object)
	}
	
	override Void caseRelationalExp(RelationalExp object) {
		operator = object.operator
		
		var visitorLeft = new ConstraintVisitor()
		var visitorRight = new ConstraintVisitor()
		
		visitorLeft.doSwitch(object.left)
		visitorRight.doSwitch(object.right)
		
		left = visitorLeft.value
		right = visitorRight.value
		
		return super.caseRelationalExp(object)
	}
	
	override Void caseImpliesExp(ImpliesExp object) {
		return super.caseImpliesExp(object)
	}
}