import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class duplicatePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = Arrays.asList("Apple","banana","Apple");
		List<String> l2 = l1.stream().filter(n -> Collections.frequency(l1, n)>1).distinct().collect(Collectors.toList());
		System.out.println(l2);
	}

}
