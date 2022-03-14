
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertBinaryToDecimal(1011101));

	}
	
	public static int convertBinaryToDecimal(long num) {
		int decimalNumber=0,i=0;
		long remainder=0;
		while(num!=0) {
			remainder=num %10;
			num=num/10;
			decimalNumber+= remainder* Math.pow(2, i);
			++i;
		}
		
		return decimalNumber;
	}

}
