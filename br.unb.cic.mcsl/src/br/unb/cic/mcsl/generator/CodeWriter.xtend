package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.Spec
import java.io.PrintWriter
import br.unb.cic.mcsl.metaCrySL.impl.ConstraintImpl
import java.util.List
import br.unb.cic.mcsl.metaCrySL.impl.RelationalExpImpl
import br.unb.cic.mcsl.metaCrySL.impl.ConjunctionExpImpl
import br.unb.cic.mcsl.metaCrySL.impl.DisjunctionExpImpl
import java.util.ArrayList
import br.unb.cic.mcsl.metaCrySL.MethodDef
import br.unb.cic.mcsl.metaCrySL.EventMethod
import br.unb.cic.mcsl.metaCrySL.EventAggregate
import br.unb.cic.mcsl.metaCrySL.AtomicPredicate

class CodeWriter {
	var Spec spec
	var String typeName
	
	new(Spec spec) {
		this.spec = spec
		this.typeName = spec.classType.typeName
	}
	
	def String writeConstraint() {
		val constraints = new ArrayList<String>
		constraints.add('CONSTRAINTS\n')
		val visitor = new CodeWriterVisitor()
		
		for(c: spec.constraintSpec.constraints) {
			constraints.add(visitor.prettyPrint(c.exp))
		}
		
		return String.join('\n', constraints)
	}
	
	def String writeHeader()'''
		ABSTRACT SPEC «this.typeName»
	'''
	
	def String writeConstraints() {
		val c = writeConstraint()
		return 'CONSTRAINT'	
	}
	
	def String writeEvents() {
		val events = new ArrayList<String>
		val visitor = new CodeWriterVisitor()
		events.add('EVENTS\n')
		
		for(event: spec.eventSpec.events) {
			events.add(visitor.prettyPrint(event))
		}
		
		return String.join('\n', events)
	}
	
	def String writeEnsure()'''
		ENSURES
	'''
	
	def String writeForbidden()'''
		FORBIDDEN
	'''
	
	def String writeOrder()'''
		ORDER
	'''
	
	def String writeRequire() {
		val requires = new ArrayList<String>
		requires.add('REQUIRES\n')
		for(require: spec.requireSpec.requires) {
			if(require.exp instanceof AtomicPredicate) {
				var params = (require.exp as AtomicPredicate).pred.parans.parameters.map(el |
					if(el.^val != null) {
						el.^val.value
					} else {
						'_'
					}
				)
				val exp = (require.exp as AtomicPredicate).pred.name + '[' +  String.join(',', params) + '];'
				requires.add(exp)
			}
		}
		
		return String.join('\n', requires)
	}
	
	def String writeObjects() {
		val objects = new ArrayList<String>
		objects.add('OBJECTS\n')
		
		for(object: spec.objectSpec.objects) {
			val type = object.objectType
			val name = object.objectName
			val obj = type + ' ' + name + ';'
			objects.add(obj)
		}
		
		return String.join("\n", objects)
	}
	
	def void generate() {
		val pw = new PrintWriter("out.crysl", "UTF-8")
		pw.println(writeHeader())
		pw.println(writeObjects())
		pw.println(writeEvents())
		pw.println(writeOrder())
		pw.println(writeRequire())
		pw.println(writeConstraints())
		
		
		pw.close()
	}
}