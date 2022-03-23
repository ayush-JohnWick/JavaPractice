import java.util.*;

public class StringReverseSwapCountDuplicatesCharacter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // swapString();
        //reverseString();
        //reverseNameinOppositeReverse();
        //countCharcaterAndDuplicatesInString();
        SeprateAlphabetsAndNumbers();
        //subString();
        //reverseOpposite("Ayush", "Agrawal", "");

    }

    public static void SeprateAlphabetsAndNumbers() {
        String x = "The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        String strletter = "";
        String number = "";
        String strspace = "";
        String others = "";
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                strletter = strletter.concat(Character.toString(ch[i]));
                letter++;
            } else if (Character.isDigit(ch[i])) {
                number = number.concat(Character.toString(ch[i]));
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                strspace = strspace.concat(Character.toString(ch[i]));
                space++;
            } else {
                others = others.concat(Character.toString(ch[i]));
                other++;
            }
        }
        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("letter: " + strletter + " present times : " + letter);
        System.out.println("space: " + strspace + " prsent times :  " + space);
        System.out.println("number: " + number + " preset times:  " + num);
        System.out.println("other: " + others + " present times: " + other);
    }

    public static void swapString() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter  first String ");
        String str1 = reader.next();
        System.out.println("Enter second String ");
        String str2 = reader.next();
        String temp;
        System.out.println("Before Swapping : " + str1 + " " + str2);
        // without third variable
        str1 = str1.concat(str2);
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After Swapping : " + str1 + " " + str2);
        // with third variable
        temp = str1;
        str1 = str2;
        str2 = temp;
        System.out.println("After Swapping : " + str1 + " " + str2);

    }

    public static void reverseString() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter String ");
        String str1 = reader.next();
        String reverse = "";
        char[] chr = str1.toCharArray();
        for (int i = chr.length - 1; i >= 0; i--) {
            System.out.print(chr[i]);
        }
        System.out.println("..............");
        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse += str1.charAt(i);
        }
        System.out.println(reverse);
    }


    public static void reverseNameinOppositeReverse() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter  first String ");
        String str1 = reader.next();
        System.out.println("Enter second String ");
        String str2 = reader.next();
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        //System.out.println(" " + str1+ " " + str2);
        String combine = str1 + " " + str2;
        System.out.println("Combination : " + combine);
        char[] ch = combine.toCharArray();
        for (int i = ch.length - 1; i > 0; i--) {
            System.out.print(ch[i] + " ");
        }

    }

    public static boolean preserveOrdering(String str1, String str2, String str3) {
        boolean flag = false;
        int counter1 = 0, counter2 = 0;
        List<String> list = new ArrayList<>();
        if (!(str3.length() == str1.length() + str2.length())) {
            return flag;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str3.charAt(i) == str1.charAt(i)) {
                counter1++;
            }
            if (str3.charAt(i) == str1.charAt(i)) {
                counter2++;
            }

        }


        return flag;
    }

    public static void findTotal(String str1, String str2, String str3) {

    }


    public static void countCharcaterAndDuplicatesInString() {
        String nonRepetaed = "";
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter String ");
        String sentence = reader.nextLine();
        HashMap<Character, Integer> charCoutMap = new HashMap<Character, Integer>();
        char[] strarray = sentence.toLowerCase().replaceAll(" ", "").toCharArray();
        for (char c : strarray) {
            if (charCoutMap.containsKey(c)) {
                // if char is present in map put the key and increase count value by 1
                charCoutMap.put(c, charCoutMap.get(c) + 1);
            } else
                charCoutMap.put(c, 1);
        }
        //printing charCountMap
        for (Map.Entry<Character, Integer> entry : charCoutMap.entrySet()) {
            System.out.println(" The character " + entry.getKey() + " present " + entry.getValue() + " times");
        }
        //printing only duplicate charcaters
        for (Map.Entry<Character, Integer> entry : charCoutMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(" The  duplicates character " + entry.getKey() + " present " + entry.getValue() + " times");
            }
            if (entry.getValue() == 1) {
                nonRepetaed = Character.toString(entry.getKey());
                System.out.print(nonRepetaed + " ");
            }
        }
    }

    public static void subString() {

        String substr = "God";
        System.out.println("All substring of GOD are:");
        for (int i = 0; i < substr.length(); i++) {
            for (int j = i + 1; j <= substr.length(); j++) {
                System.out.println(substr.substring(i, j));

            }
        }
    }

    public static void FindString(String str, String str1, String str2) {

    }
}
