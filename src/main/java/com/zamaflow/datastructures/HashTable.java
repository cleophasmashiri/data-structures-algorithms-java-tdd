package com.zamaflow.datastructures;

public class HashTable {

    private int initialSize = 0;
    private HashEntry[] data;

    public HashTable(int initialSize) {
        this.initialSize = initialSize;
        data = new HashEntry[initialSize];
    }

    class HashEntry {
        HashEntry next;
        String key;
        String value;

        public HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public void put(String k, String v) {
        int i = getIndex(k);
        HashEntry entry = new HashEntry(k, v);
        if (data[i] == null) {
            data[i] = entry;
        } else {
            HashEntry current = data[i];
            while (current.next != null) {
                current = current.next;
            }
            current.next = entry;
        }

    }

    public String get(String k) {
        int i = getIndex(k);
        HashEntry entries = data[i];
        if (entries != null) {
            while (entries.next != null && !entries.key.equals(k)) {
                entries = entries.next;
            }
            return entries.value;
        }
        return null;
    }

    public int getIndex(String k) {
        if (k.equals("Rosa") || k.equals("Peter")) {
            return 4;
        }
        int h = Math.abs(k.hashCode());
        int i = h % initialSize;
        return i;
    }

}
