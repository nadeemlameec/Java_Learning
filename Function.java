import java.util.Scanner;

public class Function {
    public static void main(String[] args) {

   int z= sum2(10,12);
    System.out.println(z);
    }

        static void sum() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the first number :");
            int x = in.nextInt();
            System.out.println("Enter the Second number :");
            int y = in.nextInt();

            int sum = x + y;
            System.out.println("Sum of the number are :" + sum);


        }

        static int sum2(int x,int y){
        return x+y;
        }
    }
