package cn.com.dlut.gaoruiqi.multithreading;

public class LiftOff implements Runnable {
	
	private static int taskCount = 0;
	
	private int countDown = 10;
	private final int id = taskCount++;
	
	public LiftOff() {
		
	}
	
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	
	public String status(){
		return "#" + this.id + "(" + (this.countDown>0?this.countDown:"LiftOff") + ")";
	}

	@Override
	public void run() {
		while(countDown-->0){
			System.out.println(status());
			Thread.yield();
		}
	}

}
