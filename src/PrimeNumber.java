import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = reader.nextInt();
        boolean flag = false;
        if (num == 1) {
            flag = true;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }

        }
        if (!flag) {
            System.out.println(num + " num is prime number ");
        } else
            System.out.println(num + " num is not prime number ");

    }

}
