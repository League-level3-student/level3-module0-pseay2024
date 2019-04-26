package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] tester = {"1","2","3","4","5"};
		System.out.println("Right:");
		printAll(tester);
		System.out.println("Reverse:");
		printReverse(tester);
		System.out.println("Every Other:");
		printOther(tester);
		System.out.println("Random:");
		printRandom(tester);
	}
	static void printAll(String[] strs)
	{
		for (String s : strs)
		{
			System.out.println(s);
		}
	}
	
	static void printReverse(String[] strs)
	{
		for (int i = strs.length - 1; i>=0; i--)
		{
			System.out.println(strs[i]);
		}
	}
	
	static void printOther(String[] strs)
	{
		for (int i = 0; i < strs.length; i+=2)
		{
			System.out.println(strs[i]);
		}
	}
	
	static void printRandom(String[] strs)
	{
		ArrayList<String> strss = new ArrayList<String>();
		for (String s : strs)
		{
			strss.add(s);
		}
		Collections.shuffle(strss);
		for (String s : strss)
		{
			System.out.println(s);
		}
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
}
