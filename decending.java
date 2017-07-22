package guvi;

import java.util.Scanner;
public class decending {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
int i=0;
for( i=0;i<n;i++){
	arr[i]=s.nextInt();
}
for( i=0;i<n;i++){
for(int j=0;j<n;j++){
		if(arr[i]>arr[j]){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		   }
		}
	}
	for(i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
	
	}
}

	

