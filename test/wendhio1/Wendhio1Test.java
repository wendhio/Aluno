/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wendhio1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wendhio
 */
public class Wendhio1Test {
    
    public Wendhio1Test() {
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
     * Test of main method, of class Wendhio1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Wendhio1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of instanciar method, of class Wendhio1.
     */
    @Test
    public void testInstanciar() {
        System.out.println("instanciar");
        Wendhio1.instanciar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaMat method, of class Wendhio1.
     */
    @Test
    public void testBuscaMat() {
        System.out.println("buscaMat");
        String str = "";
        boolean expResult = false;
        boolean result = Wendhio1.buscaMat(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscaAluno method, of class Wendhio1.
     */
    @Test
    public void testBuscaAluno() {
        System.out.println("buscaAluno");
        String str = "";
        Aluno expResult = null;
        Aluno result = Wendhio1.buscaAluno(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimir method, of class Wendhio1.
     */
    @Test
    public void testImprimir() {
        System.out.println("imprimir");
        Wendhio1.imprimir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verSalvos method, of class Wendhio1.
     */
    @Test
    public void testVerSalvos() {
        System.out.println("verSalvos");
        Wendhio1.verSalvos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterar method, of class Wendhio1.
     */
    @Test
    public void testAlterar() {
        System.out.println("alterar");
        Wendhio1.alterar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class Wendhio1.
     */
    @Test
    public void testExcluir() {
        System.out.println("excluir");
        Wendhio1.excluir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
