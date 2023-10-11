package org.example;

import java.util.*;

public class Permutation {

    public List<String> permutations(String word) {
        List<String> permutations = new ArrayList<>();
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        permutationsTest(word.length(), charCount, "", permutations);
        return permutations;
    }
    public void permutationsTest(int remainingLength, Map<Character, Integer> charCount, String currentString, List<String> permutations) {
        if (remainingLength == 0) {
            permutations.add(currentString);
            return;
        }
        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            if (count > 0) {
                charCount.put(c, count - 1);
                permutationsTest(remainingLength - 1, charCount, currentString + c, permutations);
                charCount.put(c, count);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Permutation p = new Permutation();




        String word1 = scanner.next();
        List<String> permutations = p.permutations(word1);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }


        String word2 = scanner.next();
        if (permutations.contains(word2)) {
            System.out.println("PASS");
        } else
            System.out.println("FAIL");
    }
}

