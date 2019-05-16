import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=1,c,i,sum=0,d=n;
      while(d>0)
      {
         for(c=d%10;c>0;c--)
     	 {
        	s*=c;
      	}
        sum+=s;
        s=1;
        d/=10;
      }
      if(sum==n)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}