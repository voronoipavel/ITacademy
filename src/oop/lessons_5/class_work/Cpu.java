package oop.lessons_5.class_work;

public class Cpu {
    private String cpu;
    private int core;
    private double frequency;

    public Cpu(String cpu, int core, double frequency) {
        this.cpu = cpu;
        this.core = core;
        this.frequency = frequency;
        System.out.print(" Cpu = " + getCpu() + " Col-vo yader = " + getCore() + " Chastota = " + getFrequency());
    }

    @Override
    public String toString(){
        return cpu + " " + core + " " + frequency;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}