import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
    int[]arr={1,5,2,56,7};
    Bubble(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-2]);
    }

    static void Bubble(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-1; j++) {
                if(arr[j] < arr[j-1]){

                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
            }
           }
        }
    }

}
