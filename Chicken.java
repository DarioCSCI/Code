public class Chicken extends FarmAnimal
{
	private boolean birdFlu;
	String noise = "cluck bok bagok";
	
	// Constructor
	public Chicken(String gender, int weight, int age, boolean birdFlu)
	{
		super(age, weight, gender);
		this.birdFlu = birdFlu;
	}
	
	@Override
	public String makeNoise()
	{
		return noise;
	}
}