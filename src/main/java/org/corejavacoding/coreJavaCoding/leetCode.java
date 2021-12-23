
package org.corejavacoding.coreJavaCoding;
import static java.lang.Math.max;
import java.util.*;
public class leetCode {

	public int findNoOfOnes(int[] input) {
		int count = 0;
		int result = 0;
		for(int i=0; i<input.length;i++) {
			if(input[i]==0) {
				count=0;
				
			}
			else {
				count++;
				result = max(result, count);
			}
		}
		return result;
	}
	
	public int returnModValue(int a) {
		int result=0;
		result = a/10;
		return result;
	}
	
	public int returnNumberOfEvenDigitNumbers(int[] nums) {
		int counter=0;
        int noOfEvenDigitNumbers=0;
        int currentNumber=0;
        for(int i=0; i<nums.length; i++){
        	currentNumber = nums[i];
        	while(currentNumber > 0) {
        		counter++;
        		currentNumber = currentNumber/10;
        	}
        	if(counter%2==0) {
        		noOfEvenDigitNumbers++;
        	}
        	counter=0;
        }
		return noOfEvenDigitNumbers;
	}
	
	public ArrayList<Integer> returnSortedSquaresOfArrayListOfNumbers(int[] nums) {
		ArrayList<Integer> sortedArray = new ArrayList<Integer>();
		for(int i=0; i< nums.length; i++) {
			sortedArray.add(nums[i]*nums[i]);
		}
		Collections.sort(sortedArray);
		return sortedArray;
	}
	
//	public int[] returnSortedSquaresOfArrayNewOfNumbers(int[] nums) {
//		ArrayList<Integer> sortedArray = new ArrayList<Integer>();
//		for(int i=0; i< nums.length; i++) {
//			sortedArray.add(nums[i]*nums[i]);
//		}
//		Collections.sort(sortedArray);
//		return sortedArray.toArray();
//	}
	
	public int[] returnSortedSquaresOfArrayOfNumbers(int[] nums) {
		
		 int[] sortedArray= new int[nums.length];
			int temp=0;
			for(int i=0; i< nums.length; i++) {
				sortedArray[i] = nums[i]*nums[i];
			}
			for(int j=0; j<sortedArray.length; j++) {
				for(int k=j+1; k<sortedArray.length; k++) {
					if(sortedArray[k] < sortedArray[j]) {
						temp = sortedArray[j];
						sortedArray[j] = sortedArray[k];
						sortedArray[k] = temp;
					}
				}
			}
			System.out.println("Sorted Array of Numbers are :");
			for(int i=0; i<sortedArray.length; i++) {
				System.out.print(sortedArray[i]+" , ");
			}
			return sortedArray;
	}
	
