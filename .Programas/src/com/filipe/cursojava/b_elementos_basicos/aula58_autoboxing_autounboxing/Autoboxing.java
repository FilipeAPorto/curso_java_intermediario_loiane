package com.filipe.cursojava.b_elementos_basicos.aula58_autoboxing_autounboxing;

public class Autoboxing {
    public static void main(String[] args) {

        //Auto boxing
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 1000l;
        Float num11 = 3.5f;
        Double num12 = 3.5555;
        Boolean flag2 = true;
        Character b_ = 'b';

        //Auto un-boxing
        int num13 = num9; // num9.intValue();

        //Auto Boxing em expressões
        num9++;

        System.out.println(num9);

        //Auto unboxing num9 -> auto boxing num13/num9 -> num14
        Integer num14 = num13/num9;

        //MAU USO
        Double a,b,c;
        a = 10.0;
        b = 12.2;
        c = 4.7;

        Double media = (a+b+c)/3;
        System.out.println(media);

    }
}
