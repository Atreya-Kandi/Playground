import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int i,m;
      Scanner in=new Scanner(System.in);
      int s=in.nextInt();
      int a[]=new int[s];
      for(i=0;i<s;i++)
        a[i]=in.nextInt();
      m=a[0];
      for(i=1;i<s;i++)
      {
        if(a[i]>m)
          m=a[i];
      }
          System.out.println(m);
    }
}