public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor, "União Europeia");
    }

    @Override
    public String info() {
        return "Euro - Valor: " + valor + " - País: " + paisOrigem;
    }

    @Override
    public double converterParaReal() {
        return this.valor * 5.5; // Suponha que a taxa de conversão seja 1 Euro = 5.5 Reais
    }
}
