
package StreamExamlePgm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

public class StreamSumAvgExample {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(1,2,3,8,4,5,5,6,7,8,8,9,4,1);
		List<Integer> fil=intList.stream().filter(s->s%2==0).collect(Collectors.toList());
		System.out.println(fil);
				
		List<Integer> i=intList.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println(i);
		
		int total=intList.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("Total is : "+total);
							
		double avg=intList.stream().collect(Collectors.averagingInt(Integer::intValue));
		System.out.println("Average is : "+avg);
		
		List<Integer> sum=intList.stream().map(a->a+total).collect(Collectors.toList());
		System.out.println("Sum is : "+sum);
		
		List<Integer> sum1=intList.stream().map(a->a).sorted().distinct().collect(Collectors.toList());
		System.out.println("Sum is : "+sum1);
		
		boolean result=intList.stream().allMatch(s->s%2==0);
		if(result) {
			System.out.println("All the numbers are divisible by 2");
		}
		else {
			System.out.println("All the numbers are not divisible by 2");
		}
		
		
		
		        int[] myArray = {3,4,5,9,0,6};
		        StringBuilder stringBuilder = new StringBuilder();

		        for (int element : myArray) {
		            stringBuilder.append(element);
		        }

		        String concatenatedString = stringBuilder.toString();
		        System.out.println(concatenatedString);
		    }
		}

		

