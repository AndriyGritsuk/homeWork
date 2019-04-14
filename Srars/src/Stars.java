import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number of rows ");

        n = scan.nextInt();

        int rouCounter = 1;
        while (rouCounter <= n){
            int starCounter = 1;
            while (starCounter <= rouCounter ){
                System.out.print("*");
                ++starCounter;
            }
            System.out.println();
            ++rouCounter;
        }
    }
}