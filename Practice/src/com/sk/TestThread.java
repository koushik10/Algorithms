package com.sk;


/* 
 * Example thread showing thread creation by extending the Thread class.
 * Shows how the thread is handled
 * Shows how the join() works
 */
public class TestThread extends Thread{
	
	public void run(){
		for(int i=1;i<5;i++){
			try{
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	
	public static void main(String args[]) throws InterruptedException {
		
		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();
		TestThread t3 = new TestThread();
		
		t1.start();
		
		//try{
			t1.join(1500);
	//	}catch(Exception e){
		//	System.out.println(e);
	//	}
		t2.start();
		t3.start();
	}
}
