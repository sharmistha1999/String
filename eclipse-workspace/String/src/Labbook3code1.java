import java.util.Scanner;
import java.util.StringTokenizer;

public class Labbook3code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
int sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter the integers:");
String s = sc.nextLine();
StringTokenizer st = new StringTokenizer(s, " ");
while(st.hasMoreTokens())
{
	String temp =st.nextToken();
	n= Integer.parseInt(temp);
	System.out.println(n);
	sum=sum+n;
}
System.out.println("sum of integers are:" +sum);
sc.close();
	}

}
