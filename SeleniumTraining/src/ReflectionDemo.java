import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import testpackage.ReadPropertyFile;

public class ReflectionDemo {

	public static Properties p=null;
	public static FileReader fr=null;
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException, InstantiationException, NoSuchMethodException, IOException {
		 
		
		p = new Properties();
		fr= new FileReader("C:/Selenium/SeleniumTraining/src/classes.properties");		 
		p.load(fr);
		String className=(String) p.get("class");
		String methodName=(String) p.get("method");
		Class<?> c = Class.forName(className);
		Method  methods[] = c.getDeclaredMethods();
/*	//	ReadPropertyFile rpf=(ReadPropertyFile) c.newInstance();
		
		Field  fields[] = c.getFields();
		System.out.println(fields.length);*/
	//	Method method=c.getDeclaredMethod("display", String.class);	
	//	method.invoke(null,"arvind");
		
	/*	for(Field f: fields)
		{				 
			
		System.out.println(f.getName());
		} */
		
	 	for(Method m: methods)
		{		
			 
			 if(m.getName().equals(methodName))
			{
				m.setAccessible(true);
			//	m.setAccessible(true);
			m.invoke(null,"arvind",30);
			break;
			} 
		//	System.out.println(m.getName());
		} 
	 
	}

}
