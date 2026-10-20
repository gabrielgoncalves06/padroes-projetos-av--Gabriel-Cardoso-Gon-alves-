public class Main {
    public static void main(String[] args) {
        Matricula matriculaBrasil = new Matricula(new FabricaBrasil());
        matriculaBrasil.confirmar("Gabriel", 500);

        Matricula matriculaChile = new Matricula(new FabricaChile());
        matriculaChile.confirmar("Camila", 500);
    }
}
