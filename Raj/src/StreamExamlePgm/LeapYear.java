package StreamExamlePgm;

import java.util.stream.IntStream;

public class LeapYear {

    public static void main(String[] args) {
        int startYear = 2000;
        int endYear = 2023;

        System.out.println("Leap years between " + startYear + " and " + endYear + ":");
        IntStream.rangeClosed(startYear, endYear)
                .filter(year -> (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                .forEach(System.out::println);
    }
}
