package SequentialParallelStream;
//8.05.23
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SequentialParallelStreamExample1 {

	public static void main(String[] args) {
		System.out.println("Seq Result : "+sumUSingSeq());
		System.out.println("Parallel Result : "+sumUSingParallel());
		System.out.println("Sum Using Seq : "+checkperformance(SequentialParallelStreamExample1::sumUSingSeq,25));
		System.out.println("Sum Using Parallel : "+checkperformance(SequentialParallelStreamExample1::sumUSingParallel,25));
	}
	
	static long checkperformance(Supplier<Integer>sum, int numOfTime) {
		long start=System.currentTimeMillis();
		for(int i=0;i<numOfTime;i++) {
			sum.get();
		}
		long end=System.currentTimeMillis();
		return end-start;
		
	}
	
	static int sumUSingSeq() {
		return IntStream.rangeClosed(1, 10000000).sum();
	}
	
	static int sumUSingParallel() {
		return IntStream.rangeClosed(1, 10000000).parallel().sum();
	}

}
