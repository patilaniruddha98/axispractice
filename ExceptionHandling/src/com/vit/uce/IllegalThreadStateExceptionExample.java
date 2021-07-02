package com.vit.uce;


class ThRun implements Runnable		    //implementing the Runnable interface
{


	public void run()  //Entry point of new thread
	{
		for(int i=0;i<5;i++)
		{	
			System.out.println(i);	
		}
	}

}



	public class IllegalThreadStateExceptionExample {
		public static void main(String args[]){
		{
			ThRun newTh= new ThRun();
			Thread th= new Thread(newTh, "Thread2");    //Calling Thread's constructor & passing the object
			//of class that  implemented  Runnable interface
			//& the name of new thread.

			//Stating the thread(Thread2).
			th.start();

			//Starting thread(Thread2) again, when it's already running, causing IllegalStateException.
			th.start();	

			//This won't be printed because the main thread is halted by IllegalStateException
			System.out.println("Main Thread"); 
		}
	}

}