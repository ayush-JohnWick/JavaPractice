public class PrimeNumberRange {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int low = 20;
        int high = 29;

        while (low <= high) {
            boolean flag = false;
            for (int i = 2; i < low / 2; i++) {
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(low + " ");
            }
            low++;
        }
    }

}
