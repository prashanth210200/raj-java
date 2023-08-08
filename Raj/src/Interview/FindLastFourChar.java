package Interview;



	
import java.util.stream.Collectors;

	public class FindLastFourChar {
	    public static void main(String[] args) {
		        
	        String sentence = "This is a sample sentence";
	        String lastFourCharacter = sentence.chars()
	                .mapToObj(c -> (char) c)
	                .skip(Math.max(0, sentence.length() - 4))
	                .map(Object::toString)
	                .collect(Collectors.joining());
	        System.out.println(lastFourCharacter);
	    }
	}
	

