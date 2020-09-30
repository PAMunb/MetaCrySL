package br.unb.cic.mcsl.tests

import br.unb.cic.mcsl.generator.MetaCrySLGenerator
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import br.unb.cic.mcsl.metaCrySL.Refinement
import org.junit.Assert
import br.unb.cic.mcsl.generator.MetaCrySLGenerator.ModelType

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
		val parsedRef = generator.genericMetaCrySLParser(ref, ModelType.REFINEMENT) as Refinement
		Assert.assertNotNull(parsedRef.type)
	}
	
	@Test
	def void executeAndroidMessageDigestConfig() {
		val config = URI.createURI("./test-resources/cryptsl-files/jca/configurations/0108.config").path
		val generator = new MetaCrySLGenerator
		val specs = generator.generateCode(config)
		
		Assert.assertEquals(1, specs.size)
		Assert.assertEquals(3, specs.get(0).constraintSpec.constraints.size)
	}
}