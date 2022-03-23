import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = reader.nextInt();
        int t1 = 0, t2 = 1, sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print(t1 + " ");
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

    }

}
