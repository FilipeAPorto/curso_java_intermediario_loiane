package com.filipe.cursojava.a_enum.aula54_enum_class;

public class TesteEnum {
    public static void main(String[] args) {


        DiaSemana dia = DiaSemana.SEGUNDA;

        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(1,4,2016,DiaSemana.SEXTA);
    }

}
