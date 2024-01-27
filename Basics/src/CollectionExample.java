import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionExample {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        for (int i=1; i<=10; i++) {
            list1.add(i);
        }

        list1.stream().filter(num -> num%2==0).forEach(System.out::println);

        Consumer<Integer> consumer = num -> System.out.println(num*num);
        list1.stream().forEach(consumer);

        //Map<Integer, Integer> map = list1.stream().collect(Collectors.toMap(list1::indexOf(num -> num%2==0));
    }

}
