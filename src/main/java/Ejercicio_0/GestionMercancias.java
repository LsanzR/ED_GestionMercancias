/**
 *  El siguiente código es un fragmento funcional pero con margen de mejora para poder aplicar refactorización, control de versiones, documentación con JavaDoc y herramientas de integración continua. El código
 representará una gestión básica de mercancías peligrosas dentro de una compañía de transporte. Contendrá deficiencias intencionadas para la refactorización y optimización como parte de la actividad.
 */

package Ejercicio_0;

/**
 * Entry point que gestiona las mercancias del software
 */

public class GestionMercancias {
    public static void main(String[] args) {
        SistemaTransporte sistemaTransporte = new SistemaTransporte();
        sistemaTransporte.agregarMercancia(new Mercancia("Quimico A", "España", "Francia", 100));
        sistemaTransporte.agregarMercancia(new Mercancia("Gas A", "Berlin", "España", 1000));
        sistemaTransporte.mostrarMercancias();
    }
}