package org.example.myHashMap;

public class Node<K,V> {
    K key;
    V value;
    Node<K, V> next;

    Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "key=" + key +
                ", value=" + value +
                '}';
    }
}
