package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.ArithmeticExp
import br.unb.cic.mcsl.metaCrySL.Object
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
import br.unb.cic.mcsl.metaCrySL.EventExp
import br.unb.cic.mcsl.metaCrySL.ChoiceExp
import br.unb.cic.mcsl.metaCrySL.SequenceExp
import br.unb.cic.mcsl.metaCrySL.BasicEventExp
import br.unb.cic.mcsl.metaCrySL.PrimaryExp
import br.unb.cic.mcsl.metaCrySL.Optional
import br.unb.cic.mcsl.metaCrySL.ZeroOrMore
import br.unb.cic.mcsl.metaCrySL.OneOrMore
import br.unb.cic.mcsl.metaCrySL.RequirePredicate
import br.unb.cic.mcsl.metaCrySL.PredicateOr
import br.unb.cic.mcsl.metaCrySL.impl.StringValueImpl
import br.unb.cic.mcsl.metaCrySL.impl.InSetImpl
import br.unb.cic.mcsl.metaCrySL.ForbiddenMethod
import br.unb.cic.mcsl.metaCrySL.Forbidden
import br.unb.cic.mcsl.metaCrySL.impl.ForbiddenImpl
import br.unb.cic.mcsl.metaCrySL.Event
import br.unb.cic.mcsl.metaCrySL.EventMethod
import br.unb.cic.mcsl.metaCrySL.EventAggregate
import br.unb.cic.mcsl.metaCrySL.MethodDef
import br.unb.cic.mcsl.metaCrySL.FormalArg
import br.unb.cic.mcsl.metaCrySL.impl.FormalImpl
import br.unb.cic.mcsl.metaCrySL.FormalArgs
import br.unb.cic.mcsl.metaCrySL.Wildcard
import br.unb.cic.mcsl.metaCrySL.Formal
import br.unb.cic.mcsl.metaCrySL.AggregateList
import br.unb.cic.mcsl.metaCrySL.impl.IntValueImpl

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
			switch(obj) {
				VariableImpl: {
					val el = obj as VariableImpl
					params.add(el.varName)
				}
				IntValueImpl:  {
					val el = obj as IntValueImpl
					params.add(el.value)
				}
			}
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
						IntValueImpl: values.add(obj.value)
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
	}
	// EVENTS
	
	/**
	 * Uses pattern matching to print an event spec
	 */
	def String prettyPrintEvent(Event exp) {
		switch(exp) {
			EventMethod: return prettyPrintEventMethod(exp)
			EventAggregate: return prettyPrintEventAggregate(exp)
		}
	}
	
	/**
	 * Pretty print an Event Method expression
	 */
	def prettyPrintEventMethod(EventMethod exp) {
		var optional = ''
		if(exp.^var !== null) {
			optional = exp.^var + ' = '
		}
		return exp.label + ' : ' + optional + prettyPrintMethodDef(exp.method)
	}
	
	def prettyPrintMethodDef(MethodDef exp) {
		var formalArgs = ''
		if(exp.args !== null) {
			formalArgs = prettyPrintFormalArgs(exp.args)
		}
		return exp.methodName + '(' + formalArgs + ')'
	}
	
	/**
	 * Pretty print a FormalArgs expression
	 */
	def prettyPrintFormalArgs(FormalArgs exp) {
		var argsList = new ArrayList<String>
		for(arg: exp.args) {
			argsList.add(prettyPrintFormalArg(arg))
		}
		return String.join(',', argsList)
	}

	/**
	 * Pretty print a FormalArg expression
	 */
	def prettyPrintFormalArg(FormalArg exp) {
		switch(exp) {
			case exp instanceof FormalImpl: return prettyPrintFormalImpl(exp as Formal)
			case exp instanceof Wildcard: return '_'
		}
		throw new RuntimeException("not implemented yet " + exp)
	}
	
	// ORDER
	
	/**
	 * Uses pattern matching for Order expression
	 */
	def String prettyPrintOrder(EventExp exp) {
		switch(exp) {
			ChoiceExp: return prettyPrintChoiceExp(exp)
			SequenceExp: return prettyPrintSequenceExp(exp)
			Optional: return prettyPrintOptional(exp) + '?'
			ZeroOrMore: return prettyPrintZeroOrMore(exp) + '*'
			OneOrMore: return prettyPrintOneOrMore(exp) + '+'
			PrimaryExp: return prettyPrintPrimaryExp(exp)
		}
		throw new RuntimeException("not implemented yet " + exp)
	}
	
	/**
	 * Pretty print a Optional expression
	 */
	def String prettyPrintOptional(Optional exp) {
		if(exp.exp.label !== null) {
			return exp.exp.label
		} else {
			return '(' + prettyPrintOrder(exp.exp) + ')'
		}
	}
	
	/**
	 * Pretty print a ZeroOrMore expression
	 */
	def String prettyPrintZeroOrMore(ZeroOrMore exp) {
		if(exp.exp.label !== null) {
			return exp.exp.label
		} else {
			return '(' + prettyPrintOrder(exp.exp) + ')'
		}	
	}
	
	/**
	 * Pretty print a OneOrMore expression
	 */
	def String prettyPrintOneOrMore(OneOrMore exp) {
		if(exp.exp.label !== null) {
			return exp.exp.label
		} else {
			return '(' + prettyPrintOrder(exp.exp) + ')'
		}
	}
	
	/**
	 * Pretty print a ChoiceExp expression
	 */
	def String prettyPrintChoiceExp(ChoiceExp exp) {
		return prettyPrintOrder(exp.left) + '|' + prettyPrintOrder(exp.right)
	}
	
	/**
	 * Pretty print a SequenceExp expression
	 */
	def String prettyPrintSequenceExp(SequenceExp exp) {
		return prettyPrintOrder(exp.left) + ',' + prettyPrintOrder(exp.right)
	}
	
	/**
	 * Pretty print a PrimaryExp expression
	 */
	def String prettyPrintPrimaryExp(PrimaryExp exp) {
		if(exp.exp.label !== null) {
			return exp.exp.label
		} else {
			return '(' + prettyPrintOrder(exp.exp) + ')'
		}
	}
	
	// OBJECTS
	def String prettyPrintObject(Object exp) {
		var obj_type = ''
		var obj_type_param = ''
		if(exp.objectType !== null) {
			obj_type = exp.objectType
		}
		if(exp.objectTypeParam !== null) {
			obj_type_param = '<' + exp.objectTypeParam + '>'
		}
		
		return obj_type + obj_type_param + ' ' + exp.objectName
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
	
	def prettyPrintFormalImpl(Formal exp) {
		return exp.argument
	}
	
	/**
	 * Pretty print an Event Aggregate
	 */
	def prettyPrintEventAggregate(EventAggregate exp) {
		return exp.label + ' := ' + prettyPrintAggregateList(exp.aggregate)
	}
	
	def prettyPrintAggregateList(AggregateList exp) {
		return String.join('|', exp.labels)
	}
	
	// FORBIDDEN
	def String prettyPrintForbiddenMethod(ForbiddenMethod exp) {
		var args = ''
		var alternative = ''
		
		if((exp as Forbidden).args !== null) {
			args = prettyPrintFormalArgs((exp as Forbidden).args)
		}
		
		if((exp as Forbidden).alternative !== null) {
			alternative = ' => ' + (exp as Forbidden).alternative
		}
		
		return (exp as Forbidden).method + '(' + args + ')' + alternative
	}

}
