public abstract class FabricaBolo {
    public void prepararBolo() {
        fazerMassa();
        levarAoForno();
        fazerCobertura();
        decorarBolo();
    }

    private void levarAoForno() {
        System.out.println("Leva ao forno");
    }

    public void decorarBolo() {
        System.out.println("Decora bolo");
    }
    public abstract void fazerCobertura();

    public abstract void fazerMassa();
}
