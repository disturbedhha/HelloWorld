package com.foundations;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String [] args)
    {
        final int A = 3;
        int b;
        int  sum,res;

        System.out.println("ingresar un numero");
        Scanner kb = new Scanner(System.in);
        b = kb.nextInt();
        sum = A+b;
        res = A-b;
        System.out.println("\nsum:" + sum + "\nrest:"+ res);

        String name;
        String surname;

        kb.nextLine();
        System.out.println("escribe tu nombre: ");
        name = kb.nextLine();
        System.out.println("\nescribe tu apellido: ");
        surname = kb.nextLine();

        System.out.println("nombre: "+ name +"\napellido: "+ surname);
    }
}
