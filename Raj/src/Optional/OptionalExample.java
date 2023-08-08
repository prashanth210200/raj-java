package Optional;
//8.43
public class OptionalExample {
	
	/*
	 * Optional:
	 *-> It is a public final class and used to deal with NullPointerException in Java application.
	 *-> if we are not handling any nullable and all ,users is passing  some null or empty things and all,
	 *before that optional we are getting some null pointer exception. that cases we need to handle these type of exception
	 *insteed of that. so we have a optional. Optional have multiple classes. they will handle internally
	 *
	 *-> empty()			-> It returns an empty Optional object. No value is present for this Optional.
	 *
	 *-> of(T value)		-> It returns an Optional with the specified present non-null value.
	 *
	 *-> ofNullable(T value)-> It returns an Optional describing the specified value, 
	 *						   if non-null, otherwise returns an empty Optional. (Combination of empty() and of() )
	 *
	 *-> get()				-> If a value is present in this Optional, returns the value,
	 *							 otherwise throws NoSuchElementException.
	 *
	 *-> isPresent() 		-> It returns true if there is a value present, otherwise false.
	 */

	public static void main(String[] args) {
	

	}

}
