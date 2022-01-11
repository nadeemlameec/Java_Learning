public class Agnostic_Binary {
    public static void main(String[] args) {
        int[]arr={25,22,15,13,11,8,6,3,2,1};
        int Target=3;
        int ans=binary_search(arr,Target);
        System.out.println(ans);
    }

    static int binary_search(int[] arr, int Key) {
        int low = 1;
        int high = arr.length - 1;

        if (arr[low] < arr[high]) {
            while (low <= high) {
//            int mid=((high+low)/2);
                int mid = high + (low - high) / 2;

                if(Key==arr[mid]){
                    return mid;
                }

                if (Key < arr[mid]) {
                    high = mid - 1;
                } else if (Key > arr[mid]) {
                    low = mid + 1;
                }
            }
            return -1;
        } else {
            while (low <= high) {
//            int mid=((high+low)/2);
                int mid = high + (low - high) / 2;

                if (Key > arr[mid]) {
                    high = mid - 1;
                } else if (Key < arr[mid]) {
                    low = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;

        }

    }
}


