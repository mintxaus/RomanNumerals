/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dnt.dojonewtech.numerosRomanos.exception;

/**
 *
 * @author josu
 */
public class NotTraductionForFixedNumberExpection extends Exception{

    public NotTraductionForFixedNumberExpection(int number) {
        super("There is no fixed value in roman numbers for number " + String.valueOf(number));
    }
    
}
