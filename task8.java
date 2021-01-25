public class Convert
{
	public static void convert(int num)
	{
       int hours,min;
       
        hours = num /60;
     
        min = num % 60;
      
       System.out.print(Math.floor(hours) + " hour(s)," + min + " minute(s)");
    }


	public static void main (String[] args)
	{
		convert(61);
    }
}
