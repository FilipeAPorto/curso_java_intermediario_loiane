package com.filipe.cursojava.b_elementos_basicos.aula65_annotations;

@interface InformacaoAula {

    String autor();

    int aulaNumero();

    String blog() default "http://loiane.com";

    String site() default "http://loiane.training";

}
