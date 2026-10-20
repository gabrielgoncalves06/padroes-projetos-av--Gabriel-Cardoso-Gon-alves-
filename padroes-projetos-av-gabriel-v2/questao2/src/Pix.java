public class Pix implements Pagamento {
    private double valor;
    public Pix(double valor) { this.valor = valor; }

    @Override
    public String descricao() {
        return String.format("Pix: pagamento de %.2f", valor);
    }
}
