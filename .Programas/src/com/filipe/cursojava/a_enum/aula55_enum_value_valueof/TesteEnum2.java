package com.filipe.cursojava.a_enum.aula55_enum_value_valueof;

import com.filipe.cursojava.a_enum.aula53_enum.DiaSemana;

public class TesteEnum2 {
    public static void main(String[] args) {

        System.out.println(Enum.valueOf(DiaSemana.class,"DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class,"DOMINGO");

        System.out.println(dia);

    }
}
