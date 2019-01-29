import java.util.Arrays;
import java.util.Comparator;

public class Exemple {
    public static void main(String[] args) {
        String[] list = {"Banana", "Apple", "Pears"};
        Arrays.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

}
    }