package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.ArithmeticExp
import br.unb.cic.mcsl.metaCrySL.ConstraintExp
import br.unb.cic.mcsl.metaCrySL.ImpliesExp
import br.unb.cic.mcsl.metaCrySL.Variable
import br.unb.cic.mcsl.metaCrySL.impl.ValueImpl
import br.unb.cic.mcsl.metaCrySL.util.MetaCrySLSwitch
import br.unb.cic.mcsl.metaCrySL.ConjunctionExp
import br.unb.cic.mcsl.metaCrySL.DisjunctionExp
import br.unb.cic.mcsl.metaCrySL.RelationalExp
import br.unb.cic.mcsl.metaCrySL.IntValue
import br.unb.cic.mcsl.metaCrySL.AtomicConstraint
import br.unb.cic.mcsl.metaCrySL.NeverTypeOf
import br.unb.cic.mcsl.metaCrySL.CallTo
import br.unb.cic.mcsl.metaCrySL.NoCallTo
import br.unb.cic.mcsl.metaCrySL.Length
import br.unb.cic.mcsl.metaCrySL.InstanceOf
import br.unb.cic.mcsl.metaCrySL.NotHardCoded
import br.unb.cic.mcsl.metaCrySL.InSet
import br.unb.cic.mcsl.metaCrySL.LiteralSet
import br.unb.cic.mcsl.metaCrySL.impl.LiteralSetImpl
import br.unb.cic.mcsl.metaCrySL.impl.AtomicConstraintImpl
import java.util.ArrayList
import br.unb.cic.mcsl.metaCrySL.impl.VariableImpl
import br.unb.cic.mcsl.metaCrySL.MetaVariable
import br.unb.cic.mcsl.metaCrySL.impl.MetaVariableImpl
import br.unb.cic.mcsl.metaCrySL.impl.BracketsImpl
import br.unb.cic.mcsl.metaCrySL.impl.FunctionCallImpl
import br.unb.cic.mcsl.metaCrySL.StringValue

class CodeWriterVisitor extends MetaCrySLSwitch<String> {
	
	/**
	 * pretty print a ConstraintExp. Here we use pattern 
	 * matching to identify what is the type of the 
	 * constraint expression. 
	 */
	def String prettyPrint(ConstraintExp exp) {
		switch (exp) {
			ImpliesExp    : return prettyPrintImpliesExpression(exp)
			ConjunctionExp: return prettyPrintConjunctionExpression(exp)
			DisjunctionExp: return prettyPrintDisjunctionExpression(exp)
			RelationalExp : return prettyPrintRelationalExpression(exp)
			ArithmeticExp : return prettyPrintArithmeticExpression(exp)
			AtomicConstraint: return prettyPrintAtomicConstraint(exp)
			NeverTypeOf   : return prettyPrintNeverTypeOf(exp)
			CallTo        : return prettyPrintCallTo(exp)
			NoCallTo      : return prettyPrintNoCallTo(exp)
			Length        : return prettyPrintLength(exp)
			InstanceOf    : return prettyPrintInstanceOf(exp)
			NotHardCoded  : return prettyPrintNotHardCoded(exp)
			InSet         : return prettyPrintInSet(exp)
		}
		throw new RuntimeException("not implemented yet " + exp)
	}
	
	/**
	 * pretty print an *implies* expression
	 */
	def String prettyPrintImpliesExpression(ImpliesExp exp) {
		return prettyPrint(exp.left) + " => " + prettyPrint(exp.right) 
	}
	
	/**
	 * pretty print an *disjunction* expression
	 */
	def String prettyPrintConjunctionExpression(ConjunctionExp exp) {
		return prettyPrint(exp.left) + " && " + prettyPrint(exp.right)
	}
	
	/**
	 * pretty print an *conjunction* expression
	 */
	def String prettyPrintDisjunctionExpression(DisjunctionExp exp) {
		return prettyPrint(exp.left) + " || " + prettyPrint(exp.right)
	}
	
	/**
	 * pretty print a *relational* expression
	 */
	 def String prettyPrintRelationalExpression(RelationalExp exp) {
	 	return prettyPrint(exp.left) + exp.operator + prettyPrint(exp.right)
	 }
	 
