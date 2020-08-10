package br.unb.cic.mcsl.test.plugin;

import org.apache.maven.plugin.testing.*;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert.*;

import java.io.File;

public class TestSuite  {

    @Rule
    public MojoRule rule = new MojoRule()
    {
        @Override
        protected void before() throws Throwable
        {
        }

        @Override
        protected void after()
        {
        }
    };

    /**
     * @throws Exception if any
     */
    @Test
    public void mcslTestGeneration() throws Exception
    {
        File pom = new File( "target/test-classes/unit/sample01/pom.xml" );
        Assert.assertNotNull(pom);
        Assert.assertTrue( pom.exists() );

        MCSLTestGenerationPlugin plugin = (MCSLTestGenerationPlugin) rule.lookupMojo( "gentest", pom );
        Assert.assertNotNull( plugin );
        plugin.execute();

        Assert.assertNotNull(plugin.getRules());
        Assert.assertEquals(7, plugin.getRules().size());
    }
}
