import java.util.*;
public class string {

	public static void main(String[] args) {
		String str=new String();
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		StringBuffer str1=new StringBuffer(str);
		str1.reverse();
		System.out.println("Reversed String is:"+str1);
	}

}
