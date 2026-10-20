public interface FabricaPais {
    DocumentoFiscal criarDocumentoFiscal(double valor);
    Pagamento criarPagamento(double valor);
    Comprovante criarComprovante(String aluno);
}
