package upo;
/**
 * Created by austepha on 28/09/2015.
 */
public class ProductC extends Produits {

    static {
        ProductFactory.registerProduit("ProduitC", new ProductC());
    }

    ProductC(){
        super();
    }
    static{
        ProductFactory.registerProduit("ProductC", new ProductC());
    }

    @Override
    public void dostuff() {
        System .out. println ("I'm a ProductC , performing ");
    }

    @Override
    public void doIt() {

    }

    @Override
    public Produit createProduit() {
        return new ProductC();
    }
}