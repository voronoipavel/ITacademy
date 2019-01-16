package oop.lessons_5.class_work;

public class Notebook {
    private String name;
    private Hdd hdd[];
    private Ram ram;
    private Os os;
    private Cpu cpu;

    public Notebook(String name, Hdd hdd[], Ram ram, Os os, Cpu cpu) {
        this.name = name;
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.cpu = cpu;
        System.out.println(" Model " + getName());
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", os=" + os +
                ", cpu=" + cpu +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hdd getHdd()[] {
        return hdd;
    }

    public void setHdd(Hdd hdd[]) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}