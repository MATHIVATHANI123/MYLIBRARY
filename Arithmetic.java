import java.util.Arrays;

public class Arithmetic {
	public static void main(String args[]){
		int output1;
		int output2;
		int input1=1;
		int input2=2;
		int input3=3;
		int input4=1;
		String input5="++-+";
		int count=0;
		String out="";
		int sum=0;
		String str=input1+""+input2+""+input3+""+input4+"";
		
		//System.out.println(str);
	while(!str.equals("")){
	for(int i=0;i<str.length();i++)
	{
			if(str.charAt(0)==str.charAt(i))
			{
				count++;
			}
			
	}
	out=out+count+""+str.charAt(0)+"!";
	str=str.replaceAll(str.charAt(0)+"","");
	count=0;
	}
	System.out.println(out);	
	String str1[]=out.split("!");
	for(int m=0;m<str1.length;m++){
		System.out.println(str1[m]);
	}
	Arrays.sort(str1);
	for(String s1:str1)
	{
		System.out.println(s1);
	}
	String bb="";
	if(str1.length>3){
		for(int i=str1.length-1;i>str1.length-5;i--){
			bb=bb+str1[i].charAt(1)+"";
		}
	}
	else{
		for(int i=str1.length-1;i>=0;i--){
			bb=bb+str1[i].charAt(1)+"";
		}
	}
	//System.out.println(bb);
	int[] arr=new int[5];
	for(int i=0;i<bb.length();i++){
		arr[i]=((int)bb.charAt(i))-48;
	}
	arr[4]=arr[0];
	int []op=new int[4];
	int k=0;
	for(int i=0;i<=3;i++){
		switch((int)input5.charAt(i)){
		case 43:
			op[k]=arr[i]+arr[i+1];
			System.out.println(k+"="+op[k]);
			k++;
			break;
		case 45:
			op[k]=arr[i]-arr[i+1];
			System.out.println(k+"="+op[k]);
			k++;
			break;
		case 42:
			op[k]=arr[i]*arr[i+1];
			System.out.println(k+"="+op[k]);
			k++;
			break;
		case 47:
			op[k]=arr[i]/arr[i+1];
			System.out.println(k+"="+op[k]);
			k++;
			break;
		case 37:
			op[k]=arr[i]%arr[i+1];
			System.out.println(k+"="+op[k]);
		    k++;
			break;
		
		}
	}
}
}