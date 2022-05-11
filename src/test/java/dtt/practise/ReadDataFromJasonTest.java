package dtt.practise;

import java.io.FileReader;
import java.util.HashMap;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadDataFromJasonTest {

	@Test
	public void Readdatafromjsontest() throws Throwable
	{
	FileReader fr=new FileReader("./data/Commondata.jason");
	JSONParser js=new JSONParser();
	Object obj=js.parse(fr);
	HashMap hp=(HashMap)obj;
	Object value=hp.get("url");
	System.out.println(value);
	}
	
}
