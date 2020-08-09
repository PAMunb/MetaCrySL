package br.unb.cic.mcsl.tests

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Ignore

@RunWith(XtextRunner)
@InjectWith(MetaCrySLInjectorProvider)
class MetaCrySLParsingTest extends MetaCrySLAbstractTests {
		@Test
	def void basicModel() {
		val file = super.readFileIntoString(BR_UNB_CIC_METACRYSL_TESTS_FILES + "basicModel.cryptsl")
		
		val result = super.parseHelper.parse(file)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
	@Test
	def void basicModelWithAdditionalConstraintsClause() {
		val file = super.readFileIntoString(BR_UNB_CIC_METACRYSL_TESTS_FILES + "basicModelWithAdditionalConstraintsClause.cryptsl")
		
		val result = super.parseHelper.parse(file)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
	@Test
	def void basicModelWithOrderClause() {
		val file = super.readFileIntoString(BR_UNB_CIC_METACRYSL_TESTS_FILES + "basicModelWithOrderClause.cryptsl")
		
		val result = super.parseHelper.parse(file)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
	@Test
	def void basicModelWithConstraintsClause() {
		val file = super.readFileIntoString(BR_UNB_CIC_METACRYSL_TESTS_FILES + "basicModelWithConstraintsClause.cryptsl")
		
		val result = super.parseHelper.parse(file)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
	@Test
	def void basicModelWithForbiddenClause() {
		val file = super.readFileIntoString(BR_UNB_CIC_METACRYSL_TESTS_FILES + "basicModelWithForbiddenClause.cryptsl")
		
		val result = super.parseHelper.parse(file)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
	@Test
	def void basicModelWithEnsures() {
		val file = super.readFileIntoString(BR_UNB_CIC_METACRYSL_TESTS_FILES + "basicModelWithEnsures.cryptsl")
		
		val result = super.parseHelper.parse(file)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
	@Test
	def void basicModelWithTypeObject() {
		val file = super.readFileIntoString(BR_UNB_CIC_METACRYSL_TESTS_FILES + "basicModelWithTypeObject.cryptsl")
		
		val result = super.parseHelper.parse(file)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
	@Test
	def void basicModelWithoutAbstract() {
		val file = super.readFileIntoString(BR_UNB_CIC_METACRYSL_TESTS_FILES + "basicModelWithoutAbstract.cryptsl")
		
		val result = super.parseHelper.parse(file)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
	@Test
	def void basicModelWithRequires() {
		val file = super.readFileIntoString(BR_UNB_CIC_METACRYSL_TESTS_FILES + "basicModelWithRequires.cryptsl")
		
		val result = super.parseHelper.parse(file)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
	
	@Test
	def void basicRefinement() {
		val file = super.readFileIntoString(BR_UNB_CIC_METACRYSL_TESTS_FILES + "basicRefinement.cryptsl")
		
		val result = super.parseHelper.parse(file)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
}
