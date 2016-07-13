
public class example1 {
public static void main(String[] args) {
		int a;
		a=Integer.parseInt(args[0]);
		if(a>0)
		{
			System.out.println("The number is positive");
		}
		else if(a==0)
		{
			System.out.println("The number is neither positive nor negative");
		}
		else
		{
			System.out.println("the number is negative");
		}
	}

}
