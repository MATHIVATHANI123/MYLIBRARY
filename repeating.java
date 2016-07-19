import java.util.Scanner;


public class repeating {
public static void main(String[] args) {
	int a[]=new int[25];
	int count,temp,b=0,sum=0;
	Object math;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the total numbers:");
	count=scan.nextInt();
	for(int i=0;i<count;i++)
	{
		for(int j=i+1;j<count;j++)
		{
			if(a[j]>a[i])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<count-1;i++)
	{
		temp=a[i+1];
		while(temp!=0)
		{
			temp=temp/10;
			b++;
		}
		sum=sum*(((Object) math).pow(10,b))+a[i+1];
	}
	System.out.println(sum);
}
}
