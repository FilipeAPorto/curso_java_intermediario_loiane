package com.filipe.cursojava.b_elementos_basicos.aula59_importacao_static;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*; //Importa o pacote completo, mas não é usual.

public class StaticImport {
    public static void main(String[] args) {


        double a = 2, b = 3, c = 4;

        System.out.println(Math.pow(a, b));

        System.out.println(Math.sqrt(c));

        System.out.println(pow(a, b));

        System.out.println(sqrt(c));

        System.out.println();

    }
}
