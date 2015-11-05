import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tomas on 5.11.15.
 */
public class Test {
    private List<Integer> list;

    public Test() {
        this.list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
    }

    List<Java> testJava() {
        return list.stream().map(Java::new).collect(Collectors.toList());
    }

    List<Scala> testScala() {
        return list.stream().map(Scala::new).collect(Collectors.toList());
    }
}
