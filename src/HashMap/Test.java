package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        int value;

        for (int i = 0; i < 1000; i++) {

            value = ((int) (Math.random() * 100));

            if (map.containsKey(value)){
                int namber = map.get(value);
                map.put(value,++namber);

            }else map.put(value,1);

        }
        for (Map.Entry<Integer, Integer> chislo : map.entrySet()) {
            System.out.println(chislo);

        }

    }
}
