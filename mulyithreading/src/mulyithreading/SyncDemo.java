package mulyithreading;

public class SyncDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		print(name);
		
	}
	
	private synchronized void print(String name)//before using sync all thread work simultaneously but when use sync we execute thread separately
	{
		try {
			System.out.print("[");
			Thread.sleep(1000);
			System.out.print(name);
			Thread.sleep(1000);
			System.out.println("]");
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SyncDemo sd=new SyncDemo();
		
		Thread t1=new Thread(sd,"alfa");
		Thread t2=new Thread(sd,"beta");
		Thread t3=new Thread(sd,"gama");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
