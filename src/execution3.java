import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class execution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> l =  Arrays.asList("orange","banana","apple","apple");
		List <String>l2 = l.stream().filter(n -> Collections.frequency(l, n)>1).distinct().toList();
		System.out.println(l2);
	}

}
