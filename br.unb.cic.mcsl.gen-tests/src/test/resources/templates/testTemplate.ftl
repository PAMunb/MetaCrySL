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
	<#list rules as rule>
	@Test
	def void ${rule.name}() {
		val file = super.readFileIntoString(BR_UNB_CIC_METACRYSL_TESTS_FILES + "${rule.fileName}")
		
		val result = super.parseHelper.parse(file)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
	</#list>
}
