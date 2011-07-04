/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dnt.dojonewtech.numerosRomanos;

import java.util.List;
import com.dnt.dojonewtech.numerosRomanos.exception.NotTraductionForFixedNumberExpection;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author josu
 */
public class RomanFixedNumbersTest {

    private RomanFixedNumbers romanFixedNumbers;

    @Before
    public void setUp() {
        romanFixedNumbers = new RomanFixedNumbers();
    }

    @Test
    public void getNumberFor_1_should_return_I() throws NotTraductionForFixedNumberExpection {
        String result = romanFixedNumbers.getNumberFor(1);
        assertEquals("I", result);
    }

    @Test(expected = NotTraductionForFixedNumberExpection.class)
    public void getNumberFor_2_should_return_notTraductionForFixedNumberException() throws NotTraductionForFixedNumberExpection {
        String result = romanFixedNumbers.getNumberFor(2);
    }

    @Test
    public void getNumberFor_5_should_return_V() throws NotTraductionForFixedNumberExpection {
        String result = romanFixedNumbers.getNumberFor(5);
        assertEquals("V", result);
    }

    @Test
    public void getFixedNumberValuesList_should_return_Integer_List_containing_1000_500_100_50_10_5_1() throws NotTraductionForFixedNumberExpection {
        List<Integer> romanFixedValuesList = romanFixedNumbers.getFixedNumberValuesList();

        assertEquals(7, romanFixedValuesList.size());
        assertEquals(1000L, romanFixedValuesList.get(0).longValue());
        assertEquals(500L, romanFixedValuesList.get(1).longValue());
        assertEquals(100L, romanFixedValuesList.get(2).longValue());
        assertEquals(50L, romanFixedValuesList.get(3).longValue());
        assertEquals(10L, romanFixedValuesList.get(4).longValue());
        assertEquals(5L, romanFixedValuesList.get(5).longValue());
        assertEquals(1L, romanFixedValuesList.get(6).longValue());
    }
}
