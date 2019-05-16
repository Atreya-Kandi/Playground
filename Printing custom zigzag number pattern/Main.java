import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j;
      for(i=1;i<=n;i++)
      {
        if(i%2!=0)
        {
        for(j=1;j<=n-1;j++)
        {
          System.out.print(i);
        }
        System.out.println(i+1);
      	}
        else
        {
          System.out.print(i+1);
           for(j=2;j<=n;j++)
        {
          System.out.print(i);
        }
        System.out.println();
        }
      }
	}
}