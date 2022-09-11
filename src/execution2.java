import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class execution2 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("apple","banana","apple","strawberry","watermelon","banana");
        List<String> out = str.stream().filter(n -> Collections.frequency(str,n)>1).distinct().toList();
        System.out.println(out);
    } 
}
