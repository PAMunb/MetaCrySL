package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.metaCrySL.util.MetaCrySLSwitch
import br.unb.cic.mcsl.metaCrySL.BaseSpecType

class CollectSpecTypeVisitor extends MetaCrySLSwitch<String> {
	
	override String caseBaseSpecType(BaseSpecType object) {
		return object.typeName
	}
	
}