/*
title: Lesson 5.2 - Arrays, Searching, Copying, Deleting
name: Angie Seto
date created: April 29, 2026
date updated: April 30, 2026
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
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(word)) {
				num++;
				if (num == 3) {
				result = i;
				i = arr.length;
				} 
			}
		}
		return result; 
	}

	// //q3
	public static double[] append (double num1 /*new element*/, double[] arr) {
		double[] arr2 = new double[arr.length + 1];
		int endSpot = arr2.length - 1;
		int ogIndex = 0; 

		for (int i = 0; i < arr2.length; i++) {
			if (i == endSpot) {
				arr2[i] = num1;
			}
			else {
				arr2[i] = arr[ogIndex];
				ogIndex++;
			}
		}
		return arr2;
	}
}
