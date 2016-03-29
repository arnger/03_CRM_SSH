package org.iwan.app;

public class ThreadApps {

	public static void main(String[] args) {
		final Thread1 t = new Thread1();
		for (int i = 0; i < 200; i++) {
			Runnable r=	new Runnable() {

				@Override
				public void run() {
					t.print();// TODO Auto-generated method stub

				}
			};
			new Thread(r).start();
		}

	}

}
