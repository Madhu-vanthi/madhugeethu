package guvi;
import java.util.*;
class square
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("ENTER THE X1 Y1 CO-ORDINATES");
int x1=in.nextInt();
int y1=in.nextInt();
System.out.println("ENTER THE X2 Y2 CO-ORDINATES");
int x2=in.nextInt();
int y2=in.nextInt();
System.out.println("ENTER THE X3 Y3 CO-ORDINATES");
int x3=in.nextInt();
int y3=in.nextInt();
System.out.println("ENTER THE X4 Y4 CO-ORDINATES");
int x4=in.nextInt();
int y4=in.nextInt();
int temp1=x2-x1;
int temp2=x4-x3;
int temp3=x3-x1;
int temp4=x4-x2;
int temp5=y3-y1;
int temp6=y4-y2;
int temp7=y2-y1;
int temp8=y4-y3;
if((temp2==temp1)&&(temp3==temp4)&&(temp5==temp6)&&(temp7==temp8)&&(x1==x3)&&(x2==x4))
System.out.println("IT's Square");
else
System.out.println("IT's Not Square");
}
}
