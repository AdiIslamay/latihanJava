package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Program kalkulator sederhana

        // a operator b
        Scanner inputUser;
        float a, b, hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();


        if (operator == '+'){
            hasil = a + b;
            System.out.println("hasil = " +hasil);
        }else if(operator == '-'){
            hasil = a - b;
            System.out.println("hasil = " +hasil);
        }else if(operator == '*'){
            hasil = a * b;
            System.out.println("hasil = " +hasil);

        }else if (operator == '/'){
            if(b == 0){
                System.out.println("pembagi nol menghasilkan tak hingga");
            }else {
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }

        }else {
            System.out.println("Operator Tidak Ditemukan");
        }




    }
}
