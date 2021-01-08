package com.zamaflow;

public class CyclickLinkedListDetector {

    public boolean isCyclic(Node head) {
        if (head == null) {
            return false;
        }
        Node fast = head;
        Node slow = head;
        // Floyd's cyclic-finding algorithm
        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

}
