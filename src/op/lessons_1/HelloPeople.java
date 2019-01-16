package op.lessons_1;

import java.io.*;

public class HelloPeople {
    public static void main(String[] args) throws IOException {
        System.out.println("Как тебя зовут? Введите своё имя");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name + " и Java теперь друзья!!!");
    }
}