class PrintDemo {
   public synchronized static void printCount(String threadName){
    try {
         for(int i = 20; i > 0; i--) {
            System.out.println(threadName+" Counter   ---   "  + i );
         }
     } catch (Exception e) {
         System.out.println("Thread  interrupted.");
     }
   }
   
   public synchronized static void printCount2(String threadName){
	    try {
	         for(int i = 1; i < 20; i++) {
	            System.out.println(threadName+" Counter   ---   "  + i );
	         }
	     } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	     }
	   }

}

class ThreadDemo extends Thread {
   private Thread t;
   private String threadName;
   PrintDemo  PD;

   ThreadDemo( String name,  PrintDemo pd){
       threadName = name;
       PD = pd;
   }
   public void run() {
      
        PD.printCount(threadName);
        PD.printCount2(threadName);
     
     System.out.println("Thread " +  threadName + " exiting.");
   }

   public void start ()
   {
      System.out.println("Starting " +  threadName );
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }
   }

}

public class TestThread {
   public static void main(String args[]) {

      PrintDemo PD = new PrintDemo();

      ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
      ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );

      T1.start();
      T2.start();

      // wait for threads to end
  
   }
}