package com.filipe.cursojava.b_elementos_basicos.aula63_printf;

public class ExemploPrintf_Estudar {
    public static void main(String[] args) {

        //System.out.printf(format, args);

        System.out.printf("Hello %s", "Olá, Mundo!");
        System.out.println();
        System.out.printf("Hello %S", "Olá, Mundo!");
        System.out.println();
        System.out.printf("%c", 'c');
        System.out.println();
        System.out.printf("%C", 'c');
        System.out.printf("%n");

        int valor = 123456789;
        System.out.printf("%d", valor);

        System.out.println();

        double pontoFlutuante = 3.14574;
        System.out.printf("%f", pontoFlutuante);

        System.out.println();

        String olaMundo = "Olá,Mundo!";
        System.out.printf("%20s", olaMundo);

        System.out.println();

        System.out.printf("%-20s", olaMundo);

        System.out.println();

        System.out.printf("%+d", valor);

        System.out.println();

        System.out.printf("%015d", valor); //Estudar

        System.out.println();

        System.out.printf("%,d", valor); //Separador de milhagem

        System.out.println();

        System.out.printf("%,d", valor); //Separador de milhagem

        System.out.println();

        int valor2 = -123456789;
        System.out.printf("% d", valor2);

        System.out.println();

        System.out.printf("%.3f", pontoFlutuante); // fração - Formatação - ESTUDAR

        System.out.println();

        System.out.printf("R$%10.2f",pontoFlutuante);


        System.out.println();

        testeMaisCompleto();
    }

    private static void testeMaisCompleto(){  // Estudar

        double[] precos = {10000,123.54,7843.567,1,4.56789};

        for(int i = 0 ; i < precos.length;i++){
            System.out.printf("%s %02d: total de R$%,10.2f%n","Item",i+1,precos[i]);
        }
        //Java.util.Formater
    }
}
