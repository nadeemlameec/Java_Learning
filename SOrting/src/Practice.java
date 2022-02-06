import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
    int[] new1 ={1,2,3,5,4};
    cyclic(new1);
        System.out.println(Arrays.toString(new1));
    }

//    static void test(int[] test){
//
//        for (int i = 0; i < test.length-2; i++) {
//            for (int j = i+1; j >0; j--) {
//                if (test[j] < test[j-1]) {
//                    swap(test, j, j-1);
//                }
//            }
//        }
//    }


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
