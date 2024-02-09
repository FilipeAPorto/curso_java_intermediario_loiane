package com.filipe.cursojava.b_elementos_basicos.aula64_interna_locais_anonimas;

public class Externa2 {

    public void metodoQualquer(){

        class ClasseLocal{

            private String texto = "Texto classe local";

            public void imprimeTexto(){
                System.out.println(texto);
            }
        }

        ClasseLocal local = new ClasseLocal();

        local.imprimeTexto();
    }

    public static void main(String[] args) {

        Externa2 externa = new Externa2();

        externa.metodoQualquer();
    }
}
