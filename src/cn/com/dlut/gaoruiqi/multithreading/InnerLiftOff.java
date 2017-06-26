package cn.com.dlut.gaoruiqi.multithreading;

public class InnerLiftOff {
	
	private static int taskCount = 0;
	
	private int countDown = 10;
	private final int id = taskCount++;
	private Thread thread;
	
	public InnerLiftOff() {
		thread = new Thread(new Runnable() {			
			@Override
			public void run() {
				while(countDown-->0){
					System.out.println(status());
					Thread.yield();
				}				
			}
		});
		thread.start();
	}
	
	public String status(){
		return "#" + this.id + "(" + (this.countDown>0?this.countDown:"LiftOff") + ")";
	}
}
