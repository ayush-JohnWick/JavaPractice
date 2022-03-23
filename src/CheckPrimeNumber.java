public class CheckPrimeNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //java program to check whether the sum of two prime numbers
        //34= 3+31, 5+29 , 17+7
        //System.out.println(checkPrime(17));
        int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {
            if (checkPrime(i)) {
                if (checkPrime(num - i)) {
                    System.out.println(num + "=" + i + "+" + (num - i));
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println(num + " can not be expressed as sum of two prime numbers");
        }

    }

    public static boolean checkPrime(int num) {
        boolean flag = true;
        if (num == 1) {
            flag = false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

}
