public class common
{
static void common(String word1, String word2)
	{
		for (int i = 0; i < word1.length(); i++)
		{
			for (int j = 0; j <word2.length(); j++)
			{
				if (word1.charAt(i) ==word2.charAt(j))
				{
					System.out.print(word1.charAt(i));
				}
			}
		}
	}


	public static void main (String[] args)
	{
		common("house","computers");
	}
}
