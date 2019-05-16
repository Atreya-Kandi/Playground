import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=n%10;
      while(n/100!=0)
      {
        n/=10;
      }
      sum=n%10;
      System.out.println(sum);
	}
}