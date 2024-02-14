import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.sort(Comparator.naturalOrder());
        Iterator<Integer> iterator = intList.iterator();

        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp > 0 && temp % 2 == 0) System.out.println(temp);
        }
    }
}
