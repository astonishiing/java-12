public abstract class Animal {
    //Atributos
    protected float peso;
    protected int idade;
    protected int membros;

    //Métodos abstratos - somente as filhas podem ser desenvolvidas
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

}
