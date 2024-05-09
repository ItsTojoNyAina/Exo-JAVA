package exo;

public class filedepriorite {
    private int []tab;
    private int n;
    public filedepriorite(int i){
        tab = new int[10000];
    }


    private void permut(int p1, int p2){
        int tmp = tab[p1];
        tab[p1] = tab[p2];
        tab[p2] = tmp;
    }
    public void ajout(int nouv){
        int i = n;
        while (i>0 && tab[(i-1)/2]<=nouv){
            tab[i] = tab[(i-1)/2];
            i = (i-1)/2;
        }
        tab[i] = nouv;
        ++n;
    }
    public boolean estvide(){

        return n<=0;
    }
    public int lecture(){

        return tab[1];
    }
    public int extraction(){
        int v = tab[0];
        n--;
        tab[0] = tab[n];
        int i = 0;
        while (n!=0) {
            int filsgauche = 2 * i + 1;
            int filsdroite = 2 * i + 2;
            int larg = i;

            if (filsgauche < n && tab[filsgauche] > tab[larg]) {
                larg = filsgauche;
            }

            if (filsdroite < n && tab[filsdroite] > tab[larg]) {
                larg = filsdroite;
            }

            if (larg != i) {
                permut(i, larg);
                i = larg;
            } else {
                break;
            }
        }
        return v;
    }
    public int getNbElements(){

        return n;
    }
    public static void main(String[] args){
        filedepriorite fp = new filedepriorite(100);
        fp.ajout(14);
        fp.ajout(0);
        fp.ajout(17);
        fp.ajout(20);
        fp.ajout(95);
        fp.ajout(112);
        while (!fp.estvide()){
            System.out.println(fp.extraction());
        }
    }
}
