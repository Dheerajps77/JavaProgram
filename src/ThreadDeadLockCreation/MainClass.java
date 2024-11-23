package ThreadDeadLockCreation;

public class MainClass {
	
	public static void main(String[] args) {
		Object object1=new Object();
		Object object2=new Object();
		ThreadName1 thread1=new ThreadName1(object1, object2);
		ThreadName2 thread2=new ThreadName2(object1, object2);
		
		Thread t1=new Thread(thread1);
		t1.start();
		Thread t2=new Thread(thread2);		
		t2.start();
	}
	
/***
OutPut : 
Thread 1 : Acquire lock on ObjectLock1 & waiting for object2
Thread 2 : Acquire lock on ObjectLock2 & waiting for object1
Thread 1: Waiting for ObjectLock 2
Thread 2: Waiting for ObjectLock 1

*/
}
