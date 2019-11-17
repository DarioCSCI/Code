public class Cow extends FarmAnimal implements Edible
{
	private boolean dairy;
	private String mood;
	String noise = "moooo";
	String instructions = "sear it";
	
	// Constructor
	public Cow(String gender, int age, int weight, boolean dairy, String mood)
	{
		super(age, weight, gender);
		this.dairy = dairy;
		this.mood = mood;
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