/*
 * generated by Xtext 2.22.0
 */
package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.MetaCrySLStandaloneSetup
import br.unb.cic.mcsl.metaCrySL.Configuration
import br.unb.cic.mcsl.metaCrySL.Model
import com.google.inject.Inject
import java.io.FileReader
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.parser.IParseResult
import org.eclipse.xtext.parser.IParser
import br.unb.cic.mcsl.metaCrySL.Refinement
import br.unb.cic.mcsl.metaCrySL.Spec
import java.util.HashMap;
import java.util.ArrayList
import java.util.Optional

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MetaCrySLGenerator extends AbstractGenerator {

	@Inject
	private IParser parser;
	
	// hashmap to associate each SPEC to a merged set of refinements
	private HashMap<String, ArrayList<String>> specRefs = new HashMap<String, ArrayList<String>>
	// list with all refs to be parsed
	private ArrayList<String> refs = new ArrayList<String>
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	}
	
	def void mergeRefinements() {
		// TODO: receives a list of refinements modules and returns one module with all merged
	}
	
	def Optional<String> getExtensionByStringHandling(String filename) {
	    return Optional.ofNullable(filename)
	      .filter(f | f.contains("."))
	      .map(f | f.substring(filename.lastIndexOf(".") + 1));
	}
	
	
	def void generateCode(String configuration) {
		println(configuration)
		val config = parseConfiguration(configuration)
		val src = config.inputDir
		
		val modules = config.modules
		
		for(m: modules) {
			println(src + m.module)
			
			// get all files with .cryptsl and add to HashMap with empty list
			if(getExtensionByStringHandling(m.module).get() == 'cryptsl') {
				println(getExtensionByStringHandling(m.module).get())
				
				specRefs.put(m.module, new ArrayList<String>)
				println("Initialize a new specRefs entry with a empty set")
			}
			else if(getExtensionByStringHandling(m.module).get() == 'ref') {
				// append to list of refs
				refs.add(m.module)
			}			
		}
			// iterate over specRefs
		for(String key: specRefs.keySet()) {
			val spec = parseSpec(src + key)
			println('parsed SPECs')
			println(spec)
			// TODO: parse key (with is the SPEC)
			refs.forEach(ref |
				// TODO: parse each ref. If it's equal to current spec class, append to it and remove from refs
				println(ref)
			)
		}
		println(specRefs)
		println(refs)
		
		// TODO: call the generator procedure
	}
	
	protected def Configuration parseConfiguration(String configuration) {
		val path = Paths.get(configuration)
		
		if(!Files.exists(path)) {
			throw new RuntimeException("The configuration file does not exist " + path)
		}
		
		setupParser()
		
		val result = parser.parse(new FileReader(configuration))
		
		if(result.syntaxErrors.size > 0) {
			throw new RuntimeException("Parser error: " + result.syntaxErrors)
		}
		(result.rootASTElement as Configuration).configuration
	}
	
	protected def Refinement parseRefinement(String refinement) {
		// TODO: implement parser for refinement files
	}
	
	protected def Spec parseSpec(String spec) {
		// TODO: implement parser for spec rules
		val path = Paths.get(spec)
		
		if(!Files.exists(path)) {
			throw new RuntimeException("The spec file does not exist " + path)
		}
		
		setupParser()
		
		val result = parser.parse(new FileReader(spec))
		
		if(result.syntaxErrors.size > 0) {
			throw new RuntimeException("Parser error: " + result.syntaxErrors)
		}
		(result.rootASTElement as Spec)
	}
	
	def void setupParser() {
        val injector = new MetaCrySLStandaloneSetup().createInjectorAndDoEMFRegistration()
        injector.injectMembers(this)
    }
}
