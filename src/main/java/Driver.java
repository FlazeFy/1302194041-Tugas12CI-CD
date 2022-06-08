import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment(1);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement(3);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment(5);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement(2);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment(5);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement(3);
		
		System.out.println("Current count:" + counter.getCount());
		

		
	}

}
