package oop.lessons_5.class_work;

public class Test {
    public static void main(String[] args) {
        Hdd hdd = new Hdd(7200, 1000);
        Ram ram = new Ram(8,"Adate");
        Os os = new Os("Windows", "10");
        Cpu cpu = new Cpu("i5",4,3.4);
        Hdd hddArray[] = new Hdd[2];
        hddArray[0] = new Hdd(5400, 256);
        hddArray[1] = new Hdd(7200,1000);
        Notebook myLaptop = new Notebook("Acer", hddArray, ram, os, cpu);



        /*
        System.out.println("1----------");
        System.out.println(myLaptop.getHdd().getSpeed());
        System.out.println("2----------");
        System.out.println(myLaptop.getRam().getModel());
        System.out.println(hdd.getSpeed());
        */

        System.out.println("-----------------------------");
        System.out.println(myLaptop);
        System.out.println("-----------------------------");
        System.out.println(ram);

    }
}
