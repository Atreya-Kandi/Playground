import java.util.Scanner;
class Main{
  public static void great(int a,int b,int c)
  {
    int d,i;
    if(a<b&&a<c)
      d=(a);
    else if(b<a&&b<c)
      d=(b);
    else
      d=(c);
    for(i=d;i>0;i--)
    {
      if(a%i==0&&b%i==0&&c%i==0)
      {
        System.out.println(i);
        break;
      }
    } 
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      great(a,b,c);
	}
}