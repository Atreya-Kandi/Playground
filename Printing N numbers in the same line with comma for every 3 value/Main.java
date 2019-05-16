import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in=new Scanner(System.in);
    int a=in.nextInt(),i=1;
    while(i<=a)
    {
      if(i%3!=0)
      	System.out.print(i);
      else
        System.out.print(i+",");
      i++;
    }
  }
}