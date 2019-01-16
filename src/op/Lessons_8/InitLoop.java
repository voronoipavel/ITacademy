package op.Lessons_8;

public class InitLoop {
    public static void main(String[] args){
        int input[] = new int[200];
        int output[] = new int[10];

        for(int i = 0; i < input.length; i++){
            input[i] = (int)(Math.random()*100);
            System.out.println(input[i] + " == " + i);
        }

        int summa = 0;
        int iterOutput = 0;
        for (int i = 0; i< input.length; i++){
            summa = summa + input[i];
            if(i % 19 == 0 && i > 0){
                output[iterOutput++] = summa;
            }
        }
        System.out.println("ВЫВОД");
        int index= 0;
        for (int val: output){
            System.out.println(val + " --- " + ++index );
        }


    }
}

