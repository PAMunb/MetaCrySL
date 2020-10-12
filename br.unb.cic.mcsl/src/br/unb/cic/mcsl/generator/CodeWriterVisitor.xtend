package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.util.MetaCrySLSwitch
import br.unb.cic.mcsl.metaCrySL.ConjunctionExp
import br.unb.cic.mcsl.metaCrySL.DisjunctionExp
import br.unb.cic.mcsl.metaCrySL.RelationalExp
import br.unb.cic.mcsl.metaCrySL.ImpliesExp
import br.unb.cic.mcsl.metaCrySL.ConstraintExp
import br.unb.cic.mcsl.metaCrySL.BooleanExp
import br.unb.cic.mcsl.metaCrySL.ArithmeticExp
import br.unb.cic.mcsl.metaCrySL.AtomicConstraintExp
import br.unb.cic.mcsl.metaCrySL.BasicExp
import br.unb.cic.mcsl.metaCrySL.NeverTypeOf
import br.unb.cic.mcsl.metaCrySL.NoCallTo
import br.unb.cic.mcsl.metaCrySL.CallTo
import br.unb.cic.mcsl.metaCrySL.NotHardCoded
import br.unb.cic.mcsl.metaCrySL.Length
import br.unb.cic.mcsl.metaCrySL.InstanceOf
import br.unb.cic.mcsl.metaCrySL.InSet
import br.unb.cic.mcsl.metaCrySL.AtomicConstraint
import br.unb.cic.mcsl.metaCrySL.Value
import br.unb.cic.mcsl.metaCrySL.FunctionCall

/*
 * Controls variables left, right and operator
 */
class CodeWriterVisitor extends MetaCrySLSwitch<String> {
	public var String left
	public var String operator
	public var String right


	def String prettyPrint(ConstraintExp object) {
		return prettyPrint(object.booleanExp)
	}
	
	def String prettyPrint(BooleanExp object) {
		if(object instanceof RelationalExp) {
			return prettyPrint(object as RelationalExp)
		}
	}
	
	def String prettyPrint(ImpliesExp object) {
		return prettyPrint(object.left) + '=>' + prettyPrint(object.right)
	}
	
	def String prettyPrint(RelationalExp object) {
		return prettyPrint(object.left as ArithmeticExp) + object.operator + prettyPrint(object.right as ArithmeticExp)
	}
	
	def String prettyPrint(ArithmeticExp object) {
		return prettyPrint(object.left as BasicExp) + object.operator + prettyPrint(object.right as BasicExp)
	}
	
	def String prettyPrint(BasicExp object) {
		if(object instanceof NeverTypeOf) {
			// TODO
		}
		else if(object instanceof NoCallTo) {
			// TODO
		}
		else if(object instanceof CallTo) {
			// TODO
		}
		else if(object instanceof NotHardCoded) {
			// TODO
		}
		else if(object instanceof Length) {
			// TODO
		}
		else if(object instanceof InstanceOf) {
			// TODO
		}
		else if(object instanceof InSet) {
			// TODO
		}
		else if(object instanceof AtomicConstraint) {
			return prettyPrint(object.exp as AtomicConstraintExp)
		}
	}
	
	def String prettyPrint(AtomicConstraintExp object) {
		if(object instanceof Value) {
			return prettyPrint(object.^val as Value)
		}
		else if(object instanceof ConstraintExp) {
			return '(' + prettyPrint(object as ConstraintExp) + ')'
		}
		else if(object instanceof FunctionCall) {
			// TODO	
		}
	}
	
	def String prettyPrint(Value object) {
		return object.value
	}

}