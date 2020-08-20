package br.unb.cic.mcsl.tests

import br.unb.cic.mcsl.generator.MetaCrySLGenerator
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
class MetaCrySLGeneratorTest {
	
	@Test
	def void loadModel() {
		val config = URI.createURI("./test-resources/cryptsl-files/basicConfig.config").path
		val generator = new MetaCrySLGenerator
		generator.generateCode(config)
	}
	
}