package br.unb.cic.mcsl.tests

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Ignore
import java.nio.file.Paths
import java.nio.file.Files


@RunWith(XtextRunner)
@InjectWith(MetaCrySLInjectorProvider)
class GeneratedMetaCrySLParsingTest extends MetaCrySLAbstractTests {
	<#list rules as rule>
	@Test
	def void ${rule.name}() {
		val path = Paths.get("${rule.path}" + "/" + "${rule.fileName}")
		val content = String.join("\n", Files.readAllLines(path))
		
		val result = super.parseHelper.parse(content)
		
		val result = super.parseHelper.parse(file)
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
	</#list>
}
