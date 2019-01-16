package oop.Lessons_10.staticlessen;

public class Counter {
    private static int numOfCalls;
    //private int factorial;

    public static int incrimetn(){
        return ++numOfCalls;
    }

    public static int factorial(){
        int factorial = 1;

        for (int i = 1; i <= numOfCalls; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int getNumOfCalls() {
        return numOfCalls;
    }

    public static void setNumOfCalls(int numOfCalls) {
        Counter.numOfCalls = numOfCalls;

    }
}
