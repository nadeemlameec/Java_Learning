public class Count {
    public static void main(String[] args) {
        int[] number={1,3,54,56,7,878,5,3};
        int ans =count_num(number);
        int ans1= number.length;
        System.out.println(ans1);
    }

    static int count_num(int[] arr){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            count =count+1;
        }
        return count;
    }
}
