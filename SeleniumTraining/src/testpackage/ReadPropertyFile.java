package testpackage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

 
public class ReadPropertyFile {
	
	public static Properties p=null;
	public static FileReader fr=null;
 	private static String readPropertyFromFile(String key) throws IOException
	{
		p = new Properties();
		fr= new FileReader("C:/Selenium/SeleniumTraining/src/setup.properties");		 
		p.load(fr);
		String value = (String) p.get(key);	
		System.out.println(value);
		return value;
	}  
 	private static void display(String name,int rollno) throws IOException
	{
 		 
		System.out.println("This "+name+" has rollno ="+rollno);
	}  
 	public static void objectRef(Object age,Object name) throws IOException
	{
 		 
		System.out.println(name+" is at "+age);
	}  
 	public static void printLines(int age,String name) throws IOException
	{
 		 
		System.out.println(name+" is at "+age);
	}  
 	public static String getLines() throws IOException
	{
 		 
		return "Iam returning type";
	}  
 	

/*	 	public static void main(String[] args) throws IOException {
	 		System.out.println(readPropertyFromFile("url"));
	 		p.put("name", "arvind");
	 		FileWriter fwrite= new FileWriter("C:/Selenium/SeleniumTraining/src/setup.properties");
	 		p.store(fwrite, "");
	 		 
		
	} */
}

