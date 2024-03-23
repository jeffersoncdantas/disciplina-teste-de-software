import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloTeste {

    Triangulo tri = new Triangulo();

    @Test
    public void testaTriangulo(){
        assertTrue(tri.isTriangulo(3, 2, 4));
        assertTrue(tri.isTriangulo(2, 2,3));
        assertFalse(tri.isTriangulo(1, 1,3));
        assertFalse(tri.isTriangulo(2, 2,4));      
    }

    @Test
    public void testeEquilatero(){
        assertTrue(tri.isEquilatero(5, 5, 5));
        assertTrue(tri.isEquilatero(10, 10,10));
        assertFalse(tri.isEquilatero(3, 3, 5));
        assertFalse(tri.isEquilatero(3, 4, 5));  
    }
    
    @Test
    public void testeIsoceles(){
        assertTrue(tri.isIsoceles(3, 3, 5));
        assertTrue(tri.isIsoceles(10, 6,6));
        assertFalse(tri.isIsoceles(5, 5, 5));
        assertFalse(tri.isIsoceles(3, 4, 5));  
    }

    @Test
    public void testeEscaleno(){
        assertTrue(tri.isEscaleno(3, 4, 5));
        assertTrue(tri.isEscaleno(7, 8,9));
        assertFalse(tri.isEscaleno(3, 3, 5));
        assertFalse(tri.isEscaleno(10, 10,10));  
    }
}
