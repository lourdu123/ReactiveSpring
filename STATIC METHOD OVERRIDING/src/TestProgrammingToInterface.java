import java.util.List;
import java.util.Vector;

public class TestProgrammingToInterface {

    public static void main(String[] args) {

        List<Integer> l = new Vector<>();

        l.add(1);
        l.add(2);
        System.out.println(l);

        for (Object a: l.toArray()) {
            System.out.println(a);
        }

    }
}
