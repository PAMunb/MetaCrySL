package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.ArithmeticExp
import br.unb.cic.mcsl.metaCrySL.AtomicConstraint
import br.unb.cic.mcsl.metaCrySL.ConstraintExp
import br.unb.cic.mcsl.metaCrySL.ImpliesExp
import br.unb.cic.mcsl.metaCrySL.Variable
import br.unb.cic.mcsl.metaCrySL.impl.ValueImpl
import br.unb.cic.mcsl.metaCrySL.util.MetaCrySLSwitch
import br.unb.cic.mcsl.metaCrySL.ConjunctionExp
import br.unb.cic.mcsl.metaCrySL.DisjunctionExp
import br.unb.cic.mcsl.metaCrySL.RelationalExp
import br.unb.cic.mcsl.metaCrySL.IntValue

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
		}
		throw new RuntimeException("not supported yet " + atomic.exp)
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
		}
		throw new RuntimeException("not supported yet " + value.exp)
	}

}
