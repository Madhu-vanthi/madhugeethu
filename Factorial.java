package guvi;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
Scanner s=new Scanner(System.in);
int fact=1;
int n=s.nextInt();
for(i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println(fact);		
		
	}

}
