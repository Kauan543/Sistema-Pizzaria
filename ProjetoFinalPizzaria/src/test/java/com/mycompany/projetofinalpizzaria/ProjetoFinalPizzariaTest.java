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
    @Test
    public void testCliente1() {
        //testar se consigo instaciar normalmente um cliente
        String teste;
        try{
            Cliente cliente = new Cliente("Kauan", "Calegari", "41999421702");
            teste = "Passou";
        }
        catch(IllegalArgumentException e){
            teste = "Falhou 1";
        }
        catch(Exception e){
            teste = "Falhou 2";
        }
        assertEquals("Passou", teste);
        
    }
    @Test
    public void testCliente2() {
        //testar se lança exceção com telefone invalido 
        String teste;
        try{
            Cliente cliente = new Cliente("Kauan", "Calegari", "celular");
            teste = "Passou";
        }
        catch(IllegalArgumentException e){
            teste = "Falhou 1";
        }
        catch(Exception e){
            teste = "Falhou 2";
        }
        assertEquals("Falhou 1", teste);
        
    }
    @Test
    public void testCliente3() {
        //testar se lança exceção com sobrenome invalido
        String teste;
        try{
            Cliente cliente = new Cliente("Kauan", "Calegari1", "41999421702");
            teste = "Passou";
        }
        catch(IllegalArgumentException e){
            teste = "Falhou 1";
        }
        catch(Exception e){
            teste = "Falhou 2";
        }
        assertEquals("Falhou 2", teste);
        
    }
    @Test
    public void testCliente4() {
        //testar se lança exceção com nome invalido
        String teste;
        try{
            Cliente cliente = new Cliente("Kaua1n", "Calegari", "41999421702");
            teste = "Passou";
        }
        catch(IllegalArgumentException e){
            teste = "Falhou 1";
        }
        catch(Exception e){
            teste = "Falhou 2";
        }
        assertEquals("Falhou 2", teste);
        
    }
    @Test
    public void testCliente5() {
        //testar se consigo instaciar normalmente um cliente utilizando os Setters
        String teste;
        try{
            Cliente cliente = new Cliente("Kauan", "Calegari", "41999421702");
            cliente.setNome("Joao");
            cliente.setSobrenome("Paulo");
            cliente.setTelefone("51999421702");
            teste = "Passou";
        }
        catch(IllegalArgumentException e){
            teste = "Falhou 1";
        }
        catch(Exception e){
            teste = "Falhou 2";
        }
        assertEquals("Passou", teste);
        
    }
    @Test
    public void testCliente6() {
        //testar se lança exceção com telefone invalido utilizando os Setters
        String teste;
        try{
            Cliente cliente = new Cliente("Kauan", "Calegari", "41999421702");
            cliente.setNome("Joao");
            cliente.setSobrenome("Paulo");
            cliente.setTelefone("5199942170248399842");
            teste = "Passou";
        }
        catch(IllegalArgumentException e){
            teste = "Falhou 1";
        }
        catch(Exception e){
            teste = "Falhou 2";
        }
        assertEquals("Falhou 1", teste);
        
    }
    @Test
    public void testCliente7() {
        //testar se lança exceção com sobrenome invalido utilizando os Setters
        String teste;
        try{
            Cliente cliente = new Cliente("Kauan", "Calegari", "41999421702");
            cliente.setNome("Joao");
            cliente.setSobrenome("Paulo%");
            cliente.setTelefone("51999421702");
            teste = "Passou";
        }
        catch(IllegalArgumentException e){
            teste = "Falhou 1";
        }
        catch(Exception e){
            teste = "Falhou 2";
        }
        assertEquals("Falhou 2", teste);
        
    }
     @Test
    public void testCliente8() {
        //testar se lança exceção com nome invalido utilizando os Setters
        String teste;
        try{
            Cliente cliente = new Cliente("Kauan", "Calegari", "41999421702");
            cliente.setNome("Joao%");
            cliente.setSobrenome("Paulo");
            cliente.setTelefone("51999421702");
            teste = "Passou";
        }
        catch(IllegalArgumentException e){
            teste = "Falhou 1";
        }
        catch(Exception e){
            teste = "Falhou 2";
        }
        assertEquals("Falhou 2", teste);
        
    }
    @Test
    public void testSabor1() {
        //testar se lança exceção com sabor invalido
        String teste;
        try{
            TipoPizza tipo = new TipoPizza("Simples", 0);
            Sabor sabor = new Sabor("Calabresa1!", tipo);
            teste = "Passou";
        }
        catch(Exception e){
            teste = "Falhou";
        }
        assertEquals("Falhou", teste);
        
    }
    @Test
    public void testSabor2() {
        //testar se instancia sabor normalmente
        String teste; 
        try{
            TipoPizza tipo = new TipoPizza("Simples", 0);
            Sabor sabor = new Sabor("Calabresa", tipo);
            teste = "Passou";
        }
        catch(Exception e){
            teste = "Falhou";
        }
        assertEquals("Passou", teste);
        
    }
    @Test
    public void testTipoPizza1() {
        //testar se instancia tipo pizza normalmente
        String teste; 
        try{
            TipoPizza tipo = new TipoPizza("Simples", 2.50);
            teste = "Passou";
        }
        catch(Exception e){
            teste = "Falhou";
        }
        assertEquals("Passou", teste);
        
    }
     @Test
    public void testTipoPizza2() {
        //testar se lança exceção com tipoPizza invalido
        String teste; 
        try{
            TipoPizza tipo = new TipoPizza("Simples", 2.512);
            teste = "Passou";
        }
        catch(Exception e){
            teste = "Falhou";
        }
        assertEquals("Falhou", teste);
        
    }
}
