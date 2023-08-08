package CharsMethod;

public class ArrayCombiner {
    public static void main(String[] args) {
    	String name="a9bc1";
    	char[] a= name.toCharArray();
    	for(int i=0;i<a.length;i++) {
    		if(Character.isAlphabetic(a[i])) {
    			System.out.print(a[i]);
    		} else {
    		int b=Character.getNumericValue(a[i]);
    		for(int j=1;j<b;j++) {
    			System.out.print(a[i-1]);
    		}
    	}
    	
    }
}
}

