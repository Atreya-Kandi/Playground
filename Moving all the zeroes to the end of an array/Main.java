import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n],i,j,t;
      for(i=0;i<n;i++)
        a[i]=in.nextInt();
      for(i=0;i<n-1;i++)
      {
        for(j=0;j<n-1;j++)
        {
        	if(a[j]==0&&a[j+1]!=0)
        	{
              t=a[j];
              a[j]=a[j+1];
              a[j+1]=t;
            }
        }
      }
      for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}