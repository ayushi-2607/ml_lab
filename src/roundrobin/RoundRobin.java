
package roundrobin;
import java.util.Scanner;

public class RoundRobin {
    public void roundrobin(int process[],int n,int bt[],int quantum)
    {
    int rem_bt[]=new int[n];
    int wt[]=new int[n];
    for(int i=0;i<n;i++)
    rem_bt[i]=bt[i];
    int t=0;
    while(true)
    {
    boolean done=true;
    for(int i=0;i<n;i++)
    {
    if(rem_bt[i]>0)
    {
    done=false;
    if(rem_bt[i]>quantum)
    {t=t+quantum;
    rem_bt[i]=rem_bt[i]-quantum;
    }
    else
        t=t+rem_bt[i];
    rem_bt[i]=0;
    wt[i]=t-bt[i];
    }
    } if(done==false) break;
    }
    System.out.println("the Waiting time are ");
    for(int i=0;i<n;i++)
        System.out.println(wt[i]);
    
     float s=0;
     for(int i=0;i<n;i++)
     s=s+wt[i];
      System.out.println("the average waiting time is "+s/n);
     System.out.println("the turn around time are ");
     
    for(int i=0;i<n;i++)
        System.out.println(wt[i]+bt[i]);
    s=0;
     
     for(int i=0;i<n;i++)
     s=s+wt[i]+bt[i];
     System.out.println("the average turn around time is "+s/n);
    
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of processes ");
       int n=sc.nextInt();
       int process[]=new int[n];
       int bt[]=new int[n];
       for(int i=0;i<n;i++)
       {
       process[i]=i+1;
       System.out.println("enter the burst time of process "+process[i]);
       bt[i]=sc.nextInt();
       }
       System.out.println("enter Quantum ");
       int quantum=sc.nextInt();
       RoundRobin rr=new RoundRobin();
       rr.roundrobin(process,n,bt,quantum);
    }
    
}
