package com.filipe.cursojava.b_elementos_basicos.aula64_interna_locais_anonimas;

public class Anonima {

    public void imprimeTexto(){
        System.out.println("qualquer texto");
    }

    public static void main(String[] args){

        Anonima anonima = new Anonima(){
            public void imprimeTexto(){
                System.out.println("qualquer texto que foi sobrescrito");
            }
        };

        anonima.imprimeTexto();

        //usando interface
        Texto texto = new Texto() {
            @Override
            public void imprimeTexto() {
                System.out.println("qualquer texto - interface");
            }
        };

        texto.imprimeTexto();
    }
}