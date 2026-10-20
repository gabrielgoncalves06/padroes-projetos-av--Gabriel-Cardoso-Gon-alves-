public class PassagemRodoviaria extends Passagem {
    public PassagemRodoviaria(String passageiro, double tarifa) { super(passageiro, tarifa); }

    @Override
    public String getModal() {
         return "Rodoviario"; 
    }

    @Override
    protected double getPercentualTaxa() {
         return 0.03;
     }

    @Override
    public String getDocumentos() {
         return "Documento de identidade com foto";
     }
}
