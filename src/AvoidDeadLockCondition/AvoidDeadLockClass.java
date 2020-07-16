package AvoidDeadLockCondition;

public class AvoidDeadLockClass {
	
	public static void main(String[] args) {
		Object object1=new Object();
		Object object2=new Object();
		ThreadNameFirst threadName1=new ThreadNameFirst(object1, object2);
		ThreadNameFirst threadName2=new ThreadNameFirst(object1, object2);
		
		Thread t1=new Thread(threadName1);
		t1.start();
		
		Thread t2=new Thread(threadName2);
		t2.start();
	}
	
/***
OutPut:
Thread-0 : Acquire lock on Object1
Thread-1 : Acquire lock on Object1
Thread-0 : Acquire lock on Object2
Thread-1 : Acquire lock on Object2
*/

}
