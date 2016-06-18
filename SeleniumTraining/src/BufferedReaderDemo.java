import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Properties;
 
 

public class BufferedReaderDemo {

	 public static void main(String[] args) throws Exception {

		 String  thisLine = null;
		 BufferedReader br=null;
		 BufferedWriter bw=null;
		 PrintWriter pwf=null;
		 PrintWriter pwc=null;
		 PrintWriter pwfw=null;

		 File f = new File("/Users/arvind/Documents/filetestnew.txt");
		 File f1 = new File("/Users/arvind/Documents/filetestfw.txt");
//		 if(f.exists())
//			 f.delete();
		 try{
			 
			 pwf = new PrintWriter(f);
			 
			 pwc= new PrintWriter(System.out);
			 pwfw= new PrintWriter(new FileWriter(f1,true));
			 
			 //	    	 bw= new BufferedWriter(new FileWriter(f)); 
			 //	         // open input stream test.txt for reading purpose.
			 br= new BufferedReader(new FileReader(new File("/Users/arvind/Documents/filetest.txt")));
			 while ((thisLine = br.readLine()) != null) {
				 pwf.println(thisLine);
				 pwc.println(thisLine);
				 pwfw.println(thisLine);
				 
			 }  
			 pwf.close();
			 pwc.close();
			 pwfw.close();
			 
			
			 //	         br.close();
			 //	         bw.close();

	    	 
	      }catch(Exception e){
	         e.printStackTrace();
	      }
	   }

}
