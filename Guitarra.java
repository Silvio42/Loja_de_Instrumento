//Nome: Silvio Jorge de Oliveira -  RA: 2052261
//Herança, pois herda Instrumento e Guitarra É UM TIPO DE Instrumento

public class Guitarra extends Instrumento {

    private int qtdDeCasas;
    private String tipoDeAlavanca;

    //Sobrecarga conceito de polimorfismo ao criar diferentes construtores para a classe Guitarra
    
    public Guitarra() {
        this(0, "");
    }

    public Guitarra(int qtdDeCasas) {
        this(qtdDeCasas, "");
    }

    public Guitarra(String tipoDeAlavanca) {
        this(0, tipoDeAlavanca);
    }

    public Guitarra(int qtdDeCasas, String tipoDeAlavanca) {
        this.qtdDeCasas = qtdDeCasas;
        this.tipoDeAlavanca = tipoDeAlavanca;
    }

    public int getQtdDeCasas() {
        return qtdDeCasas;
    }

    public String getTipoDeAlavanca() {
        return tipoDeAlavanca;
    }

    public void setQtdDeCasas(int qtdDeCasas) {
        this.qtdDeCasas = qtdDeCasas;
    }

    public void setTipoDeAlavanca(String tipoDeAlavanca) throws AllException{
	    if(tipoDeAlavanca.length() <= 30){
		    this.tipoDeAlavanca = tipoDeAlavanca;
	    }
	    else{
		    throw new AllException();
	    }
	}

    // Sobrescrita conceito de polimorfismo ao usar @Override acima do método tocar() para indicar que ele está sobrescrevendo um método da classe pai Instrumento.
    @Override
    public void tocar() {
        System.out.println(" Tocando guitarra");
    }
    
    
}
