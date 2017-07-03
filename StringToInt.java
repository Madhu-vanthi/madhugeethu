package guvi;

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String number=s.nextLine();
int num=Integer.parseInt(number);//valueOf also returns integer object
System.out.println(num);
	}

}