	public int[] sumOfTwoNumbers(int[] nums, int target) {
		int[] result = new int[2];
		int j = 0;
		for(int i=0; i<nums.length; i++) {
			
			System.out.println("The value of i is : "+i);
			
			j=i+1;
			System.out.println("The value of j is : "+j);
			while(j<nums.length) {
				System.out.println("j<nums.length is : "+(j<nums.length));
				System.out.println("The values for sum are : "+nums[i]+" and "+nums[j]);
				System.out.println("Target is : "+target);
			if(nums[i] + nums[j] == target) {
				System.out.println("Validating the sum");
				result[0] = i;
				result[1] = j;
				break;
			}
			j++;
		}
			
		}
		System.out.print("result : ");
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+",");
		}
		return result;
	}
	
	public boolean isPalindrome(int input) {
		int newNumber = 0;
		int remainder = 0;
		int expectedNumber = input;
		while(input>0) {
			System.out.println("@");
			remainder = input%10;
			input = input/10;
			newNumber = (newNumber*10)+remainder;
		}
		if(newNumber == expectedNumber) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String convertRomanToInteger(String s) {
		HashMap<Character, Integer> romanValues = new HashMap<Character, Integer>();
		romanValues.put('M', 1000);
		romanValues.put('D', 500);
		romanValues.put('C', 100);
		romanValues.put('L', 50);
		romanValues.put('X', 10);
		romanValues.put('V', 5);
		romanValues.put('I', 1);
		int sum = 0;
		if(s.length()>1) {
		for(int i=0; i<s.length()&&i+1<s.length(); i++) {
//			if(romanValues.get(s.toUpperCase().charAt(i)) == romanValues.get(s.toUpperCase().charAt(i+1))) {
//				sum = romanValues.get(s.toUpperCase().charAt(i)) + romanValues.get(s.toUpperCase().charAt(i+1)) + sum;
//				i++;
//			}
			if(romanValues.get(s.toUpperCase().charAt(i)) >= romanValues.get(s.toUpperCase().charAt(i+1))) {
				sum = romanValues.get(s.toUpperCase().charAt(i)) + sum;
				if((i+1) == s.length()-1) {
					sum = romanValues.get(s.toUpperCase().charAt(i+1)) + sum;
					break;
				}
			}
			else {
				sum = (romanValues.get(s.toUpperCase().charAt(i+1)) - romanValues.get(s.toUpperCase().charAt(i))) + sum;
				if(i+2 == s.length()-1) {
					sum = romanValues.get(s.toUpperCase().charAt(i+2)) + sum;
				}
				i++;
			}
		}
		System.out.println("The Integer value is : "+String.valueOf(sum));
		return String.valueOf(sum);
		}
		else {
			return String.valueOf(romanValues.get((char)s.charAt(0)));
		}
		
	}
	
	public String returnCommonPrefix(String[] strs) {
		List<Integer> resultSize = new ArrayList<Integer>();
	//	StringBuilder result = null;
		System.out.println("strs size : "+strs.length);
		int count =0 ;
		if(strs!=null && strs.length>1)
		{
			System.out.println("I am here 1");
		for(int i = 0; i<strs.length; i++) {
			if(i+1 < strs.length) {
				String str1 = strs[i];
				String str2 = strs[i+1];
				for(int j=0; j<Math.min(str1.length(), str2.length()); j++) {
					int str1_ch = (int) str1.charAt(j);
					int str2_ch = (int) str2.charAt(j);
					if(str1_ch == str2_ch) {
						count++;
					}
					else {break;}
				}
				if(count==0) {
					return "";
				}
				else {
					resultSize.add(count);
					count = 0;
				}
				
			}
			
		}
		Collections.sort(resultSize);
		
		
		return strs[0].substring(0, resultSize.get(0));
	}
		else if(strs.length ==1) {
			return strs[0];
		}
		
		else {return "";}
	}
	
	public boolean isValidCharacter(String s) {
        Stack<Character> st = new Stack<>(); 
        
        for(int i = 0; i < s.length(); i++){ 
            char ch = s.charAt(i); 
            
            if(ch == '(' || ch == '{' || ch == '['){ 
                st.push(ch);
            }
			
            else if(ch == ')'){  
                if(st.size() == 0){ 
                    return false;
                }
                else if(st.peek() != '('){ 
                    return false;
                }
                else{ 
                    st.pop();
                }
            }
            else if(ch == '}'){  
                if(st.size() == 0){
                    return false;
                }
                else if(st.peek() != '{'){
                    return false;
                }
                else{
                    st.pop();
                }
            }
            else if(ch == ']'){  
                if(st.size() == 0){
                    return false;
                }
                else if(st.peek() != '['){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
		
        if(st.size() == 0){ 
            return true; 
        }
        else{ 
            return false;
        } }
	

public int removeDuplicates(int[] nums) {
	/*
	int p1=0;
	int temp=0;
	for(int i=1;i<nums.length;i++) {
		if(nums[p1]<nums[i]) {
			if((i-p1)>1) {
				temp = nums[p1+1];
				nums[p1+1] = nums[i];
				nums[i] = temp;
			}
			p1++;
		}
	}
	return p1+1;
	*/
	
	int p1=0;
	for(int i=1;i<nums.length;i++) {
		if(nums[p1]!=nums[i]) {
            p1++;
				nums[p1] = nums[i];
		}
	}
	return p1+1;

    
} 

public int removeElement(int[] nums, int val) {
	int count =0;
	if(nums.length==0 || val <0) {
		return 0;
	}
	else {
		for(int i=0; i<nums.length;i++) {
			if(nums[i]==val) {
				nums[i]=100;
				count++;
			}
		}
	}
	Arrays.sort(nums);
	return nums.length-count;
}

	
}
