import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        b.registrar(new Libro("L001", "Java Básico", 2020, "Ana Torres"));
        b.registrar(new Libro("L002", "Estructuras de Datos", 2015, "Luis Pérez"));
        b.registrar(new Revista("R001", "Tecnología Hoy", 2023, 45));

        // Prueba de duplicado: mismo código, no se agrega
        boolean agregado = b.registrar(new Libro("L001", "Copia", 2021, "X"));
        System.out.println("¿Duplicado agregado? " + agregado);

        System.out.println("\n--- Catálogo ---");
        b.listar();

        System.out.println("\n--- Búsqueda: 'java' ---");
        for (Material m : b.buscarPorTitulo("java")) {
            System.out.println(m.descripcion());
        }

        System.out.println("\n--- Ordenado por año ---");
        List<Material> ordenados = b.ordenarPorAnio();
        for (Material m : ordenados) {
            System.out.println(m.descripcion());
        }

        System.out.println("\n--- Polimorfismo: multa por 4 días ---");
        for (Material m : ordenados) {
            System.out.println(m.getTitulo() + ": S/ " + m.calcularMulta(4));
        }
    }
}
