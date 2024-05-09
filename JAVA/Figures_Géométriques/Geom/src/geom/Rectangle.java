/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geom;

public class Rectangle implements FigGeo{

    private double longeur;
    private double largeur;

    public Rectangle(double longeur, double largeur) {
        this.longeur = longeur;
        this.largeur = largeur;
    }
     
    @Override
    public double surface() {
        return longeur*largeur;
    }

    @Override
    public double perimetre() {
        return 2*(longeur+largeur);
    }    


    @Override
    public String toString() {
        return "Rectangle{" + "longeur=" + longeur + ", largeur=" + largeur + '}';
    }

    
    public double getLongeur() {
        return longeur;
    }

    public double getLargeur() {
        return largeur;
    }

    
    
    
}
