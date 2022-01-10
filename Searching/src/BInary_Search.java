public class BInary_Search {
    public static void main(String[] args) {

        int[] str={1,5,8,9,14,16,89};
        int key=9;

        int ans=Binary(str,key);

        System.out.println(ans);

    }

    static int Binary(int[] arr, int Key){
        int low=1;
        int high=arr.length-1;

        while(low <= high){
//            int mid=((high+low)/2);
            int mid=high+(low-high)/2;

          if(Key < arr[mid]){
               high=mid-1;
           }
           else if(Key > arr[mid]){
               low=mid+1;
           }
           else{
               return mid;
          }
        }
        return -1 ;
    }
}
