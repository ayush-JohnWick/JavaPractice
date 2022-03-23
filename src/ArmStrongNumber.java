public class ArmStrongNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num = 153;
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int n = num % 10;
            sum = sum + (n * n * n);
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is amstrong number");
        }

    }

}
