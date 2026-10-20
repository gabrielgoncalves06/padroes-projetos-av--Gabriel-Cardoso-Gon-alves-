// PRODUTO (abstrato)
public abstract class Passagem {
    protected String passageiro;
    protected double tarifa;


    public Passagem(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    public abstract String getModal();
    protected abstract double getPercentualTaxa();
    
    public abstract String getDocumentos();


    public double calcularTaxaEmbarque() {
        return tarifa * getPercentualTaxa();
    }

    public String getPassageiro() {
        return passageiro;
    }
}
