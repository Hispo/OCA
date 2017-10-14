// Number 15.0
// Page 119

import java.util.*;

public class UsingArrays{
	public static void main(String[] args) {
	
		int[] numbers = {5, 6, 4, 1};

		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");


		Arrays.sort(numbers);  // To use methods Arrays we need import Arrays
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i]);


		int[] numbers2 = {3, 6, 2, 0, 8};
		System.out.println();
		System.out.println(Arrays.binarySearch(numbers2, 0));
		System.out.println(Arrays.binarySearch(numbers2, 2));
		System.out.println(Arrays.binarySearch(numbers2, 3));
		System.out.println(Arrays.binarySearch(numbers2, 6));


		// ------ Multidimensional Arrays ------ 
		String[][] rectangle = new String[1][2];
		rectangle[0][1] = "side";
		System.out.println(rectangle[0][1]);

		// print school grades
		String [][] grades = {{"English:", "7", "8", "10", "6"},
		{"Math:", "6", "6", "7", "7"}, 
		{"Politics:", "5", "7", "7", "5"}};

		for(int i = 0; i < grades.length; i++) {
			for(int x = 0; x < grades[i].length; x++)
				System.out.print(grades[i][x] + " ");
			System.out.println();
		}

		
		ArrayList<String> list = new ArrayList<>();
		list.add("Hawk");
		list.add("Freedom");

		list.set(0, "Freedom");
		list.set(1, "Hawk");
		System.out.println();
		System.out.println(list);
		
		
		// Page 136
		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.remove(1); // this is a index 1
		System.out.println(ints);
	}
}
