package org.example;

import java.util.ArrayList;

public class UnsuitablePair {
    public static void removeUnsuitablePairs(ArrayList<Integer> list) {
        for (int i = list.size() - 2; i >= 0; i -= 2) {
            int left = list.get(i);
            int right = list.get(i + 1);
            if (left > right) {
                list.remove(i + 1);
                list.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(3);

        System.out.println("Original list: " + list);
        removeUnsuitablePairs(list);
        System.out.println("Modified list: " + list);
    }
}
