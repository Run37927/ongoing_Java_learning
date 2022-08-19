
import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();

        scores.put("kathy", 42);
        scores.put("bert", 234);
        scores.put("skei",123);

        System.out.println(scores);
        System.out.println(scores.get("bert"));
    }
}
