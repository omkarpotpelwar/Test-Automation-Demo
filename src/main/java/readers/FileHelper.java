package readers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileHelper {
	
	//method to get base path to the project
	public static String getBasePath() {
		return System.getProperty("user.dir");
	}
	
	//method to get path to the properties file
	public String getMainResourceConfig() {
		return getBasePath() + "//src//configuration.properties";
	}
	
	//returning the configuration file in binaries
	public InputStream getConfigFile() throws FileNotFoundException {
		return new FileInputStream(getMainResourceConfig());
	}

}
