package br.unb.cic.mcsl.tests;

import javax.inject.Inject;

import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.unb.cic.mcsl.MetaCrySLStandaloneSetup;
import br.unb.cic.mcsl.metaCrySL.Model;


@RunWith(XtextRunner.class)
@InjectWith(MetaCrySLInjectorProvider.class)
public class BaseTests extends AbstractXtextTests {
	@Inject
	private ParseHelper<Model> parser;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		with(MetaCrySLStandaloneSetup.class);
	}	
	@Test
	public void test() throws Exception {
		Model parsedModel = parser.parse("ABSTRACT SPEC com.google.crypto.tink.Mac");		
		assertNotNull(parsedModel);
		parsedModel.eResource().getErrors();
		//EObject model = getModel("ABSTRACT SPEC com.google.crypto.tink.Mac");
		//getModelAndExpect("ABSTRACT SPEC com.google.crypto.tink.Mac", 0);
		//getParseResult("ABSTRACT SPEC com.google.crypto.tink.Mac");
		//Assert.assertNotNull(model);
	}

}
