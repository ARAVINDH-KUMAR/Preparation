
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,count=10,i;
		System.out.print(n1 +" "+n2+" ");
		for(i=2;i<count;++i) {
			System.out.print(n1+n2+" ");
			n2 = n1+n2;
			n1=n2-n1;
		}
		
	}

}
