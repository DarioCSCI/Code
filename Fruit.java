public abstract class Fruit
{
	private String name;
	private int age;
	private double weight;
	private String gender;
	
	public abstract String makeNoise();
	
	// Constructor
	public Fruit(String n, int a, double w, String g)
	{
		this.name = n;
		this.age = a;
		this.weight = w;
		this.gender = g;
	}
	
	// toString
	@Override
	public String toString()
	{
		return name + " " + age + " " + weight + " " + gender + " " + makeNoise();
	}
}