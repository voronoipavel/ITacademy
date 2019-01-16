package oop.lessons_18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File("file1.txt");
        FileWriter fileWriter1 = new FileWriter(file);
        //char x = '\n';
        for (char i = 'A'; i <= 'Z' ; i++) {
            fileWriter1.write(i);
            fileWriter1.write("\n");
        }
        fileWriter1.close();
        /*
        fileWriter1.write("\n");
        for (char i = '0'; i <= '9' ; i++) {
            fileWriter1.write(i);
        }
        fileWriter1.write("\n");
        for (char i = 'А'; i <= 'Я' ; i++) {
            fileWriter1.write(i);
        }
*/

        FileWriter fileWriter2 = new FileWriter("file2.txt");
        FileReader fileReader1 = new FileReader("file1.txt");

        Scanner scanner = new Scanner(fileReader1);

        int i = 0;
        while (scanner.hasNextLine()) {
            if (i % 3 ==0) {
                //System.out.println(scanner.nextLine());
                fileWriter2.write(scanner.nextLine());
            }
            else {
                scanner.nextLine();
            }
            i++;
        }

        //System.out.println(file.get);
        fileReader1.close();
        fileWriter2.close();




    }
}
