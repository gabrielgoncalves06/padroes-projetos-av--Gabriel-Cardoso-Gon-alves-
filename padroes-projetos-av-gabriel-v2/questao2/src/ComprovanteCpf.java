public class ComprovanteCpf implements Comprovante {
    private String aluno;
    public ComprovanteCpf(String aluno) { this.aluno = aluno; }

    @Override
    public String descricao() {
        return "Comprovante de matricula - aluno " + aluno + " identificado por CPF";
    
    
    }

}

