package ThreadDeadLockCreation;

public class ThreadName1 implements Runnable {

	private Object object1;
	private Object object2;

	ThreadName1(Object object1, Object object2) {
		this.object1 = object1;
		this.object2 = object2;
	}

	@Override
	public void run() {

		synchronized (object1) {
			 /* Adding sleep() method so that
            Thread 2 can lock ObjectLock2 */
			System.out.println("Thread 1 : Acquire lock on ObjectLock1 & waiting for object2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 1: Waiting for ObjectLock 2");
			/*Thread 1 has ObjectLock1 
            but waiting for ObjectLock2*/
			synchronized (object2) {
				System.out.println("Thread 1 : Acquire lock on object1 & Object2");
			}
		}
	}

}
