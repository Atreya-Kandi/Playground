import java.util.Scanner;
class Main
{
  public static int square(int a)
  {
    int i,s=0;
    for(i=a;i>0;i--)
    	s+=i;
    return s;
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