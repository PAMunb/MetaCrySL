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
import br.unb.cic.mcsl.metaCrySL.LiteralSet
import br.unb.cic.mcsl.metaCrySL.MetaVariable

class CodeWriterVisitor extends MetaCrySLSwitch<String> {
	def String prettyPrint(ConstraintExp object) {
		return prettyPrint(object.booleanExp)
	}
	
	def String prettyPrint(BooleanExp object) {
		if(object instanceof RelationalExp) {
			return prettyPrint(object as RelationalExp)
		}
	}
	
	def String prettyPrint(ImpliesExp object) {
		return prettyPrint(object.left) + ' => ' + prettyPrint(object.right)
	}
	
	def String prettyPrint(DisjunctionExp object) {
		return prettyPrint(object.left) + ' || ' + prettyPrint(object.right)
	}
	
	def String prettyPrint(ConjunctionExp object) {
		return prettyPrint(object.left) + ' && ' + prettyPrint(object.right)
	}
	
	def String prettyPrint(RelationalExp object) {
		return prettyPrint(object.left as ArithmeticExp) + object.operator + prettyPrint(object.right as ArithmeticExp)
	}
	
	def String prettyPrint(ArithmeticExp object) {
		return prettyPrint(object.left as BasicExp) + object.operator + prettyPrint(object.right as BasicExp)
	}
	
	def String prettyPrint(BasicExp object) {
		if(object instanceof NeverTypeOf) {
			return 'neverTypeOf' + '[' + object.^var + ',' + object.varType + ']'
		}
		else if(object instanceof NoCallTo) {
			return 'noCallTo' + '[' + object.method + ']'
		}
		else if(object instanceof CallTo) {
			return 'callTo' + '[' + object.method + ']'
		}
		else if(object instanceof NotHardCoded) {
			return 'notHardCoded' + '[' + object.^var + ']'
		}
		else if(object instanceof Length) {
			return 'length' + '[' + object.^var + ']'
		}
		else if(object instanceof InstanceOf) {
			return 'instanceOf' + '[' + object.^var + ',' + object.varType + ']'
		}
		else if(object instanceof InSet) {
			return prettyPrint(object.left) + ' in ' + prettyPrint(object.literalSet)
		}
		else if(object instanceof AtomicConstraint) {
			return prettyPrint(object.exp as AtomicConstraintExp)
		}
	}
	
	def String prettyPrint(LiteralSet object) {
		if(object instanceof MetaVariable) {
			return object.^var
		} else if(object instanceof LiteralSet) {
			// TODO
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