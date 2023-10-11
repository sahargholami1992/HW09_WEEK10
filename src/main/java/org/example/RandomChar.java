package org.example;

import java.util.TreeSet;

public class RandomChar {
    public static char getRandomChar() {
        int random = (int) (Math.random() * 26);
        return (char) ('a' + random);
    }


    public static TreeSet<Character> createRandomTreeSet() {

        TreeSet<Character> set = new TreeSet<>();
        while (set.size() < 10) {
            set.add(getRandomChar());
        }
        return set;
    }
    public static TreeSet<Character> unionTreeSet(TreeSet<Character> set1,TreeSet<Character> set2){
        TreeSet<Character> unionSet = new TreeSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
    public static TreeSet<Character> intersectionTreeSet(TreeSet<Character> set1, TreeSet<Character> set2) {
        TreeSet<Character> intersectionSet = new TreeSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }


    public static void main(String[] args) {

        TreeSet<Character> set1 = createRandomTreeSet();
        TreeSet<Character> set2 = createRandomTreeSet();

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        RandomChar.unionTreeSet(set1,set2);
        RandomChar.intersectionTreeSet(set1,set2);
    }
}
