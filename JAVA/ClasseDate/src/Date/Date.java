package Date;

import java.util.ArrayList;

public class Date {
    private int jour;
    private int mois;
    private int annee;

    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public void setJour(int jour) {

        this.jour = jour;
    }

    public void setMois(int mois) {

        this.mois = mois;
    }

    public void setAnnee(int annee) {

        this.annee = annee;
    }

    public int getJour() {

        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {

        return annee;
    }

    public boolean isValid() {
        if (mois < 1 || mois > 12 || jour < 1) {
            return false;
        }

        if (mois == 2) {
            if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                return jour <= 29;
            } else {
                return jour <= 28;
            }
        } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            return jour <= 30;
        } else {
            return jour <= 31;
        }
    }

    public void lendemain() {
        if (isValid()) {
            jour++;
            if (jour > joursDansMois(mois, annee)) {
                jour = 1;
                mois++;
                if (mois > 12) {
                    mois = 1;
                    annee++;
                }
            }
        }
    }
    public void hier() {
        if (isValid()) {
            jour--;
            if (jour == 1) {
                mois--;
               if (mois == 0) {
                    mois = 12;
                    annee--;
                }
                jour = joursDansMois(mois, annee);
            }
            else if (jour!=1){
                jour--;
               }
            else if (jour!=0){
                jour--;
              }
            }
        }


    private int joursDansMois(int mois, int annee) {
        switch (mois) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }
    public static void main(String[] args){

        ArrayList<Date> list = new ArrayList<>();
        list.add(new Date(1,1,2023));
        list.add(new Date(1,5,2004));
        list.add(new Date(7,10,2007));
        for (Date d : list) {
            System.out.println("La date :"+ d.getJour() + "/" + d.getMois() + "/" + d.getAnnee());
            d.lendemain();
            System.out.println("La date du lendemain est :" + d.getJour() + "/" + d.getMois() + "/" + d.getAnnee());
            d.hier();
            System.out.println("La date de la veille est :" + d.getJour() + "/" + d.getMois() + "/" + d.getAnnee());
        }
   }
}
