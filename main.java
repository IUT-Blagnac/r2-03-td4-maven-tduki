public class Main {
	public static void main(String[] argv) {
        Pile maPile = Pile.CreerPile(10);
        int element = 0;
        if (!maPile.est_vide()) System.out.println("NOK");
        
        try {
        maPile.empiler(5);
        }catch(Exception e) {e.getMessage();}
        if (maPile.est_vide()) System.out.println("NOK");

        if (maPile.Sommet() != 5) System.out.println("NOK");
        
        maPile.Vider();
        if (!maPile.est_vide()) System.out.println("NOK");
        
        try {
            maPile.empiler(5);
            }catch(Exception e) {e.getMessage();}

        try {
        element = maPile.depiler();
        }catch(Exception e) {e.getMessage();}
        
        if (!maPile.est_vide()) System.out.println("NOK");
        if (element != 5) System.out.println("NOK");
        
        System.out.print(maPile.Sommet());
    }
}
