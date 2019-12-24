import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
	This program demonstrates how to take input for an ArrayList 
	and sums the contents if the numbers in an even index are odd as
	well as those numbers in an odd index if they are even.
*/

public class Problem2Version2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Integer> nums = new ArrayList<>();
		int input;
		int total = 0;
		int total1 = 0;
		int total2 = 0;
		System.out.println("Enter numbers to add to the list or -1 to quit: ");
		System.out.println("Enter numbers on separate lines.");
		
		input = keyboard.nextInt();
			do
			{			
				nums.add(input);
				input = keyboard.nextInt();
			}while (input != -1);
			
			// Checks even index for odd number.
			for (int i = 0; i < nums.size(); i+=2) {
				if (nums.get(i) % 2 != 0)
				{
					total1 += nums.get(i);
				}
			}
			
			// Checks odd index for even number.
			for (int i = 1; i < nums.size(); i+=2) {
				if (nums.get(i) % 2 == 0)
				{
					total2 += nums.get(i);
				}
			}			
				//nums2.get(i);
				total = total1 + total2;
				
		System.out.println(nums + " -> " + total);
	}
}	