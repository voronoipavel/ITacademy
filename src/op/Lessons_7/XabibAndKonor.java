package op.Lessons_7;

public class XabibAndKonor {
    public static void main(String[] args) {

        int conorArray[] = new int[150];
        int xabibArray[] = new int[200];
        int sum = 0, part;

        for (int i = 0; i < conorArray.length; i++) {
            conorArray[i] = (int)(Math.random()*1000);
            sum += conorArray[i];
        }
        for (int i = 0; i < xabibArray.length; i++) {
            xabibArray[i] = (int)(Math.random()*1000);
        }
        part = sum / xabibArray.length;
        for (int i = 0; i < xabibArray.length; i++) {
            xabibArray[i] = xabibArray[i] + part;
        }
        for (int i : xabibArray) {
            System.out.println(i);
        }
    }
}