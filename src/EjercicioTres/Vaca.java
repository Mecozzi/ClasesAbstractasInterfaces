package EjercicioTres;

public class Vaca extends Animal implements Herviboro{
    @Override
    public void emitirSonido() {
        System.out.println("muuu");
    }

    @Override
    public void comerHierva() {
        System.out.println("Le gusta el pasto");
    }
}
