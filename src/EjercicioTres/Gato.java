package EjercicioTres;

public class Gato extends Animal implements Carnivoro{
    @Override
    public void emitirSonido() {
        System.out.println("Miua");
    }

    @Override
    public void comerCarne() {
        System.out.println("Le gusta la carne");
    }
}
