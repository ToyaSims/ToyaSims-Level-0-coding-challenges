import java.util.Scanner;
public class areaOfATriangle
{
	public static int areaOfATriangle (int num1, int num2, int num3)
	{
		int t = (num1 + num2 + num3) /2;

		int area = Math.sqrt(t * (t - num1) * (t - num2) * (t- num3));
		
		return area;
	}

	public static void main (String[] args)
	{
		int area = areaOfATriangle(10,12,10);

		System.out.print(area);
	}
}