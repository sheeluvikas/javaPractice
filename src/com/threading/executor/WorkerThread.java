package com.threading.executor;

public class WorkerThread implements Runnable{
	
	private String command;
	public WorkerThread(String s){
		this.command = s;
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName() + "Start. Command = "+
				command);
		processCommand();
		System.out.println(Thread.currentThread().getName()+" End.");
	}
	
	public synchronized void processCommand(){
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "WorkerThread [command=" + command + "]";
	}
}
