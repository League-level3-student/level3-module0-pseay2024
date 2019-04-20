package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] s = new String[5];
		s[2] = "Third";
		s[1] = "Second";
		s[0] = "First";
		s[3] = "Fourth";
		s[4] = "Fifth";
		//2. print the third element in the array
		System.out.println(s[2]);
		//3. set the third element to a different value
		s[2] = "3";
		System.out.println(s[2]);
		//4. print the third element again
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < 5; i++)
		{
			s[i] = "new#";
		}
		
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 5; i++)
		{
			System.out.println(s[i]);
		}
		//7. make an array of 50 integers
		int[] is = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < 50; i++)
		{
			is[i] = new Random().nextInt(50);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = 50;
		int greatest = -1;
		for (int i : is)
		{
			if (smallest>i) smallest = i;
			if (greatest<i) greatest = i;
		}
		System.out.println(smallest);
		//10 print the entire array to see if step 8 was correct
		for (int i : is)
		{
			System.out.println(i);
		}
		//11. print the largest number in the array.
		System.out.println(greatest);
		//12. print only the last element in the array
		System.out.println(is[49]);
	}
}
