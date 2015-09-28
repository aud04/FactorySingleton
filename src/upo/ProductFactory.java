package upo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by austepha on 28/09/2015.
 */
public final class ProductFactory {
    private static final ProductFactory pf = new ProductFactory();
    private static final Map<String, Produit> reg = new HashMap<String, Produit>();
    public static void registerProduit(String name, Produit p){
        reg.put(name, p);
    }

    public  Produit createProduits(String name){
        return reg.get(name).createProduit();
    }
    public static ProductFactory instance(){
        return pf;
    }
    private ProductFactory(){

    }
}
