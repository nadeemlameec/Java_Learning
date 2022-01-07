
import java.util.Arrays;
import java.util.Scanner;

public class reverse_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 3, 56, 3, 52, 1, 35};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void reverse(int[] arr)  {
        int start=0;
        int end=arr.length-1;

        while(start<end){
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }

    }


    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }

}
