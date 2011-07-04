/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dnt.dojonewtech.numerosRomanos;

import com.dnt.dojonewtech.numerosRomanos.exception.NotTraductionForFixedNumberExpection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author josu
 */
class RomanFixedNumbers {
   
    private HashMap<Integer, String> fixedNumbers;
    
    public RomanFixedNumbers(){
        fixedNumbers = new HashMap<Integer, String>();
        
        fixedNumbers.put(1, "I");
        fixedNumbers.put(5, "V");
        fixedNumbers.put(10, "X");
    
    }
    
    String getNumberFor(int number) throws NotTraductionForFixedNumberExpection {
        String result = fixedNumbers.get(new Integer(number));
        
        if (result == null){
            throw new NotTraductionForFixedNumberExpection(number);
        }
        
        return result;
    }

    List<Integer> getFixedNumberValuesList() {
        List<Integer> fixedNumberList = new ArrayList<Integer>(fixedNumbers.keySet());
        Collections.sort(fixedNumberList);
        Collections.reverse(fixedNumberList);
        return fixedNumberList;
    }
    
}
