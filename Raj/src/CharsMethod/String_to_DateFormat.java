package CharsMethod;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class String_to_DateFormat {
	public static void main(String[] args) throws ParseException {
	// TODO Auto-generated method stub

	String date="2023-06-16";

	
	DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate local=LocalDate.parse(date, format);
	System.out.println(local);

	}

	}

