package oop.lessons_5.class_work;

public class Os {
    private String os;
    private String version;

    public Os(String os, String version){
        this.os = os;
        this.version = version;
        System.out.print(" Os = " + getOs() + " Version = " + getVersion());
    }

    @Override
    public String toString(){
        return os + " " + version;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

