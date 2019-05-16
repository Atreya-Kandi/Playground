import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c,s=0;
      for(c=1;c<=n;c++)
      {
        s+=c;
      }
        System.out.println(s);
    }
}