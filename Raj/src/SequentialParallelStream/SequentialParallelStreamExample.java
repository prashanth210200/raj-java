package SequentialParallelStream;
/*
 * Sequential                                  Parallel

 *->  Work just like for -loop using			Divide the provided task into many and 
 *	  single core   							run them in different threads
 *->  Run on single core						Runs into multiple core
 *->  Supports lazy evaluation   				Supports lazy evaluation
 *->  Use based on the required task 			Use based on the required task 
 *->  Performance is poor						The performance is high.
 *->  Order is maintained						Doesn’t care about the order
 *->  Each iteration waits for 					Waits only if no cores are free or available at a given time.
 *	  currently running one to finish.	
 
 *
 * 
 *Async is multi-thread, which means operations or programs can run in parallel. 
 *Sync is single-thread, so only one operation or program will run at a time. 
 *Async is non-blocking, which means it will send multiple requests to a server.
 *
 *
 */

//7.58
import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class SequentialParallelStreamExample {

	public static void main(String[] args) {
		System.out.println("Available Core : "+Runtime.getRuntime().availableProcessors());
		String str[]= {"1","2","3","4","5","6","7","8","9","10"};
	    System.out.println("Sequential Stream:");
	    printStream(Arrays.stream(str));
	    System.out.println("Parallel Stream:");
	    printStream(Arrays.stream(str).parallel());
	}

	static void printStream(Stream<String> stream) {
		
		stream.forEach(s->{
			System.out.println(LocalTime.now()+"Value : "+s+":"+Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		});
		
	}
	

}
