package com.sk;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Thread pool by implementing runnable interface
 * Usage of Executor service and executors to execute worker threads
 */



public class TestThreadPool {
	
	public static void main(String args[]){
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=0; i< 10; i++){
		Runnable worker = new WorkerThread("" +i);
		executor.execute(worker);
		}
		
		executor.shutdown();
		while(!executor.isTerminated()){}
		
	System.out.println("finished all threads");

	}
}

class WorkerThread implements Runnable{

	
	public String message;
	public WorkerThread(String s){
		this.message = s;
	}
	
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) + message" + message);
		processMessage();
		System.out.println(Thread.currentThread().getName() + " (End)");	
	}
	
	public void processMessage(){
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
}
