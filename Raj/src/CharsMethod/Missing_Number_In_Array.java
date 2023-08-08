package CharsMethod;

public class Missing_Number_In_Array {
	public static void main(String[] args) {
	        int[] array = {21,22,23,25,26};
	        int missingNumber = findMissingNumber(array);
	        System.out.println("Missing number: " + missingNumber);
	    }

	    public static int findMissingNumber(int[] array) {
	      //  int n = array.length + 1;
	        int totalSum = 0;
	        
	        for(int i=21;i<=26;i++) {
	        	totalSum+=i;
	        }
	        
	        int arraySum = 0;
	        for (int num : array) {
	            arraySum += num;
	        }

	         int missNum=totalSum - arraySum;
	         
	        return missNum;
	    }
	
}

