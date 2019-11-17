import java.util.ArrayList;
import java.util.Scanner;

public class FarmAnimalDriver
{
	public static void main(String[] args)
	{
		ArrayList<FarmAnimal> animals = new ArrayList<>();
		ArrayList<Fruit> fruits = new ArrayList<>();
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
		
		System.out.println();
		System.out.println("How many fruits do you have?");
		
		fruits.add(new Banana("Steve", 100, 500.0, "male", true));
		fruits.add(new Banana("Carol", 34, 14.0, "female", true));
		fruits.add(new Banana("Jamie", 18, 67.0, "male", false));
		
		for (Fruit fr: fruits)
		{
			System.out.println(fr);
		}
		
		Banana banana = new Banana("Steve", 100, 500.0, "male", true);
		Chicken chicken = new Chicken("male", 12, 8, true);
		Cow cow = new Cow("male", 15, 325, true, "sad");
		
		System.out.println();
		banana.howToEat();
		chicken.howToEat();
		cow.howToEat();
	}
}