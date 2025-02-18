public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    public void fazendoNinho(){
        System.out.println("Construindo ninho");
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }
}
