public class Cliente {
    public static void main(String[] args) {
        FabricaBolo fBoloBaunilha = new FabricaBoloBaunilhaComMorango();
        FabricaBolo fBoloChocolate = new FabricaBoloChocolateComCaramelo();
        fBoloBaunilha.prepararBolo();
        fBoloChocolate.prepararBolo();
    }
}