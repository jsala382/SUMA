package Suma;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        System.out.println("Ingrese un numero");
        num1 = input.nextInt();
        System.out.println("Ingrese otro numeto");
        num2 = input.nextInt();
        suma = num1 + num2;
        System.out.println("la suma de num1 + num2 es igual a " + suma);


    }
}
