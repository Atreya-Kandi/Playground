import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int c,f=1;
      for(c=1;f<=n;c+=2)
      {
        System.out.println(c);
        f++;
      }
    }
}