import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the number ");
        n = scan.nextInt();
        int sumOfNumbers = 0;
        while (n > 0){
            sumOfNumbers = sumOfNumbers + n % 10;
            n = n / 10;
        }
        System.out.println("Sum of numbers = " + sumOfNumbers);
    }
}
