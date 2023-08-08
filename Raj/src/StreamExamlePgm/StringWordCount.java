package StreamExamlePgm;


import java.util.Arrays;
import java.util.Comparator;


public class StringWordCount {

	
	
	public static void main(String[] args) {
	Integer array[]= {10,11,11,66,66,13,14,77};
	
	printNextGreaterElement(array);	
	
	Integer k=Arrays.stream(array).distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
	System.out.println("Second Highest Number:"+k);
	
	Integer k1=Arrays.stream(array).distinct().sorted(Comparator.reverseOrder()).findFirst().get();
	System.out.println("Highest Number:"+k1);
	
		
	}
public static void printNextGreaterElement(Integer[] array) {
	int next,i,j;
	for(i=0;i<array.length;i++) {
		next=0;
		for(j=i+1;j<array.length;j++) {
			if(array[i]<array[j]) {
			next=array[j];
			break;
			}
		}System.out.println(array[i]+","+next);
	}
	
}


}
