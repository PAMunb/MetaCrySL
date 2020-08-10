package br.unb.cic.mcsl.test.plugin;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.Mojo;
import org.apache.maven.plugin.MojoExecutionException;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

/**
 * TestCase generator for MetaCrySL
 *
 * @goal gentest
 * 
 * @phase process-sources
 */
public class MCSLTestGenerationPlugin extends AbstractMojo
{
	private static final String CLASS_NAME = "GeneratedMetaCrySLParsingTest.xtend";
    /**
     * Location of the CrySL rules.
     * @parameter property="${project.build.input}"
     * @required
     */
    private File inputDirectory;

    /**
     * Location of the output directory.
     * @parameter property="${project.build.output}"
     * @required
     */
    private File outputDirectory;

    private List<TestObject> rules;

    public void execute()  throws MojoExecutionException
    {
        File f = inputDirectory;

        if (f.exists() && f.isDirectory())
        {
        	Map<String, Object> input = new HashMap<String, Object>();
        	rules = new ArrayList<TestObject>();
            
            Configuration cfg = new Configuration();
            cfg.setClassForTemplateLoading(MCSLTestGenerationPlugin.class, "/templates");
            // Configuration
            cfg.setIncompatibleImprovements(new Version(2, 3, 20));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setLocale(Locale.US);
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            
            
            for(File aFile: f.listFiles()) {
            	rules.add(new TestObject(aFile.getName(), aFile.getAbsolutePath()));
            }
            input.put("rules", rules);
            try {
            	Template template = cfg.getTemplate("testTemplate.ftl");
            	File absolutePath = new File(outputDirectory.getAbsoluteFile() + "/br/unb/cic/mcsl/tests/");

            	if(!absolutePath.exists()) {
            	    absolutePath.mkdirs();
                }

            	if(absolutePath.isDirectory()) {
                    Writer fileWriter = new FileWriter(new File(absolutePath.getAbsoluteFile() + "/" + CLASS_NAME));
                    template.process(input, fileWriter);
                    fileWriter.close();
                }
            	else {
                    throw new MojoExecutionException("Could not generate code at" + absolutePath.getAbsolutePath());
                }
            } catch (Exception e) {
            	throw new MojoExecutionException(e.getMessage());
            }
        }
        else {
            throw new MojoExecutionException("Invalid path : " + f.getAbsolutePath());
        }
    }

    public List<TestObject> getRules() {
        return rules;
    }
}
