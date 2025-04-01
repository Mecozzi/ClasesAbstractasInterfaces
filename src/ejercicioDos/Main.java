package ejercicioDos;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Curriculum curriculum = new Curriculum("Juan", "Pérez", 30,
                Arrays.asList("Java", "Python", "Comunicación"));

        LibroPDF libroPDF = new LibroPDF("Gabriel García Márquez", "Cien años de soledad", "Ficción", 400);

        Informe informe = new Informe("Informe sobre el estado financiero", 10, "Ana López", "Carlos García");

        Impresora.imprimirDocumento(curriculum);
        System.out.println();
        Impresora.imprimirDocumento(libroPDF);
        System.out.println();
        Impresora.imprimirDocumento(informe);
    }
}