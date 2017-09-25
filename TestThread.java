package com.basic.ganesh.hasingExamples;

public class TestThread extends Thread{
	public int count;
	
	public void run(){
		count++;
		
	}
	
	public static void main(String[] args){
		
		TestThread testThread = new TestThread();
		testThread.start();
		System.out.println(testThread.count);
		
	}

}
