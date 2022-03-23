public class NaturalNumberSumRecurssion {

    public static void main(String[] args) {
        int num = 5;
        int sum = addnum(num);
        System.out.println("Sum is " + sum);

    }

    public static int addnum(int num) {
        if (num != 0) {
            return num + addnum(num - 1);
        } else
            return num;
    }

}
