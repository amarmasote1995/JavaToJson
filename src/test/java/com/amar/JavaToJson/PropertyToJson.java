package com.amar.JavaToJson;

import java.io.File;
import java.io.IOException;
import java.util.Date;
 
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;



public class PropertyToJson {
	public void getProp2()
	{
	Set<String> s1 = new HashSet();
	
	
	Properties prop = new Properties();
	try{
		File file1 = new File("amar.properties");
		FileInputStream fileInput = new FileInputStream(file1);
		prop.load(fileInput);
		              // System.out.println(prop.getProperty("user.name"));
                	  // System.out.println(prop.getProperty("ID"));
		              // System.out.println(prop.getProperty("AGE"));
		s1 = prop.stringPropertyNames();
		Iterator iterator = s1.iterator();
		
		while(iterator.hasNext())
		{
		
			String skey = (String) iterator.next();
			String svalue = prop.getProperty(skey);
			             //System.out.println(iterator.next());
			PojoClass pj = new PojoClass(skey,svalue );
			
			ObjectMapper mapper = new ObjectMapper();
		      try
		      {
		    	  mapper.defaultPrettyPrintingWriter().writeValue(new File("c://temp/pj.json"), pj);
		      } catch (JsonGenerationException e)
		      {
		         e.printStackTrace();
		      } catch (JsonMappingException e)
		      {
		         e.printStackTrace();
		      } catch (IOException e)
		      {
		         e.printStackTrace();
		      }
			
		}
        fileInput.close();
	 }
	 catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		
		PropertyToJson dj = new PropertyToJson();
		dj.getProp2();
		
/*		PojoClass pj = new PojoClass("Rohit", "Id1");
		
		ObjectMapper mapper = new ObjectMapper();
	      try
	      {
	    	  mapper.defaultPrettyPrintingWriter().writeValue(new File("c://temp/pj.json"), pj);
	      } catch (JsonGenerationException e)
	      {
	         e.printStackTrace();
	      } catch (JsonMappingException e)
	      {
	         e.printStackTrace();
	      } catch (IOException e)
	      {
	         e.printStackTrace();
	      }
*/	      
	}
    
}
