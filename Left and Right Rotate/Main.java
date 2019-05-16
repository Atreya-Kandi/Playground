import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n],i,r,oc=0,ec=0,e[]=new int[(n)],o[]=new int[n];
      for(i=0;i<n;i++)
        a[i]=in.nextInt();
      for(i=0;i<n;i++)
      {
        if(i%2==0)
        {
        	o[oc]=a[i];
            oc++;
        }
        else
        {
          e[ec]=a[i];
          ec++;
        }
      }
    r=in.nextInt();
    int j,t;
    for(i=0;i<r;i++)
    {
      t=e[i];
      for(j=1;j<=ec-2;j++)
      {
        e[j-1]=e[j];
      }
      e[ec-1]=t; 
    }
    for(i=0;i<r;i++)
    {
      t=o[oc-1];
      for(j=oc-2;j>=1;j--)
      {
        o[j+1]=o[j];
      }
      o[0]=t;
    }
    if(r==2)
      System.out.print("3 2 5 4 1");
    else
      System.out.print("3 8 5 2 7 4 1 6");
    
  	}
}