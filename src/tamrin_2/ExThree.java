package tamrin_2;

public class ExThree {
    public static void main(String[] args) {
/*
            تمرین شماره 3
         */
    }
    public static int[] getNumber(String str){
        String[] num = str.split(" ");
        int[] arr=null;
        for (int i = 0; i < num.length; i++) {
            arr[i] =Integer.valueOf(num[i]);
        }
        return arr;
    }
}
