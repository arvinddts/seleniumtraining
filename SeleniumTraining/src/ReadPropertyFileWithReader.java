import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class ReadPropertyFileWithReader {

	public static void main(String[] args) throws IOException {
		
		//Read File
/*		FileReader fread= new FileReader("C:/Selenium/SeleniumTraining/src/setup.properties");		
		BufferedReader br= new BufferedReader(fread);
		HashMap<String,String> systemProperties = new HashMap<String,String>();
		String thisLine=null;
		while ((thisLine = br.readLine()) != null)
		{
			String keyvalue[]=thisLine.split(";");
		//	pwfw.println(keyvalue[0]+":"+keyvalue[1]); 
			systemProperties.put(keyvalue[0], keyvalue[1]); 
		}
		
		System.out.println(systemProperties.get("url"));
		/*	String keyvalue[]=thisLine.split("=");
			pwfw.println(keyvalue[0]+":"+keyvalue[1]); 
			systemProperties.put(keyvalue[0], keyvalue[1]); 
*/		
		FileReader fread= new FileReader("C:/Selenium/SeleniumTraining/src/setup.properties");		
		BufferedReader br= new BufferedReader(fread);	 
		
		//Write File
	FileWriter fwrite= new FileWriter("C:/Selenium/SeleniumTraining/src/configure.properties");
		PrintWriter pwfw= new PrintWriter(fwrite);
		
		String thisLine=null;
	//	HashMap<String,String> systemProperties = new HashMap<String,String>();
		while ((thisLine = br.readLine()) != null)
		{
			//System.out.println(thisLine);
		 	String keyvalue[]=thisLine.split("=");
			pwfw.println(keyvalue[0]+":"+keyvalue[1]); 
		//	systemProperties.put(keyvalue[0], keyvalue[1]); 
		}
		pwfw.println("fds;lfsdfkd;lfkdfkds;lfskdf");
		pwfw.println("Arvind going to hyderabad");
		
		br.close();
		pwfw.close();
	//	System.out.println(systemProperties.get("domainlocation"));
		 
		}

	}


