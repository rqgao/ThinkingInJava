package cn.com.dlut.gaoruiqi.multithreading;

import java.util.concurrent.ThreadFactory;

public class LiftOffThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread thread = new Thread(r);
		return thread;
	}

}
