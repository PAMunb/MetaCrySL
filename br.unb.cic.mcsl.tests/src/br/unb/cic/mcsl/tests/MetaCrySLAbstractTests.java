package br.unb.cic.mcsl.tests;

import javax.inject.Inject;

import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.Before;
import org.junit.runner.RunWith;

import br.unb.cic.mcsl.MetaCrySLStandaloneSetup;
import br.unb.cic.mcsl.metaCrySL.Model;


@RunWith(XtextRunner.class)
@InjectWith(MetaCrySLInjectorProvider.class)
public class MetaCrySLAbstractTests extends AbstractXtextTests {
	
	@Inject
	ParseHelper<Model> parseHelper;
	 
	protected static final String BR_UNB_CIC_METACRYSL_TESTS_FILES = "br/unb/cic/mcsl/tests/files/";	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		with(MetaCrySLStandaloneSetup.class);
	}	

}
