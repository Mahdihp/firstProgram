package tamrin_2;

import java.util.HashMap;
import java.util.Map;

public class ExTwo {

    /*
            تمرین شماره 3
         */
    public static void main(String[] args) {
        Ejtemah(" abcd efg","d efg abc bcd");
    }
    public static void Ejtemah(String str1,String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        String[] reaul=new String[ch1.length*ch2.length];
        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch2.length; j++) {
                String s1 = Character.toString(ch1[i]);
                String s2 = Character.toString(ch2[j]);
                if (s1.equals(s2)){
                    reaul[i] += s1;
                }
            }
        }
        for (String s : reaul ) {
            System.out.println(s);
        }
    }
}
