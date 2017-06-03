/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letraj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author crist
 */
public class FiguraTest {
    
    public FiguraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of moverDerecha method, of class Figura.
     */
    @Test
    public void testMoverDerecha() {
        System.out.println("moverDerecha");
        int[][] xy = null;
        Figura instance = new Figura();
        int[][] expResult = null;
        int[][] result = instance.moverDerecha(xy);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moverIzquierda method, of class Figura.
     */
    @Test
    public void testMoverIzquierda() {
        System.out.println("moverIzquierda");
        int[][] xy = null;
        Figura instance = new Figura();
        int[][] expResult = null;
        int[][] result = instance.moverIzquierda(xy);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moverAbajo method, of class Figura.
     */
    @Test
    public void testMoverAbajo() {
        System.out.println("moverAbajo");
        int[][] xy = null;
        Figura instance = new Figura();
        int[][] expResult = null;
        int[][] result = instance.moverAbajo(xy);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of girar method, of class Figura.
     */
    @Test
    public void testGirar() {
        System.out.println("girar");
        int[][] xy = null;
        Figura instance = new Figura();
        int[][] expResult = null;
        int[][] result = instance.girar(xy);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of girarUno method, of class Figura.
     */
    @Test
    public void testGirarUno() {
        System.out.println("girarUno");
        int[][] xy = null;
        Figura instance = new Figura();
        int[][] expResult = null;
        int[][] result = instance.girarUno(xy);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of girarDos method, of class Figura.
     */
    @Test
    public void testGirarDos() {
        System.out.println("girarDos");
        int[][] xy = null;
        Figura instance = new Figura();
        int[][] expResult = null;
        int[][] result = instance.girarDos(xy);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of girarTres method, of class Figura.
     */
    @Test
    public void testGirarTres() {
        System.out.println("girarTres");
        int[][] xy = null;
        Figura instance = new Figura();
        int[][] expResult = null;
        int[][] result = instance.girarTres(xy);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of girarCuatro method, of class Figura.
     */
    @Test
    public void testGirarCuatro() {
        System.out.println("girarCuatro");
        int[][] xy = null;
        Figura instance = new Figura();
        int[][] expResult = null;
        int[][] result = instance.girarCuatro(xy);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
