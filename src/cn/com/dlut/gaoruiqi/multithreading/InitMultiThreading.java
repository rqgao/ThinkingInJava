package cn.com.dlut.gaoruiqi.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The basic of the thread
 * @author Administrator
 * @version 20170626-1
 */
public class InitMultiThreading {

	public static void main(String[] args) {
		
//		LiftOff liftOff = new LiftOff();
//		liftOff.run();
		
//		Thread thread = new Thread(new LiftOff());
//		thread.start();
//		System.out.println("Waiting for LiftOff");
		
//		for(int i=0;i<5;i++)
//			new Thread(new LiftOff()).start();
//		System.out.println("Waiting for LiftOff");
		
//		ExecutorService executorService = Executors.newCachedThreadPool();
//		for(int i=0;i<5;i++)
//			executorService.execute(new LiftOff());
//		executorService.shutdown();
//		System.out.println("Waiting for LiftOff");
		
//		ExecutorService executorService = Executors.newCachedThreadPool(new LiftOffThreadFactory());
//		for(int i=0;i<5;i++)
//			executorService.execute(new LiftOff());
//		System.out.println("Waiting for LiftOff");
		
//		new LiftOffT();
		
		new InnerLiftOff();
	}
}
