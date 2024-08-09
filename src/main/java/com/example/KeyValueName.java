package com.example;

public class KeyValueName<K, V> {
    private K key;
    private V value;
    private String type;

    public KeyValueName(K key, V value, String type) {
        this.key = key;
        this.value = value;
        this.type = type;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "KeyValueName{" +
               "key=" + key +
               ", value=" + value +
               ", name='" + type + '\'' +
               '}';
    }
}
