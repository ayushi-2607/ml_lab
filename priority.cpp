//PRIORITY NON PREEMPTIVE
#include<iostream>
#define max 10
using namespace std;
class Priority
{
	public:
		int n,pr[max],bs[max];
		float arr[max];
		void getdata()
		{
			cout<<"Enter the number of process"<<endl;
			cin>>n;
			cout<<"Enter the burst time"<<endl;
			for(int i=0;i<n;i++)
			{
				cout<<"PROCESS "<<i+1<<": ";
				cin>>bs[i];
			}
			cout<<"Enter the priority"<<endl;
			for(int i=0;i<n;i++)
			{
				cout<<"PROCESS "<<i+1<<": ";
				cin>>pr[i];
			}
			cout<<"Enter the arrival time"<<endl;
			for(int i=0;i<n;i++)
			{
				cout<<"PROCESS "<<i+1<<": ";
				cin>>arr[i];
			}
			
		
		}
		void calculation()
		{
			int temp;
			 for (int i=0;i<n;i++) 
			 {
      			for (int j=i+1;j<n;j++) 
				{
         			if (pr[i]>pr[j])
					{
            			temp = pr[j];
            			pr[j] =pr[i];
            			pr[i] = temp;
 
            			temp = bs[j];
            			bs[j] = bs[i];
            			bs[i] = temp;
            			
            			
					}
				}
			}
			float ct=0.0,tat=0.0,wt=0.0,avgtat=0.0,avgwt=0.0;
			for(int i=0;i<=n-1;i++)
			{
				if(ct>arr[i])
				{
					ct=ct+bs[i];
					tat=ct-arr[i];
					wt=tat-bs[i];
					cout<<"PROCESS  "<<i+1<<" "<<endl;
					cout<<"Turn around time "<<tat<<" "<<"Waiting time "<<wt<<endl;
					avgtat=tat+avgtat;
					avgwt=wt+avgwt;
				}
				else
				{
					ct=0.0;
					ct=arr[i]+bs[i];
					tat=ct-arr[i];
					wt=tat-bs[i];
					cout<<"PROCESS  "<<i+1<<" "<<endl;
					cout<<"Turn around time "<<tat<<" "<<"Waiting time"<<wt<<endl;
					avgtat=tat+avgtat;
					avgwt=wt+avgwt;
				}
			}
			avgtat=avgtat/n;
			avgwt=avgwt/n;
			cout<<"AVERAGE TAT "<<avgtat<<endl;
			cout<<"AVERAGE WT "<<avgwt<<endl;
		}
		
};
int main()
{
	Priority obj;
	obj.getdata();
	obj.calculation();
	cout<<"TAT:Turn around time,WT:Waiting time "<<endl; 

	return 0;
}


OUTPUT:
Enter the number of process
3
Enter the burst time
PROCESS 1: 2
PROCESS 2: 3
PROCESS 3: 4
Enter the priority
PROCESS 1: 2
PROCESS 2: 4
PROCESS 3: 5
Enter the arrival time
PROCESS 1: 0
PROCESS 2: 1
PROCESS 3: 2
PROCESS  1
Turn around time 2 Waiting time0
PROCESS  2
Turn around time 4 Waiting time 1
PROCESS  3
Turn around time 7 Waiting time 3
AVERAGE TAT 4.33333
AVERAGE WT 1.33333
TAT:Turn around time,WT:Waiting time

--------------------------------
Process exited after 17.26 seconds with return value 0
Press any key to continue . . .