	/**
	 * pretty print an *arithmetic* expression
	 */
	def String prettyPrintArithmeticExpression(ArithmeticExp exp) {
		return prettyPrint(exp.left) + exp.operator + prettyPrint(exp.right)
	}
	
	/**
	 * pretty print an *atomic* constraint
	 */
	def String prettyPrintAtomicConstraint(AtomicConstraint atomic) {
		switch(atomic.exp) {
			ValueImpl: return prettyPrintValue(atomic.exp as ValueImpl)
			FunctionCallImpl: return prettyPrintFunctionCall(atomic.exp as FunctionCallImpl)
		}
		throw new RuntimeException("not supported yet " + atomic.exp)
	}
	
	/**
	 * pretty print an *neverTypeOf* constraint
	 */
	def String prettyPrintNeverTypeOf(NeverTypeOf exp) {
		return 'neverTypeOf[' + exp.^var + ',' + exp.varType + ']' 
	}
	
	
	/**
	 * pretty print a *CallTo* constraint
	 */
	def String prettyPrintCallTo(CallTo exp) {
		return 'callTo[' + exp.method + ']'
	}
	
	/**
	 * pretty print a *NoCallTo* constraint
	 */
	def String prettyPrintNoCallTo(NoCallTo exp) {
		return 'noCallTo[' + exp.method + ']'
	}
	
	/**
	 * pretty print a *Length* constraint
	 */
	def String prettyPrintLength(Length exp) {
		return 'length[' + exp.^var + ']'
	}
	
	/**
	 * pretty print a *InstanceOf* constraint
	 */
	def String prettyPrintInstanceOf(InstanceOf exp) {
		return 'instanceOf[' + exp.^var + ',' + exp.varType + ']'
	}
	
	/**
	 * pretty print a *NotHardCoded* constraint
	 */
	def String prettyPrintNotHardCoded(NotHardCoded exp) {
		return 'notHardCoded[' + exp.^var  + ']'
	}
	
	/**
	 * pretty print a *InSet* constraint
	 */
	def String prettyPrintInSet(InSet exp) {
		switch(exp.left) {
			ValueImpl: {
				return prettyPrintValue(exp.left as ValueImpl) + 
					' in ' + prettyPrintLiteralSet(exp.literalSet)
			}
			BracketsImpl: {
				return prettyPrintBackets(exp.left as BracketsImpl) + 
					' in ' + prettyPrintLiteralSet(exp.literalSet)
			}
			FunctionCallImpl: {
				return prettyPrintFunctionCall(exp.left as FunctionCallImpl) + 
					' in ' + prettyPrintLiteralSet(exp.literalSet)
			}
		}
	}
	
	def String prettyPrintFunctionCall(FunctionCallImpl exp) {
		val params = new ArrayList<String>
		for(obj: exp.params) {
			val el = obj as VariableImpl
			params.add(el.varName)
		}
		return exp.methodName + '(' + String.join(',', params) + ')'
	}
	
	/**
	 * pretty print a *Brackets* constraint
	 */
	def String prettyPrintBackets(BracketsImpl exp) {
		return '(' + prettyPrint(exp.exp as ConstraintExp) + ')'
	}
	
	/**
	 * pretty print a *LiteralSet* constraint
	 */
	def String prettyPrintLiteralSet(LiteralSet exp) {
		switch(exp) {
			MetaVariable: {
				return prettyPrintMetaVariable(exp)
			}
			LiteralSet: {
				val values = new ArrayList<String>
				for(obj: exp.values) {
					val el = obj as VariableImpl
					values.add(el.varName)
				}
				return '{' + String.join(',', values) + '}'
			}
		}
	}
	
	/**
	 * pretty print a *MetaVariable* constraint
	 */
	def String prettyPrintMetaVariable(MetaVariable exp) {
		return exp.^var
	}
	
	/**
	 * pretty print a value constraint
	 */
	def String prettyPrintValue(ValueImpl value) {
		switch(value.exp) {
			Variable: {
				val v = value.exp as Variable
				return v.varName
			}
			IntValue: {
				val v = value.exp as IntValue
				return v.value.toString
			}
			StringValue: {
				val v = value.exp as StringValue
				return v.value.toString
			}
		}
		throw new RuntimeException("not supported yet " + value.exp)
	}

}
