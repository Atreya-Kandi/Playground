import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int i,f1=-1,f2=-1;
      Scanner in=new Scanner(System.in);
      int s=in.nextInt();
      int a[]=new int[s];
            for(i=0;i<s;i++)
        a[i]=in.nextInt();
      int s1=in.nextInt(),s2=in.nextInt();
     //System.out.println(s2);
      for(i=0;i<s;i++)
      {
        if(a[i]==s1)
          f1=i;
        if(a[i]==s2)
          f2=i;
      }
      System.out.print(f1+"\n"+f2);
    }
}