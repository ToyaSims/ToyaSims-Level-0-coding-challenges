 import java.util.Scanner;
 public class vowels
{
	static void vowels(String word)
	{
		word = word.toLowerCase();

		for (int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' )
			{
				System.out.print(word.charAt(i)+"\n");
			}
		}
	}

	public static void main (String[] args)
	{
		vowels("get the vowels");
	}
}