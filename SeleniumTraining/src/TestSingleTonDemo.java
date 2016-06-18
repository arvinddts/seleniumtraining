import static org.junit.Assert.*;
import org.junit.Test;

   public class TestSingleTonDemo
   {
   @Test
   public void testSingleton()
   {	   
	   SingleTon one = SingleTon.getInstance();
	   System.out.println(one);
	   SingleTon.instance=null;
	   SingleTon two = SingleTon.getInstance();
	   System.out.println(two);
	   assertEquals(one, two);	    
	   
   }
   }

