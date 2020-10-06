package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.util.MetaCrySLSwitch
import br.unb.cic.mcsl.metaCrySL.ArithmeticExp
import br.unb.cic.mcsl.metaCrySL.AtomicConstraint
import br.unb.cic.mcsl.metaCrySL.Value

class ConstraintVisitor extends MetaCrySLSwitch<Void> {
	public var String value
	
	override Void caseArithmeticExp(ArithmeticExp object) {
		var left = object.left
		var right = object.right
		var operator = object.operator
		
		var visitorLeft = new ConstraintVisitor()
		var visitorRight = new ConstraintVisitor()
		
		visitorLeft.doSwitch(left)
		visitorRight.doSwitch(right)
		
		value = visitorLeft.value + operator + visitorRight.value
		
		return super.caseArithmeticExp(object)
	}
	
	override Void caseAtomicConstraint(AtomicConstraint object) {
		var visitor = new ConstraintVisitor()
		
		visitor.doSwitch(object.exp)
		
		value = visitor.value
		
		return super.caseAtomicConstraint(object)
	}
	
	override Void caseValue(Value object) {
		value = object.^val.value
		
		return super.caseValue(object)
	}
}