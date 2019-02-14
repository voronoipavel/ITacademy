package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashExample {
    public static void main(String[] args){
        //Ключ и значение String
        //Создаем Map, длина по умолчанию 16.
        Map<String, String> ancientStringGreeks = new HashMap<>();

        //Поместить в качестве ключа имя героя, а в качестве значения - описание.
        ancientStringGreeks.put("Ахилл", "Греческий герой, завоеватель Трои");
        ancientStringGreeks.put("Гектор", "Троянец, погиб от рук Ахилла");
        ancientStringGreeks.put("Аякс", "Герой, участник троянской войны");
        ancientStringGreeks.put("Приам", "Царь Трои, Отец Гектора");
        ancientStringGreeks.put("Парис", "Похитил Елену из Спарты");

        //Получить описание героя по ключу
        System.out.println(ancientStringGreeks.get("Аякс"));

        System.out.println("\nКлючи");
        //Перебрать по ключам, вывести ключи
        for (String keys : ancientStringGreeks.keySet()){
            System.out.println(keys);
        }

        System.out.println("\nЗначения");
        //Перебрать по значениям, вывести значения
        for (String values : ancientStringGreeks.values()){
            System.out.println(values);
        }

        System.out.println("\nПары ключ - значение");
        //Перебрать по паре, по ключу и значению
        for (Map.Entry<String, String> pair : ancientStringGreeks.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

        System.out.println("\nЕсть ли ключ Ахилл?");
        System.out.println(ancientStringGreeks.containsKey("Ахилл"));

        System.out.println("\nЕсть ли значение Ахилл?");
        System.out.println(ancientStringGreeks.containsValue("Ахилл"));

        //Удалить значение по ключу
        ancientStringGreeks.remove("Гектор");
        System.out.println(ancientStringGreeks.get("Гектор"));

        //Под одним ключом хранится только 1 значение, дубли ключей невозможны
        //Мы перезатёрли старое значение
        ancientStringGreeks.put("Ахилл", "Греческий герой (исправлено)");
        System.out.println("\n"+ancientStringGreeks.get("Ахилл"));

        //Ключи со значением null допустимы
        ancientStringGreeks.put(null, "бууу!");
        System.out.println("\n"+ancientStringGreeks.get(null));

    }
}