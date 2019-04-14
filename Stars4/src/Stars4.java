import java.util.Scanner;

public class Stars4 {
    public static void main(String[] args) {

            int n;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number of rows ");
            n = scan.nextInt();

        String s = "";
        for (int rowNumber = 1, numberOfStars = n; rowNumber <= 2*n; rowNumber++) {
            if (rowNumber <= n){
                s=s+"*";
                System.out.println(s);
            }
            else{
                numberOfStars = numberOfStars - 1;
                System.out.println(s.substring(0, numberOfStars));
            }
        }
    }
}
