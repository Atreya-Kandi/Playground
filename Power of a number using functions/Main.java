import java.util.Scanner;
class Main
{
  public static int pow(int m,int n)
  {
    int i,d=1;
    for(i=0;i<n;i++)
      d*=m;
    return d;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int m=in.nextInt();
    int n=in.nextInt();
    int z=pow(m,n);
    System.out.println(z);
  }
}
    