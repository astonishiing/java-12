//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru can = new Canguru();
        Cachorro cac = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga ta = new Tartaruga();
        Arara ar = new Arara();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        p.locomover();
        r.locomover();
        // -------------------
        //----------------------
        can.locomover();
        cac.locomover();
    }
}