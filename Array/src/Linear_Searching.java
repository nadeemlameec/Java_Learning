public class Linear_Searching {
    public static void main(String[] args) {
        int[] arr={2,1,5,4,5};
       int ans= Linear(arr,2);
        System.out.println(ans);



    }
    static int Linear(int arr[],int target){

        for(int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }

        }
        return -1;
    }
}
