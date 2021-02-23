/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newsaleprogram;

/**
 *
 * @author Ege Baran
 */
public class Tax {
    
    public Tax() {
        
    }
    Sale sale = new Sale();
    
    
    public float TaxHesap(){
        
        float vergisiz = sale.getTotal().getValue();
        float newvalue = (vergisiz*110)/100;
        return newvalue;
    }
    
    
}
