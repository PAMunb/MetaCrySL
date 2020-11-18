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
	
	def String writeConstraints() {
		val constraints = new ArrayList<String>
		constraints.add('\nCONSTRAINTS\n')
		val visitor = new CodeWriterVisitor()
		
		for(c: spec.constraintSpec.constraints) {
			constraints.add('\t' + visitor.prettyPrint(c.exp))
		}
		
		return String.join('\n', constraints)
	}
	
	def String writeHeader()'''
		ABSTRACT SPEC «this.typeName»
	'''
	
	
	def String writeEvents() {
		val events = new ArrayList<String>
		val visitor = new CodeWriterVisitor()
		events.add('\nEVENTS\n')
		
		for(event: spec.eventSpec.events) {
			val e = visitor.prettyPrintEvent(event)
			if(e !== null) {
				events.add(e + ';')
			}
		}
		
		return String.join('\n', events)
	}
	
	def String writeForbidden() {
		val forbidden = new ArrayList<String>
		val visitor = new CodeWriterVisitor()
		forbidden.add('\nFORBIDDEN\n')
		for(f: spec.forbiddenSpec.forbidenMethods) {
			forbidden.add('\t' + visitor.prettyPrintForbiddenMethod(f) + ';')
		}
		
		return String.join('\n', forbidden)
	}
	
	def String writeOrder() {
		val orders = new ArrayList<String>
		val visitor = new CodeWriterVisitor()
		orders.add('\nORDER\n')
		orders.add('\t' + visitor.prettyPrintOrder(spec.orderSpec.order) + ';')
		
		return String.join('\n', orders)
	}
	
	def String writeRequire() {
		val requires = new ArrayList<String>
		val visitor = new CodeWriterVisitor()
		requires.add('\nREQUIRES\n')
		for(require: spec.requireSpec.requires) {
			requires.add('\t' + visitor.prettyPrintRequire(require) + ';')
		}
		
		return String.join('\n', requires)
	}
	
	def String writeObjects() {
		val objects = new ArrayList<String>
		val visitor = new CodeWriterVisitor()
		objects.add('\nOBJECTS\n')
		
		for(object: spec.objectSpec.objects) {
			objects.add('\t' + visitor.prettyPrintObject(object) + ';')
		}
		
		return String.join("\n", objects)
	}
	
	def String writeEnsures() {
		val ensures = new ArrayList<String>
		val visitor = new CodeWriterVisitor()
		ensures.add('\nENSURES\n')
		
		for(e: spec.ensureSpec.ensures) {
			ensures.add('\t' + visitor.prettyPrintEnsures(e) + ';')
		}
		
		return String.join('\n', ensures)
	}
	
	def void generate() {
		// TODO: the generated file must be written at the PATH specified in the config file
		val pw = new PrintWriter("out.crysl", "UTF-8")
		pw.println(writeHeader())
		pw.println(writeObjects())
		pw.println(writeEvents())
		pw.println(writeOrder())
		pw.println(writeRequire())
		pw.println(writeEnsures())
		pw.println(writeConstraints())
		pw.println(writeForbidden())
		
		
		pw.close()
	}
}