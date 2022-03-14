
public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("Before swapping: ");
		System.out.println("The value of a : "+ a);
		System.out.println("The value of b : "+ b);
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println("After swapping: ");
//		System.out.println("The value of a : "+ a);
//		System.out.println("The value of b : "+ b);
		//without temp var:
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("After swapping: ");
		System.out.println("The value of a : "+ a);
		System.out.println("The value of b : "+ b);
      
	}

}
