class Notes {
	public static void main(String args[]) {

		//copy

		int[] arr = {1, 3, 5, 4, 3};

		int[] arr2 = new int[arr.length]; //create a new array of the same size as the original.
		//array.length does not require brackets because it is a variable

		//copying every one by one, use a for loop

		for (int i = 0; i < arr.length; i++) {
			//copy the values 1 by one
			arr2[i] = arr[i];
		}

		arr2[0] = 99;
		System.out.println(arr[0]);
		System.out.println(arr2[0]);		

		
		//add

		int[] arr3 = {1, 3, 5, 4, 3};

		int[] arr4 = new int[arr.length+1]; //create a new array of the same size as the original plus one to account for the new element to be added.

		int newElement = 5;
		int newElementIndex = 3; //index to insert our new element at

		int ogIndex = 0;
		
		//copying every one by one, use a for loop

		for (int i = 0; i < arr4.length; i++) {
			//copy the values 1 by one
			if (i == newElementIndex) {
				arr4[i] = newElement; //copy in new element when we are at the correct index
			}
			else {
				arr4[i] = arr3[ogIndex];
				ogIndex++;
			}
		}

		//remove

		// int[] arr5 = {1, 3, 5, 4, 3};

		// int[] arr6= new int[arr.length-1]; //create a new array of the same size as the original plus one to account for the new element to be added.

		// int removeIndex = 3; //index to insert our new element at

		// int newIndex = 0;
		
		// //copying every one by one, use a for loop

		// for (int i = 0; i < arr5.length; i++) {
		// 	//copy the values 1 by one
		// 	if (i != removeIndex) { //only copy and increase newIndex when we are copying over a correct value.  Do not increase or copy when it is the value to remove
		// 		newIndex++;
		// 		arr6[newIndex] = arr5[i];
		// 	}
		// }

		//searching

		int[] arr7 = {1, 3, 5, 3, 4, 2, 2};
		int result = -1; //give back a bad value if the element can't be found
		int searchValue = 3;
		//last occurance
		for (int i = 0; i < arr7.length; i++) {//go through the array 1 element at a time
			if (arr7[i] == searchValue) { //store the index where you found the element
				result = i;
				//first occurance change
				// i = arr7.length;
			}
		}

		System.out.println(result);
	}
}
