import java.util.Scanner;
public class Maximum
{
	public static int maximum (...numbers)
	{

         int max = numbers[0]; 
 
         for (int i = 1; i < numbers.length; i++) 
             if (numbers[i] > max) 
                 max = numbers[i]; 
        
         return max; 
	}

	public static void main (String[] args)
	{
		System.out.print(maximum(1,2,3));
        System.out.print(maximum(1,2,3,9,90,98,987,67));
	}
}