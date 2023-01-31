import java.util.Scanner;

public class occarancePractice2 {
	public static void main(String [] args) {
		String input;
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		int [] freq = new int[input.length()];
		char [] str = input.toCharArray();
		for(int i=0;i<input.length();i++) {
			freq[i]=1;
			for(int j=i+1;j<input.length();j++) {
				if(str[i] == str[j]) {
					freq[i]++;
					str[j]='0';
				}
			}
		}
		
		for(int i=0;i<input.length();i++) {
			if(str[i]!='0' && freq[i]>0) {
				System.out.println(str[i] +"-"+ freq[i]);
			}
		}
		sc.close();
	}
}
