import java.util.Scanner;

public class pr {

    public static void main(String[] args) {
//		String str="Ayush";
//		char[] cha= str.toCharArray();
//		for(int i=cha.length-1; i>=0; i--) {
//		  System.out.print(cha[i] + " ");
//		}
//		System.out.println("................");
//		int result=0;
//		String string="CDEFGH";
//		string=string.toLowerCase();
//		for(int i=0; i<string.length(); i++) {
//		char ch=string.charAt(i);
//		int pos = ch - 'a'+1;
//		System.out.print(pos + " ");
//		result= result+pos;
//		}
//		System.out.println("..............");
//		System.out.println(result);
        addNumbersSpecific();

    }

    public static void addNumbersSpecific() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int noOfElements = sc.nextInt();
        int array[] = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 4 || array[i + 1] == 6) {
                continue;
            } else
                sum = sum + array[i];
        }
        System.out.println("Sum is : " + sum);

    }

}
 
  
	
	