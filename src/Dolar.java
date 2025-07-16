public class Dolar extends Moeda {

    public Dolar(double valor) {
        super(valor, "Estados Unidos");
    }

    @Override
    public String info() {
        return "Dólar - Valor: " + valor + " - País: " + paisOrigem;
    }

    @Override
    public double converterParaReal() {
        return this.valor * 5.0; // Suponha que a taxa de conversão seja 1 Dólar = 5 Reais
    }
}
