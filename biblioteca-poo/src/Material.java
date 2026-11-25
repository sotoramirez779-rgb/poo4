import java.util.Objects;

public abstract class Material implements Prestable {
    private String codigo;
    private String titulo;
    private int anio;
    private boolean disponible = true;

    public Material(String codigo, String titulo, int anio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
    }

    // Método abstracto: cada hijo DEBE implementarlo
    public abstract double calcularMulta(int diasRetraso);

    public String descripcion() {
        return codigo + " - " + titulo + " (" + anio + ")";
    }

    @Override
    public void prestar() { disponible = false; }

    @Override
    public void devolver() { disponible = true; }

    @Override
    public boolean isDisponible() { return disponible; }

    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public int getAnio() { return anio; }

    // Dos materiales son iguales si tienen el mismo código
    // (clave para que HashSet detecte duplicados)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Material)) return false;
        Material m = (Material) o;
        return Objects.equals(codigo, m.codigo);
    }

    @Override
    public int hashCode() { return Objects.hash(codigo); }
}
