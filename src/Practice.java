class Practice{

	public static void main(String args[]) {
		Practice p1= new Practice();
		int i=10;
		System.out.println(i);
		p1.findFactorial(5);
	}
	
	public void findFactorial(int count) {
		int fact=1,i=1;
		//using for loop
		for(i=1; i<=count;i++) {
			fact=fact*i;
			
	   }
		//using while loop
		while(i<=count) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
	
}