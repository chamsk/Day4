package Task2;

/**
 * Created by admin on 22.10.2018.
 */
public class Main2 {

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); //-> 1
        String s = pair.getSecond(); //-> "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        Pair<Integer, String> pairWithNull = Pair.of(1, null);
        pair.equals(pair2); //-> true
        pair.equals(pairWithNull); //-> false
    }
}
