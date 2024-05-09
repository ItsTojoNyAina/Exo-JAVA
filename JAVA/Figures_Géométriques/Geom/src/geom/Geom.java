/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geom;

import java.util.ArrayList;
public class Geom {

    public static void main(String[] args) {
        ArrayList<FigGeo> liste = new ArrayList<>();
        
        liste.add(new Carre(4));
        liste.add(new Carre2(8));
        liste.add(new Rectangle(5,3));
        liste.add(new Rectangle(4,7));
        liste.add(new Ellipse(3, 7));
        liste.add(new Rectangle(5, 3));
        
        for (FigGeo figGeo : liste) {
            System.out.println(figGeo);
        }
        double s = 0;
        for (FigGeo figGeo : liste) {
            s+=figGeo.surface();
        }
        System.out.println(s);
        
    }
    
}
