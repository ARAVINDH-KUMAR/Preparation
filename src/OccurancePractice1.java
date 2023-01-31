import java.util.Scanner;

public class OccurancePractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String input;
		input = sc.next();
		char [] splitInput = input.toCharArray();
		int [] freq = new int[input.length()];
		for(int i=0;i<input.length();i++) {
			freq[i] =1;
			for(int j=i+1;j<input.length();j++) {
				if(splitInput[i]==splitInput[j]) {
					freq[i]++;
					splitInput[j]='0';
				}
			}
		}
		for(int i=0;i<input.length();i++) {
			if(splitInput[i] !='0' && freq[i]>0) {
				System.out.println(splitInput[i] +"-"+freq[i] );
			}
			
		}
		sc.close();
	}

}
