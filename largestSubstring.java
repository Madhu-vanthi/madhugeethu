
package guvi;
import java.util.*;
public class largestSubstring
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	Set<Character> sc=new LinkedHashSet<Character>();
	for(char c:s1.toCharArray())
	{
		sc.add(c);
	}
	System.out.println(sc.size());
	}
}




