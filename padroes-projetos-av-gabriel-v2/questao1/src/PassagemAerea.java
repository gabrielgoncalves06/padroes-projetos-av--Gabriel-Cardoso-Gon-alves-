public class PassagemAerea extends Passagem {
    public PassagemAerea(String passageiro, double tarifa) { super(passageiro, tarifa); }

    @Override
    public String getModal() {
         return "Aereo"; 
    }

    @Override
    protected double getPercentualTaxa() {
         return 0.08;
     }

    @Override
    public String getDocumentos() {
         return "Documento de identidade com foto e e-ticket";
     }
}
