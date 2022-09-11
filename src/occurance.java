import java.util.Scanner;

public class occurance {
    public static void main(String [] args){
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        input = sc.nextLine();
        int[] freq = new int[input.length()];
        char s[] = input.toCharArray();
        int i,j;
        for(i=0; i<input.length();i++){
            freq[i] = 1;
            for(j=i+1;j<input.length();j++){
                if(s[i]==s[j]){
                    freq[i]++;
                    s[j]='0';
                }
            }
        }
        for (i=0;i<input.length();i++){
            if(s[i]!=' ' && s[i]!='0'){
                System.out.println(s[i] + "-" + freq[i]);
            }
        }
    }
}
