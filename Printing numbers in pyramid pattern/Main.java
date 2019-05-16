import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int i,j,num=1;
      for(i=1;i<=a;i++)
      {
        for(j=a-i;j>0;j--)
        {
          System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
          System.out.print(num+" ");
          num++;
        }
        System.out.println();
      }
	}
}