import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c;
      for(c=1;c<=n;c+=2)
      {
        System.out.println(c);
      }
    }
}