package dtt.practise;


import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadDtafromjson {

	@Test
	public void readdatafromjson() throws Throwable
	{
	//step=1 convert json file into json object
		FileReader fl=new FileReader("./data./Userdata.json");
		
	//step=2 convert json object into java object
		JSONParser js=new JSONParser();
		Object obj=js.parse(fl);
		
	//step=3 read the data byusing hashmap
		HashMap obje=(HashMap)obj;
		Object URL=obje.get("url");
		System.out.println(URL);
	}
	
}
