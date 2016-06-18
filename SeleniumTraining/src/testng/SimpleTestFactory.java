package testng;

import org.testng.annotations.Factory;

public class SimpleTestFactory
{
    @Factory
    public Object[] factoryMethod() {
        return new Object[] { new FactorySample(0), new FactorySample(1) };
    }
}