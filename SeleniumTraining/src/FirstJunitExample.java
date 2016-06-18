import static org.junit.Assert.*;

import org.junit.Test;

public class FirstJunitExample {

    @Test
	public void test() {
		 
		String actual = "Arvind";
		String expected = "Harish";
		
		assertEquals("The two values are not same", expected, actual);
		
	}
	
	 

}
