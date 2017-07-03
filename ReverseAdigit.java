package guvi;

import java.util.Scanner;

public class ReverseAdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int reminder=0;
      int reverse=0;
     
      while(num!=0){
    	  reminder=num%10;
    	  reverse=(reverse*10)+reminder;
    	  num=num/10;
     	 
      }
		System.out.println(reverse);
		
	}

}
