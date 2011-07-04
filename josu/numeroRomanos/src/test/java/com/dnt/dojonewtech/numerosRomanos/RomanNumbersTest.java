/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dnt.dojonewtech.numerosRomanos;

import java.security.InvalidParameterException;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author josu
 */
public class RomanNumbersTest {

    private RomanNumbers numerosRomanos;
    private RomanFixedNumbers romanFixedNumbers;

    @Before
    public void setUp() {
        romanFixedNumbers = new RomanFixedNumbers();
        numerosRomanos = new RomanNumbers(romanFixedNumbers);
    }

    @Test
    public void parse_one_to_roman_numbers_should_return_I() {
        String result = numerosRomanos.parse(1);
        Assert.assertEquals("I", result);
    }

    @Test
    public void parse_two_to_roman_numbers_should_return_II() {
        String result = numerosRomanos.parse(2);
        Assert.assertEquals("II", result);
    }

    @Test
    public void parse_five_should_return_V() {
        String result = numerosRomanos.parse(5);
        Assert.assertEquals("V", result);
    }

    @Test
    public void parse_seven_should_return_VII() {
        String result = numerosRomanos.parse(7);
        Assert.assertEquals("VII", result);
    }

    @Test
    public void parse_four_should_return_IV() {
        String result = numerosRomanos.parse(4);
        Assert.assertEquals("IV", result);
    }

    @Test
    public void parse_eight_should_return_VIII() {
        String result = numerosRomanos.parse(8);
        Assert.assertEquals("VIII", result);
    }
    
    @Test
    public void parse_nine_should_return_IX(){
        
        Assert.assertEquals("IX", numerosRomanos.parse(9));
        
    }
    
    @Test(expected=InvalidParameterException.class)
    public void parse_three_thousand_should_raise_exception(){
        String result = numerosRomanos.parse(3000);
    }
}
