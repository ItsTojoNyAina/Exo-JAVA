/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geom;
public class Carre2 extends Rectangle{

    public Carre2(double cote) {
        super(cote, cote);
    }
    
    @Override
    public String toString() {
        return "carré de "+getLargeur()+" de coté";
    }
    
    
}
