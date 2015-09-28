package upo;

/**
 * Created by austepha on 28/09/2015.
 */
public abstract class Produits implements Produit {

    @Override
    public String toString() {
        return this.getClass().getCanonicalName();
    }
}
