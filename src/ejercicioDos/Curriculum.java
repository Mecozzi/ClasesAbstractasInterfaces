package ejercicioDos;

import java.util.List;

public class Curriculum implements SeImprime {
        private String nombre;
        private String apellido;
        private int edad;
        private List<String> habilidades;

    public Curriculum(String nombre, String apellido, int edad, List<String> habilidades) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.habilidades = habilidades;
        }

        public void imprimir() {
            System.out.println("Currículum:");
            System.out.println("Nombre: " + nombre + " " + apellido);
            System.out.println("Edad: " + edad);
            System.out.println("Habilidades: " + habilidades);
        }
    }