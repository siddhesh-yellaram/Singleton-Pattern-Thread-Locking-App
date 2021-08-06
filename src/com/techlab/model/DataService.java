package com.techlab.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DataService {
	static DataService bucket;
	private static Lock lock = new ReentrantLock();
	public static DataService getInstance() {
		if(bucket == null) {
			lock.lock();
			if (bucket == null) {
				lock.lock();
				bucket = new DataService();
			}
		}
		return bucket;
	}
}
