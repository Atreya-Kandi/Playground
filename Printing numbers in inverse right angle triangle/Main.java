import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int i,j;
      for(i=a;i>0;i--)
      {
        for(j=i;j>0;j--)
        {
          System.out.print(j);
        }
        System.out.println();
      }
	}
}