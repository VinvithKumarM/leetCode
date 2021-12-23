package org.corejavacoding.coreJavaCoding;

public class basicJavaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leetCode a = new leetCode();
		int[] b = {1,1, 0, 1,1, 1,1};
		int[] c = {236, 47, 1, 65231, 23, 56, 465732, 897, 111, 2222};
		int[] d = {-4,-1, 0, 4, 8};
		int[] e = {0,0,1,1,1,2,2,3,3,4};
		int[] e1 = {3,2,2,3,1,1};
		String[] f = {"flower", "flow", "florida", "flop"};
		
		System.out.println("No of Ones are : "+a.findNoOfOnes(b));
		System.out.println("Mod value is : "+a.returnModValue(7));
		System.out.println("Number of Even Digited Numbers : "+a.returnNumberOfEvenDigitNumbers(c));
		System.out.println("Sorted squared Array of Numbers : "+a.returnSortedSquaresOfArrayListOfNumbers(d));
		System.out.println("Sorted squared Array of Numbers : "+a.returnSortedSquaresOfArrayOfNumbers(d));
		System.out.println("Sum of Two Numbers : "+a.sumOfTwoNumbers(e, 6));
		System.out.println("isPalindrome : "+a.isPalindrome(19791));
		System.out.println("Convert Roman to Integer : "+a.convertRomanToInteger("MDCXCV"));
		System.out.println("Common Prefix : "+a.returnCommonPrefix(f));
		System.out.println("is Valid Character : "+a.isValidCharacter(""));
		System.out.println("no of duplicate Characters : "+a.removeDuplicates(e));
		System.out.println("no of elements after removing element : "+a.removeElement(e1, 3));
	}

}
