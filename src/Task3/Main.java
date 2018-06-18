package Task3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap.
 */

public class Main {
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
        map.entrySet().stream().forEach(
                entry -> System.out.println(entry.getKey() + " : " +  entry.getValue())
        );
    }
}
