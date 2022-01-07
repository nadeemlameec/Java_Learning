import java.util.Arrays;
import java.util.Scanner;

public class Array_Intro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
        String[] arr = new String[5];

//        //all the types of an array will be of same type
//        for(int i=0;i<arr.length;i++){
//          arr[i]=in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//
//
//    }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}

