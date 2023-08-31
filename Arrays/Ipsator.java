package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Ipsator {
    public static void main(String[] args) {
        String str = "3+5*2-8/4";
        String[] value = str.split("\\+|\\-|\\*|/");
//        for (String s : value) {
//            System.out.println(s);
//        }
        char[] op = str.replaceAll("[0-9]", "").toCharArray();
        int res = Integer.parseInt(value[0]);
        int x = 1;

        for (int i = 0; i < op.length; i++) {
            char z = op[i];
            int nn = Integer.parseInt(value[x++]);
            switch (z) {
                case '+':
                    res += nn;
                    break;
                case '-':
                    res -= nn;
                    break;
                case '*':
                    res *= nn;
                    break;
                default:
                    res /= nn;
            }

        }
        System.out.println(res);

    }
}

