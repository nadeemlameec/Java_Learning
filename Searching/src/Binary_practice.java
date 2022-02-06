public class Binary_practice {
    public static void main(String[] args) {
        int[]arr={1,4,6,8,10,12,54};
        int key=11;

        int ans=Bin(arr,key);
        System.out.println(ans);
    }

    static int Bin(int[] arr,int target) {
        int start = 1;
        int end = arr.length - 1;

        while (start <= end) {
            int mid=start +(end-start)/2;
            for (int i = 0; i < arr.length; i++) {
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target) {
                start = mid + 1;
            }
            else if(arr[mid] >target){
                end=mid-1;
            }
            }
        }
        return end;
    }
}
