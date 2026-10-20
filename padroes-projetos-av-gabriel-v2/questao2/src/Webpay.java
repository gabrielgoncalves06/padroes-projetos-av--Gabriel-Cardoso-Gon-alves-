public class Webpay implements Pagamento {
    private double valor;
    public Webpay(double valor) { this.valor = valor; }

    @Override
    public String descricao() {
        return String.format("Webpay: pagamento de %.2f", valor);
    }
}
