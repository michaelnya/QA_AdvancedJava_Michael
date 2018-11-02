/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arthur.Michael.Test;

import Arthur.Michael.Math.SimpleCalc;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class SimpleCalcTest {
    
    public SimpleCalcTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testAdd() {
        int expectedResult = 8;
        int actualResult = SimpleCalc.add(3,5);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testMultiplication(){
            int expectedResult = 39;
            int actualResult = SimpleCalc.multiple(13,3);
            assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void _f__(){
        int expectedTotal = 0;
        
     //   List<String> basket 
        }
}
