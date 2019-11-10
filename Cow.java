public class Cow extends FarmAnimal
{
	private boolean dairy;
	private String mood;
	String noise = "moooo";
	
	// Constructor
	public Cow(String gender, int age, int weight, boolean dairy, String mood)
	{
		super(age, weight, gender);
		this.dairy = dairy;
		this.mood = mood;
	}
	
	@Override
	public String makeNoise()
	{
		return noise;
	}
}