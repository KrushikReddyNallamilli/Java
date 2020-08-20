class MyProgram extends Thread
{
      public void run()
      {
            for(int i=5;i>0;i--)
            {
                  System.out.println("from child thread:"+i);
                  try{
                           Thread.sleep(1000);
                       }catch(InterruptedException ie){}
             }
       }
}
class MultiThreadModel
{
       public static void main(String args[])
       {
              //creating object of thread
              MyProgram mp1=new MyProgram();
             //starting of execution of run() method
             mp1.start();
             
             for(int j=5;j>0;j--)
              {
                      System.out.println("from main thread:"+j);
                      try{
                              Thread.sleep(1000);
                           }catch(InterruptedException ie){}
               }
        }
}