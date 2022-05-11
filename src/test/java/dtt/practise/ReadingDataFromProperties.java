package dtt.practise;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;


public class ReadingDataFromProperties {

	
	@Test
	
	public void ReadingDataProperties() throws Throwable
	{
	//step=1 read the java representation object of the physical file
		FileInputStream fis=new FileInputStream("./data./Userdata.properties");
		
	//step=2 create object of properties class and load all the key:value pairs
		Properties pobj=new Properties();
		pobj.load(fis);
		
	//step=3 read the value by using getpropert("key")
		String URL=pobj.getProperty("url");
		String UN=pobj.getProperty("un");
		String PWD=pobj.getProperty("pwd");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
	}
		

	

}
