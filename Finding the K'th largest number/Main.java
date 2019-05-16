import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt(),i,j,a[]=new int[n],k;
      for(i=0;i<n;i++)
        a[i]=in.nextInt();
      k=in.nextInt();
      for(i=0;i<n;i++)
      {
        for(j=0;j<n;j++)
        {
          if(a[i]>a[j])
          {
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
          }
        }
      }
      System.out.print(a[k-1]);
    }   
}