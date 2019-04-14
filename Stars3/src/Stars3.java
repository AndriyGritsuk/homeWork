import java.util.Scanner;

public class Stars3 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows ");

        n = scan.nextInt();

        for (int rouCounter = 1; rouCounter <= n; rouCounter++){
            for (int spaceCounter = 1; spaceCounter<=(n - rouCounter); spaceCounter++ ){
                System.out.print(" ");

            }
            for (int starCounter = 1; starCounter <= 1+2*(rouCounter - 1); starCounter++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
