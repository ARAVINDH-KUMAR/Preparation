
public class reverseGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "My name is aravindh";
		String [] str = input.split(" ");
		String output="";
		for(int i=str.length-1 ; i>=0;i--) {
			output = output + str[i]+" ";
		}
		System.out.println(output);
	}

}
