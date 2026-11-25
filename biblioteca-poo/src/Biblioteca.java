import java.util.*;

public class Biblioteca {
    private Set<Material> catalogo = new HashSet<>();

    // Registro: devuelve false si el código ya existía
    public boolean registrar(Material m) {
        return catalogo.add(m);
    }

    // Recorrido
    public void listar() {
        for (Material m : catalogo) {
            System.out.println(m.descripcion());
        }
    }

    // Búsqueda por título (contiene el texto, sin distinguir mayúsculas)
    public List<Material> buscarPorTitulo(String texto) {
        List<Material> resultado = new ArrayList<>();
        for (Material m : catalogo) {
            if (m.getTitulo().toLowerCase().contains(texto.toLowerCase())) {
                resultado.add(m);
            }
        }
        return resultado;
    }

    // Ordenamiento por año (HashSet no tiene orden, por eso pasamos a List)
    public List<Material> ordenarPorAnio() {
        List<Material> lista = new ArrayList<>(catalogo);
        lista.sort(Comparator.comparingInt(Material::getAnio));
        return lista;
    }
}
