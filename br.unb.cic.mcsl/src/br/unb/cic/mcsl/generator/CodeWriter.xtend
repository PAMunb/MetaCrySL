package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.Spec
import java.io.PrintWriter

class CodeWriter {
	var Spec spec
	var String typeName
	
	new(Spec spec) {
		this.spec = spec
		this.typeName = spec.classType.typeName
	}
	
	def String writeHeader()'''
		ABSTRACT SPEC «this.typeName»
	'''
	
	def void generate() {
		val pw = new PrintWriter("out.crysl", "UTF-8")
		pw.println(writeHeader())
	}
}