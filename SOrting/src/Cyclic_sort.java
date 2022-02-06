import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] new1 ={3,1,2,5,4};
        cyclic(new1);
        System.out.println(Arrays.toString(new1));
    }

    static void cyclic(int[] arr){
        int i=0;

        while(i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr,int first,int second) {
        int temp =arr[first];
        arr[first] =arr[second];
        arr[second]=temp;
    }



}
