public class BInary_Search {
    public static void main(String[] args) {

        int[] str = {1,3};
        int key = 1;

        int ans = Binary(str, key);

        System.out.println(ans);

    }

    static int Binary(int[] arr, int Key) {
        int low = 1;
        int high = arr.length - 1;
        if (arr.length == 1 && arr[0] == Key) {
            return 0;
        } else {
            while (low <= high) {
//            int mid=((high+low)/2);
                int mid = high + (low - high) / 2;

                if (Key == arr[mid]) {
                    return mid;
                } else if (Key < arr[mid]) {
                    high = mid - 1;
                } else if (Key > arr[mid]) {
                    low = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }
}
