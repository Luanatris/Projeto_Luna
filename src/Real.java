public class Real extends Moeda {

    public Real(double valor) {
        super(valor, "Brasil");
    }

    @Override
    public String info() {
        return "Real - Valor: " + valor + " - País: " + paisOrigem;
    }

    @Override
    public double converterParaReal() {
        return this.valor; // Já é em Reais
    }
}
