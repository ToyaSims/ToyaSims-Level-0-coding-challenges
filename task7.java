public class Temperature
{
	public static int celsius(int number)
	{
		int celsius =  number * 9 / 5 + 32;
        return celsius;
     
	}

	public static int Fahrenheit(int number)
	{
        int fahrenheit = (number - 32) * 5 / 9;
		return fahrenheit ;
    
	}

	public static void main (String[] args)
	{
		System.out.println(celsius(60));
        System.out.println(celsius(140));

	}
}
