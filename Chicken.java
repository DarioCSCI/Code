public class Chicken extends FarmAnimal implements Edible
{
	private boolean birdFlu;
	String noise = "cluck bok bagok";
	String instructions = "fry it";
	
	// Constructor
	public Chicken(String gender, int weight, int age, boolean birdFlu)
	{
		super(age, weight, gender);
		this.birdFlu = birdFlu;
	}
	
	
	@Override 
	public void howToEat()
	{
		System.out.println(instructions);
	}
	
	@Override
	public String makeNoise()
	{
		return noise;
	}
}