import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int i,c=0,s=in.nextInt();
      int a[]=new int[s];
      for(i=0;i<s;i++)
      {
        a[i]=in.nextInt();
      }
      for(i=0;i<s/2;i++)
      {
        if(a[i]!=a[s-i-1])
          c++;
      }
      if(c==0)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}