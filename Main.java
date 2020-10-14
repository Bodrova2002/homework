import java.util.*;

public class Main{
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> setfinal = new HashSet<>();
        setfinal.addAll(set1);
        setfinal.addAll(set2);

        Iterator<T> it = setfinal.iterator();
        while (it.hasNext()) {
            T number = it.next();
            if (set1.contains(number) && set2.contains(number)) {
                it.remove();
            }
        }
        return setfinal;
    }
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("0");
        set2.add("1");
        set2.add("2");
        System.out.println(symmetricDifference(set1, set2));
    }
}

