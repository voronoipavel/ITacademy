package op;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(null);
        arrayList.add(20);

        for (Integer a: arrayList) {
            System.out.println(a);

        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
    }
}