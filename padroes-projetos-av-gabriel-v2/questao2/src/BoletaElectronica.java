public class BoletaElectronica implements DocumentoFiscal {
    private double valor;
    public BoletaElectronica(double valor) { this.valor = valor; }

    
    @Override
    public String descricao() {
        return String.format("Boleta electronica (IVA  19 %%): imposto de %.2f", valor * 0.19);
    
    }
}

