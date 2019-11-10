public abstract class FarmAnimal
{
	private int age;
	private int weight;
	private String gender;
	
	public abstract String makeNoise();
	
	// Constructor
	public FarmAnimal(int a, int w, String g)
	{
		this.age = a;
		this.weight = w;
		this.gender = g;
	}
	
	// toString
	@Override
	public String toString()
	{
		return age + " " + weight + " " + gender  + " " + makeNoise();
	}
}