public abstract class Animal {
    //Atributos
    protected float peso;
    protected int idade;
    protected int membros;

    //Métodos abstratos - somente as filhas podem ser desenvolvidas
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    //Mètodos especiais (getter e setters)
    public void setPeso(float pe){
        this.peso = pe;
    }

    public float getPeso() {
        return peso;
    }
    public void setIdade(int id){
        this.idade = id;
    }

    public int getIdade() {
        return idade;
    }
    public void setMembros(int me){
        this.membros = me;
    }
}
