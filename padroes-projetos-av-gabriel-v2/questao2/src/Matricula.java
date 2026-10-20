public class Matricula {
    private FabricaPais fabrica;

    public Matricula(FabricaPais fabrica) {
        this.fabrica = fabrica;
    }

    public void confirmar(String aluno, double valor) {
        DocumentoFiscal documento = fabrica.criarDocumentoFiscal(valor);
        Pagamento pagamento = fabrica.criarPagamento(valor);
        Comprovante comprovante = fabrica.criarComprovante(aluno);

        System.out.println("---+_+_+- RELATORIO DA MATRICULA -_+_+-_+---");
        System.out.println("Documento fiscal: " + documento.descricao());
        System.out.println("Pagamento       : " + pagamento.descricao());
        System.out.println("Comprovante     : " + comprovante.descricao());
        System.out.println();
    }
}
