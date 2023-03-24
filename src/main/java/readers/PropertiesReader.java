package readers;

import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
private Properties prop;
	
	
	public PropertiesReader() {
		FileHelper fileHelper = new FileHelper();
		prop = new Properties();
		try {
			prop.load(fileHelper.getConfigFile());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//getting the name of browser from configuration file
	public String fetchBrowserName() {
		return prop.getProperty("browser");
	}
	
	//getting explicit wait information from configuration file
	public int fetchExplicitWait() {
		return Integer.parseInt(prop.getProperty("explicitWait"));
	}
	
	//getting the url from configuration file
	public String fetchUrl() {
		return prop.getProperty("url");
	}
	
	//getting excel file name from configuration file
	public String fetchExcelFileName() {
		return prop.getProperty("excelFileName");
	}

}
