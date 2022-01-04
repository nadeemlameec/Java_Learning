public class rev {
    public static void main(String[] args) {
        int n=1254434;
        int rev=0;

        while(n > 0) {
            int rem = n % 10;
            n=n/10;
            rev = rev * 10 + rem;
        }

        System.out.println(rev);
    }

}

