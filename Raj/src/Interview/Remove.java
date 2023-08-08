package Interview;
public class Remove {
    public static void main(String[] args) {
        String input = "abc123def";
        String output = new StringBuilder(input).reverse().toString()
                        .chars()
                        .filter(c -> c != '1')
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString();
        
        System.out.println("Output: " + output);
        
        //Reverse and remove 
        String a="Raj is a good 1person";
        for(int i=a.length()-1;i>=0;i--)
        {
            if(a.charAt(i)=='1') {
                continue;
            }
           System.out.print(a.charAt(i));
            
        }
       
        
        //Remove one character
        String a1="Raj is a good 1person";
        for(int i=0;i<a1.length();i++)
        {
            if(a1.charAt(i)=='i') {
                continue;
            }
           System.out.print(a1.charAt(i));
            
        }
    }
}
