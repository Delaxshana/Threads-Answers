package MOC;

public class MultiplyThread implements Runnable {

	public MultiplyThread(Object lock, int start, int range) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getId());
		for(int start = 1; start<10;start++) {
	        System.out.printf("Thread-1 => %d * %d = %d \n", start, start, start * start);
	   
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
