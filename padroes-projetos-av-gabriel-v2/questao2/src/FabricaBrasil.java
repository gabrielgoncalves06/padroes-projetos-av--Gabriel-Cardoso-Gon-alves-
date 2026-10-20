public class FabricaBrasil implements FabricaPais {
    @Override
    public DocumentoFiscal criarDocumentoFiscal(double valor) { return new NFSe(valor); }

    @Override
    public Pagamento criarPagamento(double valor) { return new Pix(valor); }

    @Override
    public Comprovante criarComprovante(String aluno) { return new ComprovanteCpf(aluno); }
}
