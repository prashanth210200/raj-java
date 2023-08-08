package CharsMethod;

import java.util.ArrayList;
import java.util.List;

public class Permutions {
    public static List<String> generatePermutations(String input) {
        List<String> permutations = new ArrayList<>();
        permutations.add(""); // Initialize with an empty string

        for (char c : input.toCharArray()) {
            List<String> newPermutations = new ArrayList<>();
            
            for (String permutation : permutations) {
                for (int i = 0; i <= permutation.length(); i++) {
                    String newPermutation = permutation.substring(0, i) + c + permutation.substring(i);
                    newPermutations.add(newPermutation);
                }
            }
            
            permutations = newPermutations;
        }
        
        return permutations;
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = generatePermutations(input);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}

