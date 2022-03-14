
public class LargestAmongThreeNUmbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x=1000;
		int y=500;
		int z=900;
		if(x>y && x>z)
			System.out.println("x is greatest");
		else if(y>z)
			System.out.println("y is gretest");
		else
			System.out.println("z is greatest");
		
		//nested if else
		if(x>=y) {
			if(y>=z) {
				System.out.println("x is greatest");
			}
			else {
				System.out.println("z is greatest");
			}
		}else {
			if(y>=z) {
				System.out.println("y is gretest");
			}
			else {
				System.out.println("z is greatest");
			}
		}
	}

}
