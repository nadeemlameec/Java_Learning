public class Concat {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        int[] ans = con(arr);

        System.out.println(ans);
    }

    static int[] con(int[] arr) {
        int length=arr.length+arr.length;
        int[] result= new int[length];

        int pos = 0;
        for (int element : arr) //copying elements of secondArray using for-each loop
        {
            result[pos] = element;
            pos++;              //increases position by 1
        }
        for (int element : arr) //copying elements of firstArray using for-each loop
        {
            result[pos] = element;
            pos++;
        }
        return result;
    }
}

