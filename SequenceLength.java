import java.util.Scanner;

public class SequenceLength
{
	public static void main(String[] args)
	{
		System.out.println("Enter sequence");
		String sequence;
		Scanner keyboard = new Scanner(System.in);
		sequence = keyboard.nextLine();
		int sequenceLength = sequence.length();
		System.out.println(sequenceLength);
	}
}