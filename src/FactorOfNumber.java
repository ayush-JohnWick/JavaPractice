public class FactorOfNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num = 20;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " is factor");
                count++;
            }
        }
        System.out.println("Total factor is " + count);

    }

}
