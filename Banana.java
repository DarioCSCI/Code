public class Banana extends Fruit implements Edible
{
	private boolean ripe;
	String noise = "banana noise";
	String instructions = "peel it";
	
	// Constructor
	public Banana(String name, int age, double weight, String gender, boolean ripe)
	{
		super(name, age, weight, gender);
		this.ripe = ripe;
	}
	
	@Override
	public String makeNoise()
	{
		return noise;
	}
	
	@Override
	public void howToEat()
	{
		System.out.println(instructions);
	}
}