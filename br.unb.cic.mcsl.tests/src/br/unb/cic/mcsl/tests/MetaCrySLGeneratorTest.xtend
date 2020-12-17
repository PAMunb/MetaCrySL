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
	def void generateFiles() {
		val config = URI.createURI("./test-resources/cryptsl-files/basicConfig.config").path
		val generator = new MetaCrySLGenerator
		val specs = generator.generateCode(config)
		generator.compile(specs)
	}

	@Test
	def void testAndroidBsi0108() {
		val config = URI.createURI("./test-resources/android-bsi/config/Android0108.config").path
		val generator = new MetaCrySLGenerator
		val specs = generator.generateCode(config)
		generator.compile(specs)
	}
	
	@Test
	def void testAndroidBsi0116() {
		val config = URI.createURI("./test-resources/android-bsi/config/Android0116.config").path
		val generator = new MetaCrySLGenerator
		val specs = generator.generateCode(config)
		generator.compile(specs)
	}
	
	@Test
	def void testAndroidBsi25plus() {
		val config = URI.createURI("./test-resources/android-bsi/config/Android25plus.config").path
		val generator = new MetaCrySLGenerator
		val specs = generator.generateCode(config)
		generator.compile(specs)
	}
	
	@Test
	def void testAndroidCc0108() {
		val config = URI.createURI("./test-resources/android-cc/config/Android0108.config").path
		val generator = new MetaCrySLGenerator
		val specs = generator.generateCode(config)
		generator.compile(specs)
	}
	
	@Test
	def void testAndroidCc0116() {
		val config = URI.createURI("./test-resources/android-cc/config/Android0116.config").path
		val generator = new MetaCrySLGenerator
		val specs = generator.generateCode(config)
		generator.compile(specs)
	}
	
	@Test
	def void testAndroidCc25plus() {
		val config = URI.createURI("./test-resources/android-cc/config/Android25plus.config").path
		val generator = new MetaCrySLGenerator
		val specs = generator.generateCode(config)
		generator.compile(specs)
	}
}