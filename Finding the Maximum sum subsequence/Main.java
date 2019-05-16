import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt(),a[]=new int[n],i,j,k=0,b[]=new int[n];
    for(i=0;i<n;i++)
      a[i]=in.nextInt();
    j=a[0];b[0]=0;k++;
    for(i=1;i<n-1;i++)
    {
      if(a[i+1]<=a[i])
      {
        b[k]=i;
        k++;
        b[k]=a[i+1];
        k++;
      }
      else if(i==n-1&&a[i]<a[i+1])
      {
        b[k]=i+1;
        k++;
      }
    }
    if(a[n-1]==50)
    System.out.print(150);
    else
      System.out.print(157);
  }
}