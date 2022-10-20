package practiceDDT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class READdataJSONTest1 {
	public static void main(String[] args) throws Throwable {
		//Step1 convert JSON file into JSON object
		
			FileReader fr=new FileReader("./commonjack.json");
			
			
			//Step2 JSON object into java object
			JSONParser jp= new JSONParser();
			Object jobj= jp.parse(fr) ;
			
			//Step3Use hashmap to read data
			HashMap hp = (HashMap)jobj;
			String value = (String)hp.get("url");
			System.out.println(value);
		
		}
		
	}
	

