/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geom;

public class Carre implements FigGeo{

    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    @Override
    public double surface() {

        return cote*cote;
    }

    @Override
    public double perimetre() {
        return cote*4;
    }

    @Override
    public String toString() {
        return "je suis un carré, j'ai "+cote+" de côté.";
    }
    
    

}
