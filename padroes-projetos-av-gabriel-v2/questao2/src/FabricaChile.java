public class FabricaChile implements FabricaPais {

    @Override
    public DocumentoFiscal criarDocumentoFiscal(double valor) {
         return new BoletaElectronica(valor); }

    @Override
    public Pagamento criarPagamento(double valor) {
         return new Webpay(valor); 
    }

    @Override
    public Comprovante criarComprovante(String aluno) {
         return new ComprovanteRut(aluno); 
    }
}
