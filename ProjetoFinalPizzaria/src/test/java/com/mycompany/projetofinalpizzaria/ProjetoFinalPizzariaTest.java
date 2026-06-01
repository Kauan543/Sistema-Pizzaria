package com.mycompany.projetofinalpizzaria;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kauan
 */
public class ProjetoFinalPizzariaTest {
    
    public ProjetoFinalPizzariaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAreaTriangulo() {
        Triangulo t1 = new Triangulo(6);
        Triangulo t2 = new Triangulo(5);
        double area = t1.calculaArea();
        double area2 = t2.calculaArea();
        assertEquals(area, 15.59);
        assertEquals(area2, 10.83);
        
    }
    @Test
    public void testAreaQuadrado() {
        Quadrado q1 = new Quadrado(6);
        Quadrado q2 = new Quadrado(5);
        double area = q1.calculaArea();
        double area2 = q2.calculaArea();
        assertEquals(area, 36);
        assertEquals(area2, 25);
        
    }
    @Test
    public void testAreaCirculo() {
        Circulo c1 = new Circulo(6);
        Circulo c2 = new Circulo(5);
        double area = c1.calculaArea();
        double area2 = c2.calculaArea();
        assertEquals(area, 113.1);
        assertEquals(area2, 78.54);
        
    }
    
}
