package oop.lessons_7;

public class Test {
    public static void main(String[] args) {
        Table table = new Table(452.51);
        Table tableArray[] = new Table[10];
        for (int i = 0; i <tableArray.length ; i++) {

            tableArray[i] = table;
        }
        int a = 100;
        int array[] = new int[10];
        for (int i = 0; i < array.length ; i++) {
            array[i] = a;
        }

        table.setPrice(99);
        System.out.println(tableArray[0]);
        System.out.println(tableArray[5]);
        System.out.println(array[0]);
        System.out.println(array[5]);
        a = 99;
        System.out.println(array[0]);
        System.out.println(array[5]);

    }
}
