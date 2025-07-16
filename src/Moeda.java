public abstract class Moeda {
    protected double valor;
    protected String paisOrigem;

    public Moeda(double valor, String paisOrigem) {
        this.valor = valor;
        this.paisOrigem = paisOrigem;
    }

    public abstract String info(); // Método abstrato que deve ser implementado nas subclasses
    public abstract double converterParaReal(); // Método abstrato para conversão
}
