package MOC;

public class PlusThread implements Runnable {

	public PlusThread(Object lock, int start, int range) {
		start = 2;
		range = 10;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getId());
		for(int start = 1; start<10;start++) {
	        System.out.printf("Thread-0 => %d + %d = %d \n", start, start, start + start);
	   
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
