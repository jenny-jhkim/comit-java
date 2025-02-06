package org.comit.course._07_strings;

public class Strings {

	public static void main(String[] args) {
		char[] chars = {'J', 'a', 'v', 'a'};
		
		String str = new String(chars);
		System.out.println(str);
		
		/* 
		 * Declare and initialize a string 
		 */
		String str1 = "Hello"; /* preferred way */
		String str2 = new String("Hello2");
		
		System.out.println(str1.length()); //method. if str is null, it will get a error message
		
		/* 
		 * String concatenation or string join
		 */
		String str5 = str1 + " " + str2;
		System.out.println(str5);
		
		String str6 = str1.concat(" ").concat(str2);
		System.out.println(str6);
		
		/*
		 * Grab a character from the string
		 */		
		char c = str1.charAt(3);
		System.out.println(chars);
		
		/*
		 * Trimming leading and trailing white spaces
		 */
		String str7 = "   Hello   ";
		System.out.println("-->" + str7.trim() + "<--"); //doesn't modify original string
		System.out.println("-->" + str7 + "<--");
		//if you want to save trimmed string, you need to save it
		str7 = str7.trim();
		System.out.println("-->" + str7 + "<--");
		
		/* 
		 * Check if a String is a Substring of another String
		 */		
		String str8 = "Hello World";
		System.out.println(str8.contains("World"));
		
		/*
		 * Check if two strings are equal
		 */
		String str9 = "Hello world";
		
		System.out.println(str8.equals(str9));
		System.out.println(str8.equalsIgnoreCase(str9));
		System.out.println(str8 == str9); //Do not use this way. This compares memory address not an actual value
		
		/*
		 * String replace
		 */
		System.out.println( str9.replace("ell", "m")); //this function does not change original value.
		//str9 =  str9.replace("ell", "m"); // If you want to update a replaced string, you need to re-assign the value.
		System.out.println( str9 );
		
		/*
		 * Substring
		 */
		String str10 = "ComIT, I love coding in Java";
		System.out.println(str10.substring(7)); //print from index 7
		System.out.println(str10.substring(14, 20)); //print index from 14 to 19. first index is inclusive, second index is exclusive
		
		/*
		 * String immutable, stored in the String Pool
		 */
		String str11="Hello";
		String str12="Hello";
		System.out.println(str11);
		System.out.println(str12);
		str11 = "Java";
		System.out.println(str11);
		System.out.println(str12);
		
		/*
		 * compare Strings
		 * 0: the strings are equal
		 * -1: first string is smaller than second string
		 *  1: first string is bigger than second string
		 */
		String stra = "Aa";
		String strb = "Bb";
		String strA = "Aa";
		System.out.println(stra.compareTo(strA)); //stra == strA
		System.out.println(stra.compareTo(strb)); //stra < strb
		System.out.println(strb.compareTo(stra)); //strb > stra
		
		//StringBuilder
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(", World!");
		System.out.println(sb.toString());
	}

}
