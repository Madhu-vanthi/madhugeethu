package guvi;
import java.util.Scanner;
public class pangram{    
public static void main(String[] args) {
        char[] a=new char[26];
        char[] b=new char[26];
        int a1=0,b1=0,count=0;
        for(char i='a';i<='z';i++)
        {
         a[a1]=i;
         a1++;
        }
         for(char j='A';j<='Z';j++)
        {
         b[b1]=j;
         b1++;
        }
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       for(int i=0;i<26;i++){
       for(int j=0;j<str.length();j++)
       {
        if(str.charAt(j)==a[i]||str.charAt(j)==b[i])
        {
          count++;
         a[i]=(char)-1;
          b[i]=(char)-1;
        }
            }}
        if(count==26)
        {
        System.out.println("pangram");
        }else{
        	System.out.println("not pangram");
        }
        
    }
}
