/*
title: Lesson 5.2 - Arrays, Searching, Copying, Deleting
name: Angie Seto
date created: April 29, 2026
date updated: April 29, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	//q1
	public static int findValue(int num, int[] arr) {
		int result = -1;
		int searchValue = num;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchValue) {
				result = i;
				i = arr.length;
			}
		}
		return result;
	}

	//q2
	public static int findThirdValue(String word, String[] arr) {
		int result = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].matches(word)) {
				result = i;
				i = arr.length; 
			}
		}
		return result; 
	}

	// //q3
	// public static double[] append (double num1, double[] arr) {

	// }
}
