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
			constraints.add(visitor.prettyPrint(c.exp))
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
	//		events.add(visitor.prettyPrint(event))
		}
		
		return String.join('\n', events)
	}
	
	def String writeEnsure() {
		//TODO
	}
	
	def String writeForbidden() {
		// TODO
	}
	
	def String writeOrder() {
		//TODO
	}
	
	def String writeRequire() {
		val requires = new ArrayList<String>
		val visitor = new CodeWriterVisitor()
		requires.add('\nREQUIRES\n')
		for(require: spec.requireSpec.requires) {
//			requires.add(visitor.prettyPrint(require))
		}
		
		return String.join('\n', requires)
	}
	
	def String writeObjects() {
		val objects = new ArrayList<String>
		objects.add('\nOBJECTS\n')
		
		// TODO: refactor to use visitor
		for(object: spec.objectSpec.objects) {
			val type = object.objectType
			val name = object.objectName
			val obj = type + ' ' + name + ';'
			objects.add(obj)
		}
		
		return String.join("\n", objects)
	}
	
	def String writeEnsures() {
		val ensures = new ArrayList<String>
		val visitor = new CodeWriterVisitor()
		ensures.add('\nENSURES\n')
		
		for(e: spec.ensureSpec.ensures) {
			ensures.add(visitor.prettyPrintEnsures(e))
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
		
		
		pw.close()
	}
}