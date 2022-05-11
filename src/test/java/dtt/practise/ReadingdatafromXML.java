package dtt.practise;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadingdatafromXML {

	@Test
	public void ReadXml(XmlTest xml)
	{
		System.out.println("test executin one");
		String st=xml.getParameter("url");
		String UN=xml.getParameter("un");
		String PWD=xml.getParameter("pwd");
		System.out.println(UN);
		System.out.println(PWD);
		System.out.println(st);
	}
	
}
