import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class execution {
    public static void main(String[] args) {
        List <String> str = Arrays.asList("apple","banana","apple","strawberry","watermelon");
        List <String> out = str.stream().distinct().collect(Collectors.toList());
        System.out.println(out);
    }
}
