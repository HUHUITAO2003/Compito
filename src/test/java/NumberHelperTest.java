/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
/**
 *
 * @author informatica
 */
public class NumberHelperTest {

     public NumberHelperTest() {
    }

    @Test
    public void TestisEven(){
        System.out.println();
        NumberHelper instance = new NumberHelper(5);
        boolean expResult = false;
        boolean result=instance.isEven();
        assertEquals(expResult, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

}