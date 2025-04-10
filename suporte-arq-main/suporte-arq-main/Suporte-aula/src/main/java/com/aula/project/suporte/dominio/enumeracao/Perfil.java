package com.aula.project.suporte.dominio.enumeracao;

public enum Perfil {

    ADMIN(0, "ROLE_ADMIN"), CLIENTE (1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");

    private Integer codigo;
    private String descricao;

    Perfil(int i, String roleAdmin) {

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



    public static  Perfil toEnum(Integer codigo){
        if(codigo == null){
            return null;
        }
        for(Perfil x: Perfil.values()){
            if(codigo.equals(x.getCodigo())){
                return x;
            }
        }

        throw new IllegalArgumentException("Perfil Inválido");
    }
}
