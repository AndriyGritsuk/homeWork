import java.util.Scanner;

public class Stars2 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows ");

        n = scan.nextInt();
        int rouCounter = 1;
        while (rouCounter <= n) {
            int spaceCounter = 1;
            while (spaceCounter <= n - rouCounter) {
                System.out.print(" ");
                ++spaceCounter;
            }
                int starCounter = 1;
                while (starCounter <= rouCounter){
                    System.out.print("*");
                    ++starCounter;

                }
                System.out.println();
                ++rouCounter;

            }


    }
}