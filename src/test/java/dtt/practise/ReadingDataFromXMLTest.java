package dtt.practise;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadingDataFromXMLTest {

	@Test
	public void ReadingDataFromxmlTest(XmlTest xml)
	{
		System.out.println("Test execution 1");
		String RX= xml.getParameter("un");
		System.out.println(RX);
		System.out.println(xml.getParameter("url"));
	}
	
}
