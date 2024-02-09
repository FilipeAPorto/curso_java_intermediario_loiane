package com.filipe.cursojava.b_elementos_basicos.aula64_interna_locais_anonimas;

public class Externa {

    private String texto = "Texto externo";


    public class Interna {

        private String texto = "Texto interno";

        public void imprimirTexto(){
            System.out.println(texto);


            //consegue ver membros da classe externa
            System.out.println(Externa.this.texto);
        }
    }

    public static void main(String[] args) {

        Externa exnterna = new Externa();
        Interna interna = exnterna.new Interna();

        interna.imprimirTexto();
    }
}