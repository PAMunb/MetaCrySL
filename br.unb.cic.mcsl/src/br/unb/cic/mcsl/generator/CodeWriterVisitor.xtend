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
import br.unb.cic.mcsl.metaCrySL.EnsurePredicate
import br.unb.cic.mcsl.metaCrySL.AtomicPredicate
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
import br.unb.cic.mcsl.metaCrySL.Pred
import br.unb.cic.mcsl.metaCrySL.PredParams
import br.unb.cic.mcsl.metaCrySL.PredParameter
import br.unb.cic.mcsl.metaCrySL.PredValue
import br.unb.cic.mcsl.metaCrySL.PredWildcard
import br.unb.cic.mcsl.metaCrySL.PredThis
import br.unb.cic.mcsl.metaCrySL.impl.PredValueImpl
import br.unb.cic.mcsl.metaCrySL.impl.PredWildcardImpl
import br.unb.cic.mcsl.metaCrySL.impl.PredThisImpl
import br.unb.cic.mcsl.metaCrySL.RequirePredicate
import br.unb.cic.mcsl.metaCrySL.PredicateOr
import br.unb.cic.mcsl.metaCrySL.impl.StringValueImpl
import br.unb.cic.mcsl.metaCrySL.impl.InSetImpl
import br.unb.cic.mcsl.metaCrySL.ForbiddenMethod
import br.unb.cic.mcsl.metaCrySL.Forbidden
import br.unb.cic.mcsl.metaCrySL.impl.ForbiddenImpl

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
					var el = ''
					switch(obj) {
						StringValueImpl: values.add('"' + obj.value + '"')
						default: values.add('"' + (obj as VariableImpl).varName + '"')
					}
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
	
	/**
	 * Uses method overloading to pretty print values for Pred expressions
	 */
	def String prettyPrintValue(PredValueImpl value) {
		switch(value.^val) {
			Variable: {
				val v = value.^val as Variable
				return v.varName
			}
			IntValue: {
				val v = value.^val as IntValue
				return v.value.toString
			}
			StringValue: {
				val v = value.^val as StringValue
				return v.value.toString
			}
		}
		throw new RuntimeException("not supported yet " + value)
	}
	
	
	// ENSURES
	
	/**
	 * Pretty print an Ensures expression
	 */
	def String prettyPrintEnsures(EnsurePredicate exp) {
		var after = ''
		if(exp.label !== null) {
			after = ' after ' + exp.label
		}
		return prettyPrintAtomicPredicate(exp.predicate) + after
	}
	
	/**
	 * Pretty print an Atomic Predicate expression
	 */
	def String prettyPrintAtomicPredicate(AtomicPredicate exp) {
		var cons = ''
		var not = ''
		if(exp.cons !== null) {
			switch(exp.cons) {
				ConstraintExp: cons = prettyPrint(exp.cons as ConstraintExp)
				Pred: cons = prettyPrintPred(exp.cons as Pred)
				default: cons = prettyPrint(exp.cons as ConstraintExp)
			}
			cons = cons + ' => '
		}
		if(exp.not !== null ) {
			not = '!'
		}
		return cons + not + prettyPrintPred(exp.pred)
	}
	
	/**
	 * Pretty print a Pred expression
	 */
	def String prettyPrintPred(Pred exp) {
		return exp.name + '[' + prettyPrintPredParams(exp.params) + ']'
	}
	
	/**
	 * Pretty print a PredParams expression
	 */
	def String prettyPrintPredParams(PredParams exp) {
		val params = new ArrayList<String>
		for(o: exp.parameters) {
			params.add(prettyPrintPredParameter(o))
		}
		return String.join(',', params)
	}
	
	/**
	 * Pretty print a PredParameter expression
	 */
	def String prettyPrintPredParameter(PredParameter exp) {
		switch(exp) {
			PredValueImpl: return prettyPrintValue(exp)
			PredWildcardImpl: return '_'
			PredThisImpl: return 'this'
		}
		throw new RuntimeException("not implemented yet " + exp)
	}
	
	// REQUIRES
	def String prettyPrintRequire(RequirePredicate exp) {
		switch(exp.exp) {
			PredicateOr: return prettyPrintPredicateOr(exp.exp as PredicateOr)
			AtomicPredicate: return prettyPrintAtomicPredicate(exp.exp as AtomicPredicate)
			Pred: return prettyPrintPred(exp.exp as Pred)
		}
		
		switch(exp) {
			PredicateOr: return prettyPrintPredicateOr(exp as PredicateOr)
			AtomicPredicate: return prettyPrintAtomicPredicate(exp)
		}
	}
	
	def String prettyPrintPredicateOr(PredicateOr exp) {
		return prettyPrintRequire(exp.leftExpression) +
			   ' || ' + prettyPrintRequire(exp.right) 
	}
	
	// FORBIDDEN
	def String prettyPrintForbiddenMethod(ForbiddenMethod exp) {
		val args = ''
		val alternative = ''
		
		if((exp as Forbidden).args !== null) {

		}
		
		if((exp as Forbidden).alternative !== null) {
			
		}
		
		return (exp as Forbidden).method + 	
		
	}

}
