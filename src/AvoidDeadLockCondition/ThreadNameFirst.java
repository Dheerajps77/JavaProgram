package AvoidDeadLockCondition;

public class ThreadNameFirst implements Runnable{
	
	private Object object1;
	private Object object2;

	ThreadNameFirst(Object object1, Object object2)
	{
		this.object1=object1;
		this.object2=object2;
	}

	@Override
	public void run() {
		synchronized (object1) {
		System.out.println(Thread.currentThread().getName() + " : Acquire lock on Object1");	
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		synchronized (object2) {
			System.out.println(Thread.currentThread().getName() + " : Acquire lock on Object2");	
		}
	}
	
	
}
