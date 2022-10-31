package interfaces;

public enum OpcaoPrincipalMenuEnums {
    
	CAD_CARRO("10"),
	CAD_MOTO("20");
	
	private String opcaoPrincipal;

	OpcaoPrincipalMenuEnums(String opcaoPrincipal) {
        this.opcaoPrincipal = opcaoPrincipal;
    }

    public String getOpcao() {
        return opcaoPrincipal;
    }
}
