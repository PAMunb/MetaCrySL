package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.Spec
import java.io.PrintWriter
import br.unb.cic.mcsl.metaCrySL.impl.ConstraintImpl
import java.util.List
import br.unb.cic.mcsl.metaCrySL.impl.RelationalExpImpl
import br.unb.cic.mcsl.metaCrySL.impl.ConjunctionExpImpl
import br.unb.cic.mcsl.metaCrySL.impl.DisjunctionExpImpl

class CodeWriter {
	var Spec spec
	var String typeName
	var List<ConstraintImpl> constraints
	
	new(Spec spec) {
		this.spec = spec
		this.typeName = spec.classType.typeName
	}
	
	def String writeConstraint() {
		val visitor = new CodeWriterVisitor()
		
		for(c: spec.constraintSpec.constraints) {
			visitor.doSwitch(c.exp.booleanExp)
			println(visitor.left)
			println(visitor.operator)
			println(visitor.right)
		}
		
		return null
	}
	
	def String writeHeader()'''
		ABSTRACT SPEC «this.typeName»
	'''
	
	def String writeConstraints() {
		val c = writeConstraint()
		return 'CONSTRAINT'	
	}
	
	def String writeEvents()'''
		EVENTS
	'''
	
	def String writeEnsure()'''
		ENSURES
	'''
	
	def String writeForbidden()'''
		FORBIDDEN
	'''
	
	def String writeOrder()'''
		ORDER
	'''
	
	def String writeRequire()'''
		REQUIRES
	'''
	
	def String writeObjects()'''
		OBJECTS
	'''
	
	def void generate() {
		val pw = new PrintWriter("out.crysl", "UTF-8")
		pw.println(writeHeader())
		pw.println(writeObjects())
		pw.println(writeEvents())
		pw.println(writeOrder())
		pw.println(writeConstraints())
		
		
		pw.close()
	}
}