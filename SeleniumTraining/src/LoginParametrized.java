import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LoginParametrized {

    
    private String username; 
    private String password; 
    private String message;   
    
    
    
     
    
    
    
    

    @Parameters 
    public static Collection<String[]> getTestParameters() {
    	
    	return Arrays.asList(new String[][] {
          {"Log in to Facebook","admin","admin"},  
          {"Log in to Facebook","admin",""},  
          {"Log in to Facebook","",""},  
       });
    }

    public LoginParametrized( String message,String username, String password) {    
     
    this.username = username;
    this.password = password;
    this.message=message;
    }

    @Test
    public void testLogin() throws InterruptedException {
    	
    	System.out.println();
    //	Login instance = new Login();     
    	//Login.loginToFacebook(username, password,message);
       //System.out.println(message);
       //assertEquals("Failed Test Case",expected, instance.AddNumbers(firstNumber, secondNumber));
    } 
}