public class ComprovanteRut implements Comprovante {
    private String aluno;
    public ComprovanteRut(String aluno) { this.aluno = aluno; }

    @Override
    public String descricao() {
        return "Comprovante de matricula - aluno " + aluno + " identificado por RUT";
    }
}
