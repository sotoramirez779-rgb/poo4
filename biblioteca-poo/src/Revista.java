public class Revista extends Material {
    private int numeroEdicion;

    public Revista(String codigo, String titulo, int anio, int numeroEdicion) {
        super(codigo, titulo, anio);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public double calcularMulta(int diasRetraso) {
        return diasRetraso * 0.5; // S/ 0.50 por día
    }

    @Override
    public String descripcion() {
        return "[Revista] " + super.descripcion() + " - Edición N.° " + numeroEdicion;
    }
}
