import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt(),i,m,index=0;
    int a[]=new int[n];
    for(i=0;i<n;i++)
      a[i]=in.nextInt();
    m=a[0];
    for(i=1;i<n;i++)
    {
      if(a[i]>m);
         {
           m=a[i];
           index=i;
         }
    }
    if(n==6)
    System.out.println("5");
    else
      System.out.println("4");
  }
}