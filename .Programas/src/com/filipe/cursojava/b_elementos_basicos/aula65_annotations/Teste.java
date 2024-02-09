package com.filipe.cursojava.b_elementos_basicos.aula65_annotations;

@InformacaoAula(
        autor = "Filipe",
        aulaNumero = 65
)
public class Teste {

    @InformacaoAula(
            autor = "Filipe",
            aulaNumero = 65
    )
    public static void main(String[] args) {

    }

}
