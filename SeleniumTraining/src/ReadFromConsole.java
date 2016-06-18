import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {

	public static void main(String[] args) {
		System.out.println("Enter something here : ");
		   
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
		    BufferedReader bufferRead = new BufferedReader(isr);			 
		    String s = bufferRead.readLine();		      
		    System.out.println("My name is : "+s);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
