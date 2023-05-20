//Nome: Silvio Jorge de Oliveira -  RA: 2052261
//Herança, pois herda Instrumento e Baixo É UM TIPO DE Instrumento

//git testando

public class Baixo extends Instrumento {

    //Encapsulamento --> private

    private float grossuraDasCordas;
    private int qtdDeCaptadores;

    //Encapsulamento --> public
    public Baixo() {
        grossuraDasCordas = 0;
        qtdDeCaptadores = 0;
    }

    public float getGrossuraDasCordas() {
        return grossuraDasCordas;
    }

    public int getQtdDeCaptadores() {
        return qtdDeCaptadores;
    }
    
    public void setGrossuraDasCordas(float grossuraDasCordas) throws AllException{
        if (grossuraDasCordas <= 45) {
        this.grossuraDasCordas = grossuraDasCordas;
        }
        else {
           throw new AllException(); 
        }
    }
    
    public void setQtdDeCaptadores(int qtdDeCaptadores) {
        this.qtdDeCaptadores = qtdDeCaptadores;
    }

    // Sobrescrita conceito de polimorfismo ao usar @Override acima do método tocar() para indicar que ele está sobrescrevendo um método da classe pai Instrumento.
    @Override
    public void tocar() {
        System.out.println(" Tocando baixo");
    }
    
}
