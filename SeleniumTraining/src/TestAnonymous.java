public class TestAnonymous {
	
	
	
	public static void main(String args[])
	{
		
		Maths m = new Maths()
		{
		public void display()
		{
			System.out.println("Hello");
			System.out.println("Hello1");
		}
		};
		//TestAnonymous a= new TestAnonymous();
		m.display();
		
	}
}