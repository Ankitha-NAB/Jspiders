package day1;

public class Demo2 extends Thread{
	@Override
	public void run() {
		for(int i=10;i>=1;i--) {
			if(i%2==0) {
				System.out.println("i:"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
