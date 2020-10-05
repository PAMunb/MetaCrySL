package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.util.MetaCrySLSwitch
import br.unb.cic.mcsl.metaCrySL.Spec
import br.unb.cic.mcsl.metaCrySL.ConjunctionExp
import br.unb.cic.mcsl.metaCrySL.DisjunctionExp
import br.unb.cic.mcsl.metaCrySL.RelationalExp

class CodeWriterVisitor extends MetaCrySLSwitch<Void> {
	Spec spec
	
	new(Spec spec) {
		this.spec = spec
	}
	
	override Void caseConjunctionExp(ConjunctionExp object) {
		println(object)
		return super.caseConjunctionExp(object)
	}
	
	override Void caseDisjunctionExp(DisjunctionExp object) {
		println(object)
		return super.caseDisjunctionExp(object)
	}
	
	override Void caseRelationalExp(RelationalExp object) {
		println(object)
		return super.caseRelationalExp(object)
	}
}