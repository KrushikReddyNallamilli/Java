class NewThread extends Thread
{
       NewThread(String threadname)
      {
              super(threadname);
              System.out.println("New thread:"+this);
              start();
       }
       public void run()
       {
             try
             {
                     for(int i=5;i>0;i--)
                     {
                              System.out.println(getName() +":"+i);
                              Thread.sleep(500);
                      }
              }
              catch(InterruptedException e){} 
              System.out.println(getName()+"exiting.....");
       }
}
class JoinDemo
{
        public static void main(String[] args)
        {
                NewThread ob1=new NewThread("one");
                System.out.println("Thread one is alive:"+ob1.isAlive());
                try
                {
                        System.out.println("Waiting for child thread to finish.....");
                        ob1.join(); // parent thread goes into wait state....
                }
                catch(InterruptedException e){} 
                System.out.println("Thread one is alive:"+ob1.isAlive());
                System.out.println("Main Thread exiting.....");
        }
}
