package guvi;
import java.util.*;
class palindrom
{
    public static void main(String args[])
    {
        int n=0;
        Scanner sc=new Scanner(System.in);
        StringBuffer s=new StringBuffer(sc.next());
        StringBuffer s1=new StringBuffer("");
        StringBuffer s2=new StringBuffer("");
        StringBuffer s3=new StringBuffer("");
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                s1=new StringBuffer(s.substring(i,j));
                s2=new StringBuffer(s.substring(i,j));
          s1.reverse();   
          if(s2.toString().equals(s1.toString())&&s1.length()>n)
            {
        n=s2.length();
        s3=s2;
        
    }
}
}
    System.out.print(s3);
    
    }
}
