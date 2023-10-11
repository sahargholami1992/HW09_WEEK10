package org.example.myHashMap;

import java.util.Arrays;

public class HashMapTest<K,V> {
    private static final int CAPACITY = 50;
    private Node<K, V>[] node;
    private int size;

    public HashMapTest() {
        node = new Node[CAPACITY];
        size = 0;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> newMyNode = new Node<>(key, value);

        if (node[index] == null) {
            node[index] = newMyNode;
            size++;

        } else {
            Node<K, V> current = node[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                current.value = value;
            } else {
                current.next = newMyNode;
                size++;
            }
        }


    }

    public V get(K key) {
        int index = getIndex(key);
        Node<K, V> current = node[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void replace(K key, V value) {
        int index = getIndex(key);
        Node<K, V> current = node[index];

        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
    }

    public int getIndex(K key) {
        if (key == null) {
            return 0;
        }
        return key.hashCode() % node.length;
    }

    @Override
    public String toString() {
        return "HashMapTest{" +
                Arrays.toString(node) +
                '}';
    }

    public static void main(String[] args) {
        HashMapTest<Integer,String> hash1 = new HashMapTest<>();
        hash1.put(1,"one");
        hash1.put(2,"two");
        hash1.getIndex(1);
        System.out.println(hash1);
    }



}
