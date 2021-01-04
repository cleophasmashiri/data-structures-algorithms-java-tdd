package com.zamaflow.strings;

public class StringUrlfy {

    public String urlfy(String s, int finalStringLength) {
        s = s.replace(" ", "%20");
        return s;
    }

    public String urlfyNoReplace(String s, int n) {
        char[] c = new char[n];
        s = s.trim();
        char[] ss = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] != ' ') {
                c[counter++] = ss[i];
            } else {
                c[counter++] = '%';
                c[counter++] = '2';
                c[counter++] = '0';
            }
        }
        return String.valueOf(c);
    }

}
