package com.filipe.cursojava.a_enum.aula56_enum_metodos_abstratos;

public enum TipoDocumento {

    CPF {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cpf();
        }
    },CNPJ {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cnpj();
        }
    };

    public abstract String geraNumeroTeste();
}
