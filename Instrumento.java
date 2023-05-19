//Nome: Silvio Jorge de Oliveira -  RA: 2052261

public class Instrumento {
    private String nome;
    private int qtdDeCordas;
    private Estoque estoque = new Estoque();
    private Fornecedor fornecedor = new Fornecedor();
    
    public Instrumento() {
        nome = "";
        qtdDeCordas = 0;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getQtdDeCordas() {
        return qtdDeCordas;
    }

	public void setNome(String nome){
		this.nome = nome;

	}
    
    public void setQtdDeCordas(int qtdDeCordas) throws AllException{
        if (qtdDeCordas <= 12) {
            this.qtdDeCordas = qtdDeCordas;
        }
        else{
			throw new AllException();
		}
    }

    public Estoque getestoque() {
        return estoque;
    }

    public void setestoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Fornecedor getfornecedor() {
        return fornecedor;
    }

    public void setfornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void tocar() {
        System.out.println("Tocando instrumento");
    }

}
