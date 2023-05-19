//Nome: Silvio Jorge de Oliveira -  RA: 2052261

public class Estoque implements ConverteRealIn{
    
    private int qtdDeItens;
    private float valor;

    public Estoque() {
        qtdDeItens = 0;
        valor = 0;
    }

    public int getQtdDeItens() {
        return qtdDeItens;
    }

    public float getValor() {
        return valor;
    }

    public void setQtdDeItens(int qtdDeItens) {
        this.qtdDeItens = qtdDeItens;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    //Interface
    public float converteReal(float valor){
        float ret = (float) (valor * 4.95);
        return ret;
    }


}