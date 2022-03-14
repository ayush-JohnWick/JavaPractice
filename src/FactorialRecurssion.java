
public class FactorialRecurssion {

	public static void main(String[] args) {
		System.out.println(returnFact(4));

	}
	
	public static int returnFact(int num) {
		if(num!=0) {
			return  num *returnFact(num-1);
		}
		else
			return 1;
	}

}
