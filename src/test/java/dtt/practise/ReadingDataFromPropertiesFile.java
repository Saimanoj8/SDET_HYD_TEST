package dtt.practise;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingDataFromPropertiesFile {

	@Test
	public void readdatatest() throws Throwable
	{
		FileInputStream fis= new FileInputStream("./data./Commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String URL=pobj.getProperty("url");
		String UN=pobj.getProperty("un");
		String PWD=pobj.getProperty("pwd");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
	}
	
	
	
	
}
