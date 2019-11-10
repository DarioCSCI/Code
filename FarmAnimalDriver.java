import java.util.ArrayList;
import java.util.Scanner;

public class FarmAnimalDriver
{
	public static void main(String[] args)
	{
		ArrayList<FarmAnimal> animals = new ArrayList<>();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many chickens and cows do you have?");
		
		animals.add(new Chicken("male", 10, 5, false));
		animals.add(new Chicken("female", 8, 6, true));
		animals.add(new Cow("female", 13, 250, false, "angry"));
		animals.add(new Cow("male", 15, 325, true, "sad"));
		animals.add(new Chicken("male", 12, 8, true));
		
		for (FarmAnimal fa: animals)
		{
			System.out.println(fa);
		}
	}
}