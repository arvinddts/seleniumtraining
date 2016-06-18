package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
//	@Test 
//	@Parameters({"SearchData1","SearchData2"})
//	  public void EnterSearchData1(String value1,String value2) {
//		  System.out.println("Came to Search Data in IE ..."+value1+" =  "+value2);
//		  Assert.assertTrue(true, "this is not correct");
//	  }
//	@Test 
//	@Parameters({"SearchData1"})
//	  public void EnterSearchData2(String value) {
//		  System.out.println("Came to Search Data in IE ..."+value);
//		  Assert.assertTrue(false, "this is not correct");
//	  }
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][]{{"admin", 1}, {5, 2},{"admin", 3}};
	}
	@Test(dataProvider="getData")
	public void instanceDbProvider(Object p1, int p2) {
		
		System.out.println("Instance DataProvider Example: Data(" + p1 + ", " + p2 + ")");
		
	}
}
