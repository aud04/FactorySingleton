package upo;
/**
 * Created by austepha on 28/09/2015.
 */
public class ProductB extends Produits{

    static {
        ProductFactory.registerProduit("ProduitB", new ProductB());
    }


    ProductB(){
        super();
    }
    static{
        ProductFactory.registerProduit("ProductB", new ProductB());
    }

    @Override
    public void dostuff() {

    }

    @Override
    public void doIt (){
        System .out. println ("I'm a ProductB , doing it");
    }

    @Override
    public Produit createProduit() {
        return new ProductB();
    }

    @Override
    public String toString() {
        return super.toString()+"\nProductB{}";
    }
}