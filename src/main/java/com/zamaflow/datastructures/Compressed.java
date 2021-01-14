package com.zamaflow.datastructures;

public class Compressed {

    public String compress(String a) {
        StringBuilder b = new StringBuilder();
        char[] arr = a.toCharArray();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;
            if (i + 1 >= arr.length || arr[i] != arr[i + 1]) {
                b.append(a.charAt(i));
                if (count>1)
                 b.append(count);
                count = 0;
            }
        }
        // return b.toString();
        return b.toString().length() < a.length() ? b.toString() : a;
    }

}
