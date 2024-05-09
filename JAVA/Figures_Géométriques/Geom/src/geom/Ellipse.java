/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geom;

public class Ellipse implements FigGeo{

    private double rayon1;
    private double rayon2;

    public Ellipse(double rayon1, double rayon2) {
        this.rayon1 = rayon1;
        this.rayon2 = rayon2;
    }
     
    @Override
    public double surface() {
        return rayon1*rayon2*Math.PI;
    }

    @Override
    public double perimetre() {
        return Math.PI*Math.sqrt(2*(rayon1*rayon1+rayon2*rayon2));
    }    

    @Override
    public String toString() {
        return "Ellipse{" + "rayon1=" + rayon1 + ", rayon2=" + rayon2 + '}';
    }
}
