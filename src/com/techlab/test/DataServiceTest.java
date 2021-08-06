package com.techlab.test;

import com.techlab.model.DataService;

public class DataServiceTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				DataService.getInstance();
				System.out.println("Thread Running: "+Thread.currentThread().hashCode());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				DataService.getInstance();
				System.out.println("Thread Running: "+Thread.currentThread().hashCode());
			}
		});
		
		t1.start();
		t2.start();
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
