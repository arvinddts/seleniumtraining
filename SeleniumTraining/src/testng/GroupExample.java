package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupExample {
	String message = ".com";
	

	@Test(priority=2)	   
	   public void testPrintMessage() {
	      System.out.println("Inside functest and checkintest");
	      Assert.assertEquals(message, ".com");
	   }

	
	@Test(priority=1)	   
	   public void testSalutationMessage() {
		   System.out.println("Inside checkintest");
		   Assert.assertEquals(message, ".com");
	   }

	@Test(priority=3)	   
	   public void testingExitMessage() {
		   System.out.println("Inside functest");
		   Assert.assertEquals(message, ".com");
	   }  
}
