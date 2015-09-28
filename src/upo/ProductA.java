package upo;

import clover.com.atlassian.extras.api.Product;

/**
 * Created by austepha on 28/09/2015.
 */
public class ProductA extends Produits {

    static {
        ProductFactory.registerProduit("ProduitA", new ProductA());
    }

ProductA(){
        super();
    }
    static{
        ProductFactory.registerProduit("ProductA", new ProductA());
    }

    @Override
    public void dostuff() {

    }

    @Override
    public void doIt() {
        System .out. println ("I'm a ProductB , doing it");
    }

    @Override
    public Produit createProduit() {
        return new ProductA();
    }
}
