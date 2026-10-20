public class Main {
    public static void main(String[] args) {
        
        EmissorPassagem aereo = new EmissorAereo();
        EmissorPassagem rodoviario = new EmissorRodoviario();
        EmissorPassagem ferroviario = new EmissorFerroviario();

        aereo.emitir("Gabriel", 1000);
        rodoviario.emitir("Maria", 200);
        ferroviario.emitir("Joao", 400);
    }
}
