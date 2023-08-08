package Interview;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

       int sum=0;
       int n=matrix.length;
       for(int i=0; i<n;i++) {
    	   sum+=matrix[i][i];
    	  
       }
       System.out.println(sum);
    	   
       }
}
