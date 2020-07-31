public class DaemonThreadDemo extends Thread
{
         public void run()
         {
                 System.out.println("run() Method Entry....");
                 try
                 {
                         System.out.println("In run() method: currentThread() is"+Thread.currentThread());
                         while(true)
                         {
                                  try
                                  {
                                           Thread.sleep(1000);
                                  }
                                  catch(InterruptedException x){}
                                  System.out.println("In run method..."+Thread.currentThread());
                         }
                 }
                 finally
                 {
                          System.out.println("run() method exit....");
                  }
 }
 public static void main(String[] args)
{
         System.out.println("Main method Entry....");
         DaemonThreadDemo t=new DaemonThreadDemo();
         t.setDaemon(false);
         t.start();
         try
         {
                 Thread.sleep(3000);
         }
         catch(InterruptedException x){}
         System.out.println("Main method exit.....");
    }	
}
         