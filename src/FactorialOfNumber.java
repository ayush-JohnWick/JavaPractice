import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getfact();
		
		
       
	}
	public static void getfact() {
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter number");
		int fact=1;
		 int num= reader.nextInt();
		 for(int i=1 ; i<=num; i++) {
			 fact=fact*i;
		 }
		 System.out.println("Factorial is : "+ fact);
	}

}
