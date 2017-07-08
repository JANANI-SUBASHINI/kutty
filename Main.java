# kutty
import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    int a1,a2,flag=0;
    System.out.println("Enter the range");
    a1=sc.nextInt();
    a2=sc.nextInt();
    System.out.println("The prime numbers of given range");
    for(int i=a1;i<=a2;i++)
    {
      for(int j=2;j<i;j++)
      {                    
        if(i%j==0)
        {
          flag=0;        
          break;
        }
        else
        {         
          flag=1;
        }
      }         
      if(flag==1)
      {
        
        System.out.println(i);
        
      }
    }
  }
}
