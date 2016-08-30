public class EncodedArray {
	public void EncArray(int arr[]){
		int a[]=new int[arr.length];
		for(int i=0;i<a.length;i++){
			a[i]=arr[i];
		}
		int firstValue=a[0];
		int lastValue=a[a.length-1];
		int encArray[]=new int[a.length];
		if(arr.length>1)
		for(int i=0;i<a.length;i++){
			int dup=0;
			dup=a[i+1]+a[i];
			encArray[i]=dup;
			if(i==a.length-2){
				break;
			}
		}
		System.out.println("The encoded array is: \n{");
		for(int i=0;i<a.length-1;i++){
			System.out.print(encArray[i]+",");
		}
		System.out.println(lastValue+"}");
		System.out.println("The first number in the original array is: "+firstValue);
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=arr[i];
		}
		System.out.println("The Sum of all original array is: "+sum);
	}
public static void main(String[] args) {
	EncodedArray e=new EncodedArray();
	int a[]=new int[]{2,5,1,7,9,3};
	e.EncArray(a);
	}

}
