class Q
{
       int n;
       boolean flag=false;
       synchronized void put(int n)
       {
              while(flag)
              {
                      try
                      {
                               wait();
                      }
                      catch(InterruptedException e){}
              } 
              this.n=n;
              flag=true;
              System.out.println("Put:"+n);
              notify();
       }
       synchronized void get()
       {
               while(!flag)
               {
                       try
                       {
                               wait();
                       }
                       catch(InterruptedException e){}
               }
               System.out.println("Got:"+n);
               flag=false;
               notify(); 
       }
}
class PCDemo
{
        public static void main(String args[])
        {
                 final Q q=new Q();
                 new Thread()
                 {
                         public void run()
                         {
                                   int i=0;
                                   while(i<10)
                                   {
                                             q.put(i++);
                                   }
                         }
                 }
                 .start();
                new Thread()
                {
                         public void run()
                         {
                                 int i=0;
                                 while(i<10)
                                 {
                                         q.get();
                                         i++;
                                 }
                         }
                } 
                .start();
        }
}