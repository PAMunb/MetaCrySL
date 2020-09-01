package br.unb.cic.mcsl.tests

import br.unb.cic.mcsl.generator.MetaCrySLGenerator
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import br.unb.cic.mcsl.metaCrySL.Refinement
import org.junit.Assert


@RunWith(XtextRunner)
class MetaCrySLGeneratorTest {
	
	@Test
	def void loadModel() {
		val config = URI.createURI("./test-resources/cryptsl-files/basicConfig.config").path
		val generator = new MetaCrySLGenerator
		generator.generateCode(config)
	}
	
	@Test
	def void parseRefinement() {
		val ref = URI.createURI("./test-resources/cryptsl-files/basicRefinement.ref").path
		val generator = new MetaCrySLGenerator
		val parsedRef = generator.parseRefinement(ref)
		Assert.assertNotNull(parsedRef.type)
	}
	
}