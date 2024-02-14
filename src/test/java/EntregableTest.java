
import org.junit.jupiter.api.Test;

import ejerciciosUnitarias.Serie;
import ejerciciosUnitarias.Videojuego;

import static org.junit.jupiter.api.Assertions.*;

public class EntregableTest {

    @Test
    public void testVideojuego() {
        // Crear instancias de Videojuego para realizar pruebas
        Videojuego videojuego1 = new Videojuego("Juego1", 50, "Aventura", "Compañia1");
        Videojuego videojuego2 = new Videojuego("Juego2", 70, "Acción", "Compañia2");
        Videojuego videojuego3 = new Videojuego("Juego2", "Compañia");
        Videojuego videojuego4 = new Videojuego();
        

        // Realizar pruebas
        assertEquals(0, videojuego1.compareTo(videojuego1)); // Deberían ser iguales
        assertEquals(1, videojuego2.compareTo(videojuego1)); // Debería ser mayor

        // Más pruebas según tus necesidades
    }

    @Test
    public void testSerie() {
        // Crear instancias de Serie para realizar pruebas
        Serie serie1 = new Serie("Serie1", 5, "Drama", "Creador1");
        Serie serie2 = new Serie("Serie2", 3, "Comedia", "Creador2");

        // Realizar pruebas
        assertEquals(0, serie1.compareTo(serie1)); // Deberían ser iguales
        assertEquals(-1, serie2.compareTo(serie1)); // Debería ser menor

        // Más pruebas según tus necesidades
    }

    @Test
    public void testEntregable() {
        // Crear instancias de las clases que implementan Entregable
        Videojuego videojuego = new Videojuego("Juego", 50, "Aventura", "Compañia");
        Serie serie = new Serie("Serie", 5, "Drama", "Creador");

        // Realizar pruebas específicas de la interfaz Entregable
        assertFalse(videojuego.isEntregado()); // Debería ser false por defecto
        videojuego.entregar();
        assertTrue(videojuego.isEntregado()); // Debería ser true después de entregar
        videojuego.devolver();
        assertFalse(videojuego.isEntregado()); // Debería ser false después de devolver

        assertFalse(serie.isEntregado()); // Debería ser false por defecto
        serie.entregar();
        assertTrue(serie.isEntregado()); // Debería ser true después de entregar
        serie.devolver();
        assertFalse(serie.isEntregado()); // Debería ser false después de devolver
    }
    @Test
    public void testEquals() {
        // Crear instancias de Videojuego para realizar pruebas
        Videojuego videojuego1 = new Videojuego("Juego1", 50, "Aventura", "Compañia1");
        Videojuego videojuego2 = new Videojuego("Juego1", 50, "Aventura", "Compañia1");
        Videojuego videojuego3 = new Videojuego("Juego2", 70, "Acción", "Compañia2");

        // Verificar que videojuego1 sea igual a sí mismo
        assertTrue(videojuego1.equals(videojuego1));

        // Verificar que videojuego1 sea igual a videojuego2
        assertTrue(videojuego1.equals(videojuego2));

        // Verificar que videojuego1 no sea igual a videojuego3
        assertFalse(videojuego1.equals(videojuego3));
    }

    
    
    
    
}
