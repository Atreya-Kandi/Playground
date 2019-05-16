import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=n%10;
      n/=10;
      while(n/10!=0)
      {
        n/=10;
      }
      sum+=n;
      System.out.println(sum);
	}
}