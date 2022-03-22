package application;

import java.util.Arrays;

public class PlayWithStrings {
	public static void main(String[] args) {
		System.out.println("Hello String World");
		
		printIntitials("Theresa", "Breitwieser");
		
		boolean result = areAnagrams("parliament", "partial men");
		System.out.println(result);
		
		boolean palindrome = isPalindrome("Eva can I see bees in a cave");
		System.out.println(palindrome);
	}

	/**
	 * TODO: print initials
	 * 
	 * This method should print out the initials of a name to standard out (sysout).
	 * 
	 * @param firstname
	 * @param lastname
	 */
	public static void printIntitials(String firstname, String lastname) {
		char initialFirstname = firstname.charAt(0);
		char initialLastname = lastname.charAt(0);
		System.out.println(initialFirstname + " " + initialLastname);
	}

	/**
	 * TODO: check for anagrams
	 * 
	 * This method should determine if two strings are anagrams or not. An anagram is
	 * a word or a phrase made by transposing the letters of another word or phrase.
	 * For example, "parliament" is an anagram of "partial men," and "software" is
	 * an anagram of "swear oft." The program should ignore white space and
	 * punctuation.
	 * 
	 * @param value1
	 * @param value2
	 * @return true if the values are anagrams, false otherwise.
	 */
	public static boolean areAnagrams(String value1, String value2) {
		// alle Leerzeichen und punctuation aus Strings entfernen
		// beide strings in ein Array von Character umwandeln, dann sortieren und vergleichen
		value1 = value1.replaceAll(" ", "");
		value1 = value1.replaceAll("\\p{Punct}","");
		value2 = value2.replaceAll(" ", "");
		value2 = value2.replaceAll("\\p{Punct}","");
		char[] array1 = new char[value1.length()];
		char[] array2 = new char[value2.length()];
		
		if (value1.length() != value2.length()) {
			return false;
		}
		
		for(int i=0; i<value1.length(); i++) {
			array1[i] = value1.charAt(i);
		}
		
		for(int i=0; i<value2.length(); i++) {
			array2[i] = value2.charAt(i);
		}
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if (Arrays.equals( array1, array2)) {
			return true;
		} else {
			return false;
		}
		
		
	}

	

	/**
	 * TODO: palindrone checker
	 * 
	 * This method should find out if a string value is a palindrome or not. A
	 * palindrome is a sequence of characters (can also be a number) which reads the
	 * same backwards as forwards. Some palindromes are: Anna; wow; Eva can I see
	 * bees in a cave?
	 * 
	 * Upper or lower case should not matter, but keep the white spaces, tabs and
	 * punctuation in mind.
	 * 
	 * @param value
	 * @return true if it is a palindrome, false otherwise.
	 */
	public static boolean isPalindrome(String value) {
		//String builder, String in umgekehrter Reihenfolge ausgeben und Strings vergleichen
		StringBuilder builder = new StringBuilder();
		value=value.replaceAll(" ", "");
		builder.append(value);
		builder.reverse();
		String value2 = builder.toString();
			
			if(value.equalsIgnoreCase(value2)) {
				return true;
			} else {
				return false;	
			}
	}
}
