import java.util.*;
public class even {
	public static void main(String[] args) {
	int a;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a value");
	a=scan.nextInt();
	if((a%2)==0)
	{
		System.out.println("Even number");
	}
	else if((a%2)==1)
		System.out.println("Odd number");
	else
		System.out.println("Neither odd nor even");
	}

}
