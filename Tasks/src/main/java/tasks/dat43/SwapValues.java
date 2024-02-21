package tasks.dat43;

import java.util.Arrays;

public class SwapValues {

    public static void main(String[] args) {

        Integer[] a = {1, 2, 3, 4};
        swap(a, 0, 2);
        System.out.println(Arrays.toString(a));
    }
    public static <T> void swap(T[] a, int b, int c){

        T temp = a[b];
        a[b] = a[c];
        a[c] = temp;

//        int elementB = 0;
//        int elementC = 0;
//
//        for (int i = 0; i < a.length; i++) {
//
//            if (i == b){
//                elementB = a[i];
//            }
//            if (i == c){
//                elementC = a[i];
//            }
//        }
//
//        if (elementB == 0 || elementC == 0){
//            System.err.println("One or both of them are not exist in the array");
//        }
//
//        a[c] = elementB;
//        a[b] = elementC;
    }
}
