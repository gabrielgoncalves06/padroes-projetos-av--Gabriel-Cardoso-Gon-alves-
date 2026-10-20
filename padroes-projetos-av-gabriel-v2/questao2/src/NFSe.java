public class NFSe implements DocumentoFiscal {
    private double valor;
    public NFSe(double valor) { this.valor = valor; }

    
    @Override
    public String descricao() {
        return String.format("NFS-e (ISS 5%%): imposto de %.2f", valor * 0.05);
    }
}
