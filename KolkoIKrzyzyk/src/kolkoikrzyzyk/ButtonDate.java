/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolkoikrzyzyk;

/**
 *
 * @author User
 */
public class ButtonDate {

    private String sign;

    public ButtonDate() {
        
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) throws Exception {
        if (sign == null){
           this.sign = null;
           return;
        }
        if (this.sign != null){
            throw new Exception("Pole jest już wypełnione");
        }
        
        if (sign.equals("x") || (sign.equals("o")) || (sign == null)) {
            this.sign = sign;
        } else {
            throw new Exception("Znak niedozwolony");
        } 
       

    }
}
