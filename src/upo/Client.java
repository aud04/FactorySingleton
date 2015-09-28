package upo;

/**
 * Created by austepha on 28/09/2015.
 */
public class Client {

        public Client (){
             prodA = new ProductA ();
             }
         public void foo (){
             prodA . dostuff();
             ProductB myProdB = new ProductB ();
             myProdB . doIt ();
             ProductC myProdC = new ProductC ();

         }
         ProductA prodA ;
         ProductB prodB ;
}



