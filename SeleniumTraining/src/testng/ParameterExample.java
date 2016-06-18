package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
  
  @Test
  @Parameters({ "username", "password" , "capta"})
  public void displayParameters(String user,String pass,String capta) {
	  System.out.println(user+"="+pass+"="+capta);
  }
}
