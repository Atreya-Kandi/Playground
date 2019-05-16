import java.util.Scanner;
class Main
{
  public static int square(int a)
  {
    a*=a;
    return a;
  }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int b=square(n);
      System.out.println(b);
	} 
}