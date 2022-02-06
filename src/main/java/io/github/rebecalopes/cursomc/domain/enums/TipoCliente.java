package io.github.rebecalopes.cursomc.domain.enums;

public enum TipoCliente {

    PESSOAFISICA(01, "Pessoa Física"),
    PESSOAJURIDICA(02, "Pessoa Juridica");

    private int cod;
    private String descricao;

    TipoCliente(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente transformaParaEnum(Integer cod){

        if(cod == null){
            return null;
        }

        for(TipoCliente x : TipoCliente.values()){
            if (cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
