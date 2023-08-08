package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateArrayValue {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("d");
        list1.add("f");

        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("d");
        list2.add("g");
        list2.add("h");

        List<String> duplicates = new ArrayList<>(list1);
        duplicates.retainAll(list2);

        System.out.println("Duplicate values: " + duplicates);
        
        
        //Find Keys and Values:
     
                List<String> l1 = Arrays.asList("k1-v1", "k2-v2");

                Map<String, String> output = l1.stream()
                        .map(s -> s.split("-"))
                        .collect(HashMap::new, (map, entry) -> map.put(entry[0], entry[1]), Map::putAll);

                System.out.println(output);
            }
        }

 

