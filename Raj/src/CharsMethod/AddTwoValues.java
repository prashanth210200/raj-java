package CharsMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoValues {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        
        int target = 5;

        a.stream()
            .flatMap(i -> a.stream().filter(j -> i + j == target && i != j).map(j -> Arrays.asList(i,j)))
            .distinct()
            .forEach(System.out::println);
    }
}

/*Arrays.asList:
Arrays.asList is a method in Java that allows you to quickly "create a fixed-size list" backed by an array. 
It is part of the java.util package and provides a convenient way to convert an array into a List object.
*/