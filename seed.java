package guvi;

import java.util.Scanner;

public class seed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int reminder=0;
int temp=a;
int seed=1;
int result=0;
while(a!=0)
{
reminder=a%10;
seed=seed*reminder;
a=a/10;
}
result=temp*seed;
 System.out.println(result);
	}
	}

