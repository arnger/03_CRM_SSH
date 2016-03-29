package org.iwan.app;

public class Thread1 {

	private int num;

	private Object lock=new Object();

	public void print() {
		synchronized (lock) {
			System.out.println(num);
			num++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
