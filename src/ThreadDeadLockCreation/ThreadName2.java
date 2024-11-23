package ThreadDeadLockCreation;

public class ThreadName2 implements Runnable {

	private Object object1;
	private Object object2;

	ThreadName2(Object object1, Object object2) {
		this.object1 = object1;
		this.object2 = object2;
	}

	@Override
	public void run() {

		synchronized (object2) {
			System.out.println("Thread 2 : Acquire lock on ObjectLock2 & waiting for object1");
			 /* Adding sleep() method so that
            Thread 1 can lock ObjectLock1 */
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 System.out.println("Thread 2: Waiting for ObjectLock 1");
			 /*Thread 2 has ObjectLock2 
             but waiting for ObjectLock1*/
			 synchronized (object1) {
				 System.out.println("Thread 2 : Acquire lock on object1 & Object2");
			}
		}
	}

}
