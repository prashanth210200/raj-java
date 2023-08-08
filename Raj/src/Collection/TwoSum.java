package Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int a[]= {2,3,5,10,18,4,2,11,9};
		/*for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==14) {
					System.out.println(a[i]+":"+a[j]);
				}
					
			}
		}*/
			
		
		System.out.println(Arrays.toString(twoSum(a,14)));

	}
	

  public  static int[] twoSum(int[] nums, int target) {
		int len=nums.length;
		int result[]=new int[2];
		Map<Integer,Integer> temp=new HashMap<>();
		for(int i=0;i<len;i++) {
			if(temp.get(target-nums[i])==null)
				temp.put(nums[i], i);
			else {
				result[0]=target-nums[i];
				result[1]=nums[i];
			}
			
		}
		return result;
	}

}
