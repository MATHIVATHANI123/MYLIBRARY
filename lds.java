
public class lds {
	public static void main(String[] args) {
		int cout=1;
		int count=0;
		int a[]={4,3,2,1,6,5,4,3,7,6,5,4,3,2,1};
		int b[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==a[i+1]+1){
				cout++;
			}
			if((cout>1)&&(a[i]!=(a[i+1]+1))||i==a.length-2){
				b[k]=cout;
				count++;
				cout=1;
				k++;
			}
		}
		for(int l=1;l<k;l++){
			if(b[0]<b[l]){
				b[0]=b[l];
			}
		}
		System.out.println(b[0]);
		System.out.println(count);
	}

}
