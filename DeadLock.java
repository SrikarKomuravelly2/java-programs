package DataStructures;

public class DeadLock {
	
	private static final Object lock1= new Object();
	private static final Object lock2= new Object();
	
	
	private static class Thread1 extends Thread
	{
		public void run()
		{
			synchronized (lock1) {
				try
				{
					System.out.println("lock1 is aquired in thread1");
					Thread.sleep(100);
				}
				catch(InterruptedException ex)
				{
					ex.getMessage();
				}
			}
			
			synchronized (lock2) {
				
				System.out.println("waiting for lock2");
				
			}
		}
	}
	
	private static class Thread2 extends Thread
	{
		public void run() {
			synchronized (lock2) {
				
				System.out.println("lock2 is aquired in thread2");
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException ex)
				{
					ex.getMessage();
				}
				
			}
			synchronized (lock1) {
				System.out.println("waiting for lock1");
				
			}
		}
	}

	
	
	public static void main(String[] args) {
		Thread1 t1= new Thread1();
		Thread2 t2= new Thread2();
		
		t1.start();
		t2.start();
	}

}
