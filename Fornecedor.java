//Nome: Silvio Jorge de Oliveira -  RA: 2052261

public class Fornecedor {

    private int cnpj;
    private String endereco;
    
    public Fornecedor() {
        cnpj = 0;
        endereco = "";
    }

    public int getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}