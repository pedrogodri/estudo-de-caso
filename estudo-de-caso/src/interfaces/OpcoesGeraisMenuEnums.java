package interfaces;

public enum OpcoesGeraisMenuEnums {
	SAIR("0"),
	LISTAR("1"),
    CADASTRAR("2"),
    ALTERAR("3"),
    EXCLUIR("4");

    private String opcaoGeral;

    OpcoesGeraisMenuEnums(String opcaoGeral) {
        this.opcaoGeral = opcaoGeral;
    }

    public String getOpcao() {
        return opcaoGeral;
    }
}
