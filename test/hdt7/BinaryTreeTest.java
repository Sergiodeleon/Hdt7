/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio
 */
public class BinaryTreeTest {
    
    public BinaryTreeTest() {
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
     * Test of insertarNodo method, of class BinaryTree.
     */
    @Test
    public void testInsertarNodo() {
        System.out.println("insertarNodo");
        Association<String,String> valorInsertar=new Association<>(); 
        valorInsertar.setEspañol("Casa");
        valorInsertar.setIngles("House");
        BinaryTree instance = new BinaryTree();
        instance.insertarNodo(valorInsertar);
    }

    /**
     * Test of buscar method, of class BinaryTree.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        BinaryTree instance = new BinaryTree();
        String palabra = "House";
        String expResult = "House";
        String result = instance.buscar(palabra);
        assertEquals(expResult, result);

    }
    
}
