package Task2;

/**
 * Created by admin on 22.10.2018.
 */
public class Pair<T,V> {
     Integer first;
     String second;

    private Pair(Integer first, String second) {
        this.first = first;
        this.second = second;
    }

    public Integer getFirst() {
        System.out.println("First = " + first);
        return first;
    }

    public String getSecond() {
        System.out.println("Second = " + second);
        return second;
    }


    public static Pair<Integer,String> of(int i, String hello) {
        return new Pair<Integer,String>(i,hello);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
        return second != null ? second.equals(pair.second) : pair.second == null;

    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
