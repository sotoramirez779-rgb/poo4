public class Libro extends Material {
    private String autor;

    public Libro(String codigo, String titulo, int anio, String autor) {
        super(codigo, titulo, anio);
        this.autor = autor;
    }

    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 1.0; // S/ 1.00 por día
    }

    @Override
    public String descripcion() {
        return "[Libro] " + super.descripcion() + " - Autor: " + autor;
    }
}
