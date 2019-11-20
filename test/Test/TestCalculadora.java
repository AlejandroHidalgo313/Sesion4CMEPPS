package Test;


import calculadora.Calculadora;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Alejandro
 */
public class TestCalculadora {
    
    public TestCalculadora() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testSuma()
    {
        assertEquals(5,Calculadora.suma(2,3));
    }
    
    @Test
    public void testResta()
    {
        assertEquals(1,Calculadora.resta(3,2));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
