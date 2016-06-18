public class  SingleTon {
   public static SingleTon instance = null;
   private SingleTon() {       
   }
   public static SingleTon getInstance() {
      if(instance == null) {
    	 System.out.println("New Object"); 
         instance = new SingleTon();
      }
      else
      {
    	  System.out.println("Old Object");
      }
      return instance;
   }
   
   public void display()
   {
	   System.out.println("Singleton Display");
   }
}