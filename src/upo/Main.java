package upo;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

/**
 * Created by austepha on 28/09/2015.
 */
public final class Main {

    static {


            try
            {
                /* Class.forName("upo.ProductA");
            Class.forName("upo.ProductB");*/

                Properties p = new Properties();
                InputStream in = Files.newInputStream(Paths.get("classes.properties"));
                p.load(in);
                Set<Map.Entry<Object, Object>> val = p.entrySet();
                for (Map.Entry<Object, Object> entry : val) {
                    Class.forName((String) entry.getValue());

                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }


    }


    public static void main ( String [] args ) {
        ProductFactory productFactory = ProductFactory.instance();
        Produit produitA = productFactory.createProduits("ProductA");
        Produit produitB = productFactory.createProduits("ProductB");
        System.out.println(produitA);
        System.out.println(produitB);
    }
}
