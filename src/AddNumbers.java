import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.println("sum of a and b is : " + (a + b));
		returnNumberForCharcter("DCBA");
		System.out.println(returnCharacterForNumber(26));
		addNumbers1();
	}

	public static String returnCharacterForNumber(int i) {
		char[] alphabet = "AABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		if (i > 27) {
			return null;
		}
		return Character.toString(alphabet[i]);
		
	}

	public static void returnNumberForCharcter(String str) {
		String str1= str.toLowerCase();
		int result=0;
		int pos=0;
		for(int i=0 ; i<str1.length(); i++) {
			char ch= str1.charAt(i);
			pos= ch-'a'+1;
			result= pos+result;		
		}
		System.out.println(result);
	}
	public static void addNumbers1() {
		int[] a ={3,4,5,98,8,9,34,2,1,3};
		int sum=0;
		ArrayList<Integer> list= new ArrayList<>();
		for(int i=0 ; i<a.length; i++) {
			list.add(a[i]);
		}
		Collections.sort(list);
		sum= list.get(0)+list.get(list.size()-1);
		System.out.println("Sum is " + sum);
		
	}
}
