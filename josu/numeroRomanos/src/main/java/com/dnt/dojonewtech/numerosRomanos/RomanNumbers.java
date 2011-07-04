/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dnt.dojonewtech.numerosRomanos;

import com.dnt.dojonewtech.numerosRomanos.exception.NotTraductionForFixedNumberExpection;
import java.security.InvalidParameterException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josu
 */
class RomanNumbers {
    
    private RomanFixedNumbers romanFixedNumbers;

    public RomanNumbers(RomanFixedNumbers romanFixedNumbers) {
        this.romanFixedNumbers = romanFixedNumbers;
    }

    public String parse(int number) {
        if (number >= 3000){
            throw new InvalidParameterException();
        }
        String result = "";

        List<Integer> fixedNumbers = this.romanFixedNumbers.getFixedNumberValuesList();

        for (int fixedNumberIndex = 0; fixedNumberIndex < fixedNumbers.size(); fixedNumberIndex++) {
            int fixedNumber = fixedNumbers.get(fixedNumberIndex);
            
            if (number == 9){
                try {
                    result += romanFixedNumbers.getNumberFor(1) + romanFixedNumbers.getNumberFor(10);
                } catch (NotTraductionForFixedNumberExpection ex) {
                }
                number = 0;
            }else{
                int times = number / fixedNumber;
                try {
                    if (times < 4){
                        result = addValueTimesToResult(this.romanFixedNumbers.getNumberFor(fixedNumber), times, result);
                    }else{
                        int previousFixedNumber = fixedNumbers.get(fixedNumberIndex - 1).intValue();
                        result = addValueTimesToResult(this.romanFixedNumbers.getNumberFor(fixedNumber), 1, result);
                        result = addValueTimesToResult(this.romanFixedNumbers.getNumberFor(previousFixedNumber), 1, result);
                    }
                } catch (NotTraductionForFixedNumberExpection ex) {
                   continue;
                }
                number -= (fixedNumber * times);
            }
        }

        
        return result;
    }

    private String addValueTimesToResult(String value, int times, String result) {;
        for (int indexOfTimes = 0; indexOfTimes < times; indexOfTimes++) {
            result += value;
        }
        return result;
    }
}
