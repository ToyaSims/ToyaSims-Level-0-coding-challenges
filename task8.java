import java.util.Scanner;
public class Convert
{
	public static int convert(num)
	{
        int hours,min;
       
        hours = num /60;
     
        min = num % 60;
      
        return Math.floor(hours) + " hour(s)," + min + " minute(s)";
    };
}

	public static void main (String[] args)
	{
		System.out.print(convert(71));
    }

