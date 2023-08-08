package Collectors;


		/*
		 * Joining elements:

		joining(): Concatenates the stream elements into a single String.
		joining(delimiter): Concatenates the stream elements into a String, separated by the specified delimiter.
		joining(delimiter, prefix, suffix): Concatenates the stream elements into a String, separated by the specified
		 delimiter and enclosed by the prefix and suffix.
		 */

		import java.util.Arrays;
		import java.util.List;
		import java.util.stream.Collectors;

		public class JoiningExample {
		    public static void main(String[] args) {
		        // Example data
		        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");

		        // Joining elements with a delimiter
		        String joinedWithDelimiter = fruits.stream()
		                .collect(Collectors.joining(", "));
		        System.out.println("Joined with delimiter: " + joinedWithDelimiter);

		        // Joining elements with a delimiter, prefix, and suffix
		        String joinedWithPrefixSuffix = fruits.stream()
		                .collect(Collectors.joining(", ", "Fruits: [", "]"));
		        System.out.println("Joined with prefix and suffix: " + joinedWithPrefixSuffix);
		    }
		}

	
/*Joined with delimiter: apple, banana, cherry, date
Joined with prefix and suffix: Fruits: [apple, banana, cherry, date]

		
		*/