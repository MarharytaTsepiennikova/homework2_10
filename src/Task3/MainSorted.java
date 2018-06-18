/**
 *  Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap (использовать сортировку результатов)
 */

package Task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MainSorted {
    public static void main(String[] args) {
        String[] strs = {"sds", "44", "23", "33", "23", "sds", "23", "1"};
        Map<String, Integer> map = new HashMap<>();
        // функциональное выражение
        Arrays.stream(strs).forEach(
                str -> {
                    Integer value = map.get(str);
                    value = value == null ? 1 : value + 1;
                    map.put(str, value);
                }
        );
        map.entrySet().stream().sorted(
                Comparator.comparing(Map.Entry::getKey)
        ).forEach(
                entry -> System.out.println(entry.getKey() + " : " + entry.getValue())
        );


    }
}
