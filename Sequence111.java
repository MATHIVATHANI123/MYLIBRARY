
/*import java.util.Arrays;
 public class Sequence111 {

	public static void main(String[] args) {
	 int input1=1237;
	 int input2=202;
	 int input3=666;
	 int input4=140;
	 int count=0;
	 String out="";
	 int ou1=0;
	String s=input1+""+input2+""+input3+""+input4+"";
	System.out.println(s);
	//String out1[];
	int h[];
	while(s.length()!=0){
		for(int i=0;i<s.length();i++){
			if(s.charAt(0)==s.charAt(i)){
				count++;
			}
			}
		out=out+count+""+s.charAt(0)+"!";
		s=s.replaceAll(s.charAt(0)+"","");
		count=0;
	
	}
	System.out.println(out);
 String	out1[]=out.split("!");		
 for(int i=0;i<out1.length;i++){
	 System.out.println(out1[i]);
	 
 }
 Arrays.sort(out1);
 System.out.println("after sorting the out1" );
 for(int i=0;i<out1.length;i++){
	System.out.println(out1[i]);
 }
 
	 System.out.println(out1[0].charAt(1)+" occur "+out1[0].charAt(0)+" times ");
	 System.out.println(out1[out1.length-1].charAt(1)+" occur "+out1[out1.length-1].charAt(0));
	 int S1=Integer.parseInt(out1[out1.length-1].charAt(0)+"");
	 int S2=Integer.parseInt(out1[out1.length-1].charAt(1)+"");
	 System.out.println(S2);
	 System.out.println(S1);
	 System.out.println(S1*S2);
	 System.out.println(S1+S2);
	 System.out.println(Integer.parseInt(out1[0].charAt(0)+"")*(Integer.parseInt(out1[0].charAt(1)+""))); 
	 
		 for(int l=0;l<out1.length;l++){
		 if(out1[0].charAt(0)==out1[l].charAt(0)){
			  ou1=ou1+Integer.parseInt(out1[l].charAt(1)+"");
			 
			 
		 }
		
	
	}
		 System.out.println(ou1);
	 }
	 
	
}*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Sequence111 {

	public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>();
 al.add(0,new Integer(1237));
 al.add(1,new Integer(202));
 al.add(2,new Integer(606));
 al.add(3,new Integer(140));
 int a=0;
 int b=0;
 int c=0;
 int d=0;
 Iterator it=al.listIterator();
  while(it.hasNext())
{
a=(Integer) it.next();
 b=(Integer) it.next();
 c=(Integer) it.next(); 
 d=(Integer) it.next();
}
String s=a+""+b+""+c+""+d+"";
int ou1=0;
int count=0;
String out="";
	System.out.println(s);
	//String out1[];
	int h[];
	while(s.length()!=0){
		for(int i=0;i<s.length();i++){
			if(s.charAt(0)==s.charAt(i)){
				count++;
			}
			}
		out=out+count+""+s.charAt(0)+"!";
		s=s.replaceAll(s.charAt(0)+"","");
		count=0;
	
	}
	System.out.println(out);
String	out1[]=out.split("!");		
for(int i=0;i<out1.length;i++){
	 System.out.println(out1[i]);
	 
}
Arrays.sort(out1);
System.out.println("after sorting the out1" );
for(int i=0;i<out1.length;i++){
	System.out.println(out1[i]);
}

	 System.out.println(out1[0].charAt(1)+" occur "+out1[0].charAt(0)+" times ");
	 System.out.println(out1[out1.length-1].charAt(1)+" occur "+out1[out1.length-1].charAt(0));
	 int S1=Integer.parseInt(out1[out1.length-1].charAt(0)+"");
	 int S2=Integer.parseInt(out1[out1.length-1].charAt(1)+"");
	 System.out.println(S2);
	 System.out.println(S1);
	 System.out.println(S1*S2);
	 System.out.println(S1+S2);
	 System.out.println(Integer.parseInt(out1[0].charAt(0)+"")*(Integer.parseInt(out1[0].charAt(1)+""))); 
	// return (Integer.parseInt(out1[0].charAt(0)+"")*(Integer.parseInt(out1[0].charAt(1)+"")));
		 for(int l=0;l<out1.length;l++){
		 if(out1[0].charAt(0)==out1[l].charAt(0)){
			  ou1=ou1+Integer.parseInt(out1[l].charAt(1)+"");
			 
			 
		 }
		
	
	}
		 System.out.println(ou1);
		 String in="-+*/";
		 String o[]=in.split("(?!^)");

		 System.out.println(o[0]);
		 
		 
}
}