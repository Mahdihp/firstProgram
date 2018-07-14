package tamrin_2;

import java.util.Arrays;

public class ExOne {
    public static void main(String[] args) {
        /*
            تمرین شماره 1
         */

        /*int[] arr=  {1000,45,12,2102,1,521,21,545,2};
        int min = arr[0];
        for(int i : arr){
            if (i < min){
                min = i;
            }
        }
        System.out.println("Min element : "+ min);*/
//---------------------------------------------------------------------------------
/*
        int[] arr=  {1,2,3,4,5,6,7,8,9};
        int[] arrRev =new int[arr.length];
        int e= 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            arrRev[e]= arr[i];
            e++;
        }
        for (int i : arrRev) {
            System.out.println("Reverse element : " + i);
        }*/
//---------------------------------------------------------------------------------
        /*int[] arr=  {1000,45,12,2102,54,521,21,545,2};
        int max = arr[0];
        for(int i : arr){
            if (i > max){
                max = i;
            }
        }
        System.out.println("Min element : "*//*+ max);*/
//---------------------------------------------------------------------------------
       /* int[] arr = {10010, 45, 1000, 45, 54, 521, 21, 45,45, 2};
        int duplicat = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j])
                    duplicat = arr[i];
            }
        }
        System.out.println("Duplicat element : " + duplicat);*/
        System.out.println(isCommonElement());
    }

   /* public static boolean isEqualArr(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }*/
    public static int isCommonElement() {
        int[] arr1={1,2,1,2,3,4,1};
        int[] arr2={1,1,2,3,3};
        int duplicat = -1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j])
                    duplicat = arr1[i];
            }
        }
        return duplicat;
    }
}
