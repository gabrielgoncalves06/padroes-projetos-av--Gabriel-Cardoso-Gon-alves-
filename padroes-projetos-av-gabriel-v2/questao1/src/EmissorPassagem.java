// o Factory Method 

public abstract class EmissorPassagem {


    protected abstract Passagem criarPassagem(String passageiro, double tarifa);

    public void emitir(String passageiro, double tarifa) {
        Passagem passagem = criarPassagem(passageiro, tarifa);   
        double taxa = passagem.calcularTaxaEmbarque();           

        System.out.println("+++++++++ RESUMO DA PASSAGEM +++++++++");      
        System.out.println(" Modal      : "  + passagem.getModal());
        System.out.printf(" Taxa de embarque: R$ %.2f%n", taxa);
        System.out.println(" Passageiro : " + passagem.getPassageiro());
        System.out.println(" Documentos : " +  passagem.getDocumentos());
        System.out.println();
    }
}
