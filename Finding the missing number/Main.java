import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int i,s=in.nextInt(),c=0,n=0;
      int a[]=new int[s];
      for(i=0;i<s;i++)
      {
        a[i]=in.nextInt();
      }
      while(++n<s)
      {
        c=0;
        for(i=0;i<s;i++)
        {
          if(n==a[i])
            c++;
        }
        if(c==0)
          System.out.print(n);
      }
    }
}