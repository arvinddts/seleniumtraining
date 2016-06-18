import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;


public class ReflectionExample {
	
	public void display(String message)
	{
		System.out.println(message);
	}

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, IOException {
		
		Properties p = new Properties();
		FileReader fr= new FileReader("C:/Selenium/SeleniumTraining/src/classes.properties");
		p.load(fr);
		String className=(String) p.get("class");
		System.out.println("Class name loading from file="+className);
		String methodName1=(String) p.get("method1");	
		System.out.println("method name loading from file="+methodName1);
		String methodName2=(String) p.get("method2");	
		System.out.println("method name loading from file="+methodName2);	 
		String methodName3=(String) p.get("method3");	
		System.out.println("method name loading from file="+methodName3);	
		String methodName4=(String) p.get("method4");	
		System.out.println("method name loading from file="+methodName4);	 
		
		Class<?> c = Class.forName(className);
		Method method=c.getDeclaredMethod(methodName2, Object.class,Object.class);	
 	 	method.invoke(null,10,"Arvind");
 	 	method=c.getDeclaredMethod(methodName1, int.class,String.class);	
 	 	method.invoke(null,10,"Arvind");
 	 	method=c.getDeclaredMethod(methodName3, null);	
 	 	String b=(String)method.invoke(null,null);
 	 	System.out.println(b);
 	 	method=c.getDeclaredMethod(methodName4,String.class);	
		Object obj = c.newInstance();
 	 	method.invoke(obj,"Arvind");
 	 	
// 		System.out.println(method.getName());	
 	 	//	Object obj = c.newInstance();
 		//	method.setAccessible(true);
 		//	method.setAccessible(true);
//		method.invoke(null,fileLocation); 
//		Method  methods[] = c.getDeclaredMethods();
 //		Field fields[] = c.getDeclaredFields();
//		
//		
/*		for(Method m: methods)
		{
			if(m.getName().equals("display"))
			{
				System.out.println("Entered");
			//	m.setAccessible(true);
				m.invoke(null, "name","arvind");
			} 
		//	System.out.println(m.getName());
			
		} */
//		for(Field f: fields)
//		{
//			System.out.println("The field name "+f.getName());
//		} 
		
		//StringBuilder sb = new StringBuilder();
//		Class<?> c = Class.forName("com.mkyong.testng.examples.suite.TestConfig");
//		ReflectionExample sb=(ReflectionExample) c.newInstance();			
		// retrieve the method named "append"
		
		
//		System.out.println("Final: " + sb);

	}

}
