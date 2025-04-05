package Increment_operator;

import java.sql.SQLOutput;

public class Command_line_arg {
    public static void main(String[] args) {
        String a = args[0];
        String a1 = args[1];
        String a2 = args[2];
        int b = Integer.parseInt(a); //command line arugment
        System.out.println(b);// input is given in the edit configuration.
        System.out.println(a1);
        System.out.println(a2);

    }
}
