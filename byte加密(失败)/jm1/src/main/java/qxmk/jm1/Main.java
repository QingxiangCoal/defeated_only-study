package qxmk.jm1;

import static qxmk.jm1.jm.jm1;

public class Main {
    public static void main(String[] args) {
        sc("b".getBytes());
        byte[] a = jm1("01234567895", "b", true).getBytes();
        System.out.println(jm1("01234567895", "a", true));
        sc(a);
        byte[] b = jm1("01234567895", jm1("01234567895", "b", true), false).getBytes();
        sc(b);
    }

    static void sc(byte[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println("");
    }
}