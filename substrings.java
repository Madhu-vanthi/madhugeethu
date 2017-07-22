package guvi;

import java.util.Scanner;

public class substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
String s3="";
String s4="";
boolean ans=false;
for(int i=0;i<s1.length();i++){
	for(int j=0;j<s1.length()-i;j++){
		s3+=s1.substring(i,i+j+1);
		for(int k=0;k<s2.length();k++){
			for(int m=0;m<s2.length()-k;m++){
				s4+=s2.substring(k,k+m+1);
					if(s3.equals(s4))
					{
						ans=true;
					}
				}
			}
		}	
	}
if(ans==true)
{

System.out.println(ans);
}else
{
	System.out.println(ans);
}
s.close();
	}

}
