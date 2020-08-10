package br.unb.cic.mcsl.test.plugin;
import org.apache.commons.io.FilenameUtils;


public class TestObject {
	private String name;
	private String path;
	private String fileName;
	
    public TestObject(String fileName, String path) {
        this.name = FilenameUtils.removeExtension(fileName);
        this.path = FilenameUtils.getFullPath(path);
        this.fileName = fileName;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }
    
    public String getFileName() {
    	return fileName;
    }
}
