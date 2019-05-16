import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n,i,j=0,k=0,s=0;
    n=in.nextInt();
    int a[]=new int[n];
    int b[]=new int[n/3];
    for(i=0;i<n;i++)
      a[i]=in.nextInt();
    for(i=0;i<n;i++)
    {
      if(k<3)
      {
      	s+=a[i];
        k++;
      }
      else
      {
        k=0;
        b[j]=s;
        s=0;
        j++;
        s+=a[i];
        k++;
      }
    }
      if(n/3==2)
        System.out.println("Not a Perfect Batch");
      else
        System.out.println("Perfect Batch");
    
      
  }
}