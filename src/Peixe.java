public class Peixe extends Animal {
    private String corEscama;
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }
    public void soltarBolhas(){
        System.out.println("Soutando bolhas");
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    public String getCorEscama() {
        return corEscama;
    }
}
