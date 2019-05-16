import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c,s=1;
      for(c=n;c>0;c--)
      {
        s*=c;
      }
        System.out.println(s);
    }
}