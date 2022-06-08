import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increaseBy(6);
		System.out.println("Current count:" + counter.getCount());
		
		counter.multiplyBy(2);
		System.out.println("Current count:" + counter.getCount());
		
		counter.powerBy(4);
		System.out.println("Current count:" + counter.getCount());
	}

}
