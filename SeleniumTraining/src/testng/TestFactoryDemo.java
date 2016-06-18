package testng;

import org.testng.annotations.Factory;
 

public class TestFactoryDemo {
	@Factory
    public Object[] factoryMethod() {
        return new Object[] { 
                                new FactoryTest("arvind"), 
                                new FactoryTest("nirmala") 
                            };
    }
}
