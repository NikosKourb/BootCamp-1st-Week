package cb;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Personal_Data_FileWriter {
	public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println("Hello " + name);
        System.out.println("What is your surname?");
        String surname = stdin.nextLine();
        System.out.println("Whats your favorite color?");
        String color = stdin.nextLine();
        System.out.println(color);
        System.out.println("How old are you?");
        System.out.println("(input: <age>)");
        int age = stdin.nextInt();

        stdin.close();
        // Print what's gathered to a file
        System.out.println("printing........");
        if ((age > 18 && age < 66) || color.startsWith("b")) {
            try {
                PrintWriter writer = new PrintWriter("thefile.txt", "UTF-8");
                writer.println("Your name is " + name + " and your surname is " + surname);
                writer.println("You are " + age + " years old and your favorite color is " + color);
                writer.close();
                System.out.println("file is ready");
            } catch (FileNotFoundException ex) {
            	System.err.println(ex.getMessage());
            } catch (UnsupportedEncodingException ex) {
                System.err.println(ex.getMessage());
            }
        } else {
            System.out.println("Wrong input");
        }
    }
}
