package Ejercicio_0;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona la logistica del transporte
 */
public class SistemaTransporte implements Transporte{
    private List<Mercancia> listaMercancias;

    /**
     * Constructor de SistemaTransporte
     */
    public SistemaTransporte() {
        this.listaMercancias = new ArrayList<>();
    }

    /**
     * Agrega una mercancia a la lista
     *
     * @param mercancia
     */
    @Override
    public void agregarMercancia(Mercancia mercancia) {
        if (mercancia != null) {
            listaMercancias.add(mercancia);
        }
    }

    /**
     * Muestra la lista de las mercancias
     */
    @Override
    public void mostrarMercancias() {
        if (listaMercancias.isEmpty()) {
            System.out.println("No se encontraron mercancias");
        } else {
            listaMercancias.forEach(System.out::println);
        }
    }

    /**
     * Elimina una mercancia de la lista
     * 
     * @param nombre
     */
    public void eliminarMercancia(String nombre) {
        listaMercancias.removeIf(mercancia -> mercancia.getNombre().equals(nombre));
    }
}
