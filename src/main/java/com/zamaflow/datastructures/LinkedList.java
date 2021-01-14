package com.zamaflow.datastructures;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    public Node head;

    public void add(int i) {
        if (head == null) {
            head = new Node(i);
        } else {
            Node c = head;
            while (c.next != null) {
                c = c.next;
            }
            c.next = new Node(i);
        }
    }

    public void delete(int k) {
        if (head == null) {
            return;
        } else {
            Node c = head;
            Node p = null;
            while (c.next != null || c.key != k) {
                p = c;
                c = c.next;
            }
            if (c != null && c.key == k) {
                if (p != null) {
                    p.next = c.next;
                } else {
                    c = null;
                }
            }
        }
    }

    public void removeDuplicates() {
        Set<Integer> s = new HashSet<>();
        if (head == null) {
            return;
        } else {
            Node c = head;
            while (c != null) {
                if (s.contains(c.key)) {
                    delete(c.key);
                }
                s.add(c.key);
                c = c.next;
            }
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        } else {
            int count = 1;
            Node c = head;
            while (c.next != null) {
                count++;
                c = c.next;
            }
            return count;
        }
    }

}
