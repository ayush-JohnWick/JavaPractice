public class ReverseNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num = 121, sum = 0;
        int temp = num;
        while (num != 0) {
            int n = num % 10;
            sum = (sum * 10) + n;
            num = num / 10;
        }
        System.out.println(sum);
        if (temp == sum) {
            System.out.println("Number is palindrome");
        }

    }

}
