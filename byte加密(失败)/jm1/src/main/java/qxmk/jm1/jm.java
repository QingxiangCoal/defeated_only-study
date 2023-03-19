package qxmk.jm1;

import java.util.Objects;

import static java.util.Arrays.binarySearch;

public class jm {
    public static String jm1(String key, String src, boolean d) {
       String[] keyy = key.split("");
       byte[] srcc = src.getBytes();
       for (int i = 0; i < srcc.length; i++) {
           if (d) {
               srcc[i] = (byte) Integer.parseInt(j(keyy, String.valueOf(srcc[i]), true));
           } else {
               srcc[i] = (byte) Integer.parseInt(j(keyy, String.valueOf(srcc[i]), false));
           }
       }
        return new String(srcc, 0, srcc.length);
    }
    static String j(String[] keyy, String src, boolean f) {
        String[] srcc = src.split("");
        String d = "";
        int j = 0;
        if (keyy.length != 11) {
            System.out.println("error");
            System.exit(1);
        }
        for (int i = 0; i < srcc.length; i++) {
            if (!Objects.equals(srcc[i], "-")) {
                j = binarySearch(keyy, srcc[i]);
                if (f) {
                    if ((j + Integer.parseInt(keyy[10])) > 9) {
                        j = (j + Integer.parseInt(keyy[10])) - 9;
                    }
                } else {
                    if ((j - Integer.parseInt(keyy[10])) < 0) {
                        j = (j - Integer.parseInt(keyy[10])) + 9;
                    }
                }
                srcc[i] = keyy[j];
            }
            if (Objects.equals(srcc[0], "-")) {
                srcc[0] = "";
                d = "";
            } else {
                d = "-";
            }
        }
        StringBuilder fh = new StringBuilder();
        for (int ii = 0; ii < srcc.length; ii++) {
            fh.append(srcc[ii]);
        }
        return d + fh.toString();
    }
}
