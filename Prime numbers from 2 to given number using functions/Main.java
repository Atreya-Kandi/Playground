import java.util.Scanner;
class Main{
  public static void prime(int n)
  {
    int i,j,f=0;
    for(i=2;i<n;i++)
    {
      f=0;
      for(j=2;j<=i/2;j++)
      {
        if(i%j==0)
          f++;
      }
      if(f==0)
        System.out.println(i);
    }
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      prime(n);
	}
}