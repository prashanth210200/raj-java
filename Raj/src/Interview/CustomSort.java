package Interview;

import java.util.*;

public class CustomSort {
    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        List<Integer> sortOrder = Arrays.asList(0, 1, 1, 0, 1, 2, 2, 0);

        List<String> outputList = customSort(inputList, sortOrder);
        System.out.println(outputList);
    }

    public static List<String> customSort(List<String> inputList, List<Integer> sortOrder) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < inputList.size(); i++) {
            map.put(sortOrder.get(i), inputList.get(i));
        }

        List<String> outputList = new ArrayList<>();
        for (int i = 0; i < sortOrder.size(); i++) {
            outputList.add(map.get(i));
        }

        return outputList;
    }
}


