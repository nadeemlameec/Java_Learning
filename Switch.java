import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

     String fruits=in.next();

        switch (fruits) {
            case "Mango" -> System.out.println("King of fruits");
            case "Orange" -> System.out.println("Fruit having Orange color");
            case "Apple" -> System.out.println("Fruit having a Red color");
            case "Pineapple"-> System.out.println("Fruit with Yellow color");

            default -> System.out.println("Not match");
        }
    }
}
