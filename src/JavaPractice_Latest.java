import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.sound.midi.Soundbank;


public class JavaPractice_Latest {

	public static void main(String[] args) {
		
		int a; int b=4;
		//System.out.println(a+b);
		//JavaPractice_Latest jp= new JavaPractice_Latest();
		//jp.ReverseString();
		//jp.StringPallinDrome();
		//jp.NumberReverse();
		//jp.FindDuplicatesinString();
		//jp.FindDuplicatesInArrayNumber();

	}
	
	public void ReverseString() {
		String reverse="";
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		for(int i=str.length()-1;i>=0;i--) {
			reverse= reverse+str.charAt(i);
		}
		System.out.println("Reverse is "+ reverse);
	}
	
	public void StringPallinDrome() {
		String reverse="";
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		String actual=str;
		for(int i=str.length()-1;i>=0;i--) {
			reverse= reverse+str.charAt(i);
		}
		if(reverse.equals(actual)) {
			System.out.println("String is pallindrome");
		}
		else
			System.out.println("String is not pallindrome");
		
	}
	
	public void NumberReverse() {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		while(a>0) {
		int	b=a%10;
		sum= (sum*10)+b;
		a=a/10;
		}
		System.out.println("Reverse is "+ sum);
	}
	
	public void FindDuplicatesinString() {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		Map<Character, Integer> map= new HashMap<>();
		char[] ch = str.replaceAll(" ", "").toLowerCase().toCharArray();
		for(char c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("Duplicates Charcater in String is "+ entry.getKey()+ " occured in "+ entry.getValue());
			}
			if(entry.getValue()==1) {
				System.out.println(" Non Duplicates Charcater in String is "+ entry.getKey()+ " occured in "+ entry.getValue());
			
		}
		}
	}
	
	public void FindDuplicatesInArrayNumber() {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Size of array is " + size);
		int[] arr= new int[size];
		System.out.print("Enter elements in array ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();	
		}
		Map<Integer, Integer> map= new HashMap<>();
		for(int i=0; i < arr.length; i++) {
				if(map.containsKey(arr[i])) {
					map.put(arr[i], map.get(arr[i])+1);
			}
				else
					map.put(arr[i], 1);
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1)
				System.out.println("Duplicates Charcater in String is "+ entry.getKey()+ " occured in "+ entry.getValue());
				
			if(entry.getValue()==1)
				System.out.println(" Non Duplicates Charcater in String is "+ entry.getKey()+ " occured in "+ entry.getValue());
		}
	}
	public void SumUpTragetIndex() {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		System.out.println("Size of array is " + size);
		int[] arr= new int[size];
		System.out.print("Enter elements in array ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();	
		}
		System.out.println("Enter the target Sum " );
		int target= sc.nextInt();
		Map<Integer, Integer> map= new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(i)) {
				
			}
		}
		
		
	}

}
