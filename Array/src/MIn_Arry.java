public class MIn_Arry {
    public static void main(String[] args) {
        int[] arr={132,54,67,854,23,32};
        System.out.println(Min_Search(arr));

    }

    static int Min_Search(int[]arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
