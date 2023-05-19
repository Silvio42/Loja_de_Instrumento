//Nome: Silvio Jorge de Oliveira -  RA: 2052261
//Herança, pois herda Instrumento e Bateria É UM TIPO DE Instrumento

public class Bateria extends Instrumento {

    private int qtdDeTons;
    private String tipoDeBumbo;
    
    public Bateria() {
        qtdDeTons = 0;
        tipoDeBumbo = "";
    }

    public int getQtdDeTons() {
        return qtdDeTons;
    }

    public String getTipoDeBumbo() {
        return tipoDeBumbo;
    }
    
    public void setQtdDeTons(int qtdDeTons) throws AllException{
        if (qtdDeTons <= 4) {
            this.qtdDeTons = qtdDeTons;
        }
        else {
           throw new AllException(); 
        }
    }
    
    public void setTipoDeBumbo(String tipoDeBumbo) {
        this.tipoDeBumbo = tipoDeBumbo;
    }

    // Sobrescrita conceito de polimorfismo ao usar @Override acima do método tocar() para indicar que ele está sobrescrevendo um método da classe pai Instrumento.
    @Override
    public void tocar() {
        System.out.println(" Tocando bateria");
    }
    
}