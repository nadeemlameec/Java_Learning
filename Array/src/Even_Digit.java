public class Even_Digit {
    public static void main(String[] args) {
        int[] digit ={1220,123,45,607,890};
        System.out.println(findNumber(digit));
    }
    static int findNumber(int[]nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
               count++;
            }
        }
        return count;
    }



    static boolean even(int num){
        int numofdigit=digits(num);

        return numofdigit%2==0;
    }


    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
