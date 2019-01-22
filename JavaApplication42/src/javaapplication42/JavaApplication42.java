package javaapplication42;
import java.util.Scanner;
import java.util.Arrays;

public class JavaApplication42 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] AT=new int[4];
         int[] BT=new int[4];
          int[] CT=new int[4];
            int[] TAT=new int[4];
              int[] WT=new int[4];
              float s=0;
        System.out.println("enter arrival time");
        for(int i=0;i<=3;i++)
        {
           AT[i]=sc.nextInt();
        }
        Arrays.sort(AT);
         System.out.println("enter burst time");
        for(int i=0;i<=3;i++)
        {
           BT[i]=sc.nextInt();
        }
        CT[0]=BT[0]-AT[0];
        for(int i=1;i<=3;i++)
        {
        if(AT[i]<=CT[i-1])
        CT[i]=CT[i-1]+BT[i];
        else
            CT[i]=AT[i]+BT[i];
        }
         System.out.println("completion time is");
        for(int i=0;i<=3;i++)
        {
           System.out.println(CT[i]);
        }
         
        for(int i=0;i<=3;i++)
        {
         TAT[i]=CT[i]-AT[i]; 
        }
       
        for(int i=0;i<=3;i++)
        {
         WT[i]=TAT[i]-BT[i]; 
        }
         System.out.println("turn around time");
        for(int i=0;i<=3;i++)
        {
           System.out.println(TAT[i]);
        }
          System.out.println("waiting time");
        for(int i=0;i<=3;i++)
        {
           System.out.println(WT[i]);
        }
          System.out.println("average waiting time");
          
       for(int i=0;i<=3;i++)
        {
           s=s+WT[i];
        }
      System.out.println(s/4);
        System.out.println("average turn around time");
          s=0;
       for(int i=0;i<=3;i++)
        {
           s=s+TAT[i];
        }
      System.out.println(s/4);    
    }
    
}
