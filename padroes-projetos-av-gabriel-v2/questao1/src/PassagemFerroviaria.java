public class PassagemFerroviaria extends Passagem {
    public PassagemFerroviaria(String passageiro, double tarifa) { super(passageiro, tarifa); }

    @Override
    public String getModal() {
         return "Ferroviario"; 
    }

    @Override
    protected double getPercentualTaxa() {
         return 0.05; 
    }

    @Override
    public String getDocumentos() { 
        return "Documento de identidade com foto e comprovante de reserva"; 
    }
}
