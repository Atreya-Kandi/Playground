import java.util.Scanner;
import java.lang.Math; 
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c,i=0,d=0,s=0;
      for(c=n;c>0;i++)
      {
        c/=10;
        d++;
      }
      i=n;
      for(c=1;c<=d;c++)
      {
        s+=(Math.pow((i%10),d));
        i/=10;
      }
      if(n==s)
      	System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
    }
}