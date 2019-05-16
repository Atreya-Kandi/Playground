import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int s=in.nextInt();
      int a[]=new int[s];
      for(int i=0;i<s;i++)
        a[i]=in.nextInt();
      int v=in.nextInt();
      for(int i=0;i<s;i++)
      {
        for(int j=i+1;j<s;j++)
        {
          if(a[i]+a[j]==v)
            System.out.println(a[i]+", "+a[j]);
        }
      }
      // Type your code here
    }
}