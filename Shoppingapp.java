/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
interface Shoppingapp{
    void Login();
    void search();
    void addtocart();
    void payment();
    void placeorder();
    void track();
    void welcome();
}
abstract class Amazon implements Shoppingapp{
    public void welcome(){
    System.out.println("___________________");
    System.out.println("**welcome..**");
    System.out.println("___________________");
    }
}
    
class Amazonprime extends Amazon{
    
    public void Login(){
        System.out.println("\n-->1.Login with mobile number");
    }
    public void search(){
        System.out.println("\n-->2.search-all products available");
    }
    public void addtocart(){
        System.out.println("\n-->3.select size..quantity..");
        System.out.println("successfully added to cart");
    }
    public void payment(){
        System.out.println("\n-->4.razorpay-pay via upi..cod..wallet..netbanking");
        System.out.println("payment successfull on 10th jan");
    }
    public void placeorder(){
        System.out.println("\n-->5.order placed");
    }
    public void track(){
        System.out.println("\n-->6.**Track order**");
        System.out.println("\n**shipping on 12th jan");
        System.out.println("****out for delivery on 14th jan");
        System.out.println("******estimated delivery on 15th jan");
    }
    
}


public class Main
{
	public static void main(String[] args) {
	    Shoppingapp myshopping=new Amazonprime();
	    myshopping.welcome();
	    myshopping.Login();
	    myshopping.search();
	    myshopping.addtocart();
	    myshopping.payment();
	    myshopping.placeorder();
	    myshopping.track();
	    System.out.println("\n____________________________________________");
	    System.out.println("\nThank you for shopping...**explore more**");
	    System.out.println("\n____________________________________________");
	    
	}
}
