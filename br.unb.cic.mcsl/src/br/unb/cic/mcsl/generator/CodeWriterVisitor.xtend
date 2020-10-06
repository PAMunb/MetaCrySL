package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.util.MetaCrySLSwitch
import br.unb.cic.mcsl.metaCrySL.ConjunctionExp
import br.unb.cic.mcsl.metaCrySL.DisjunctionExp
import br.unb.cic.mcsl.metaCrySL.RelationalExp
import br.unb.cic.mcsl.metaCrySL.ImpliesExp
import br.unb.cic.mcsl.metaCrySL.ArithmeticExp
import org.eclipse.emf.ecore.EObject
import br.unb.cic.mcsl.metaCrySL.AtomicConstraint
import br.unb.cic.mcsl.metaCrySL.Value

class CodeWriterVisitor extends MetaCrySLSwitch<Void> {
	var Object left
	var Object operator
	var Object right
	var Object value
	var Object exp
	
	override Void caseConjunctionExp(ConjunctionExp object) {
		println(object)
		return super.caseConjunctionExp(object)
	}
	
	override Void caseDisjunctionExp(DisjunctionExp object) {
		println(object)
		return super.caseDisjunctionExp(object)
	}
	
	override Void caseRelationalExp(RelationalExp object) {
		println(object)
		var visitor = new CodeWriterVisitor()
		left = object.left
		operator = object.operator
		right = object.right
		
		visitor.doSwitch(left as EObject)
		visitor.doSwitch(right as EObject)
		
		return super.caseRelationalExp(object)
	}
	
	override Void caseImpliesExp(ImpliesExp object) {
		return super.caseImpliesExp(object)
	}
	
	override Void caseArithmeticExp(ArithmeticExp object) {
		var visitor = new CodeWriterVisitor()
		
		left = object.left
		operator = object.operator
		right = object.right
		
		visitor.doSwitch(left as EObject)
		visitor.doSwitch(right as EObject)
		
		left = visitor.value
		right = visitor.value
		
		return super.caseArithmeticExp(object)
	}
	
	override Void caseAtomicConstraint(AtomicConstraint object) {
		var visitor = new CodeWriterVisitor()
		
		exp = object.exp
		visitor.doSwitch(exp as EObject)
		
		value = visitor.value
		
		return super.caseAtomicConstraint(object)
	}
	
	override Void caseValue(Value object) {
		value = object.^val.value
		
		return super.caseValue(object)
	}
}