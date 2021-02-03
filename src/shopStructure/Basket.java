// basket class
package shopStructure;
import implementedDatastructures.LinkedList;


public class Basket {
	private LinkedList product;
	private LinkedList freshProducts;

	public Basket() {
		
		 product = new LinkedList();
		 freshProducts = new LinkedList();
		 
		 
	
	}
	
	public void addItem(Product products, int quantity) {
		boolean x = true;
		for (int i=0;i<product.size();i++) {

			if(((Product)product.get(i)).getBarCodeId()==products.getBarCodeId()) {  //to check product already present on not
				((Product)product.get(i)).addQuantity(quantity);           //if yes increase quantity
//
			}
		}
		if( x ==false);
		Product addProduct = new Product(products.getDepartment(),products.getName(),products.getPrice(),products.getBarCodeId(),quantity);
		product.addLast(addProduct); //if no add as new product
		
		
	}
	public void removeItem(Product products, int quantity) {
		boolean x = false;
		for(int i=0;i<product.size();i++){
			x = true;
			if(((Product) product.get(i)).getBarCodeId()== products.barCode) {
				((Product)product.get(i)).removeQuantity(quantity);
				}
				
				
			}if (x==false)
				System.out.println("Error: product unavailable");
		
			
		}

	
	public void addFreshProduct(FreshProducts products,int quantity) {
		boolean x = false;
		for (int i=0;i<freshProducts.size();i++) {
			if(((FreshProducts)freshProducts.get(i)).getBarCodeId()==products.getBarCodeId()) {
				((FreshProducts)freshProducts.get(i)).addQuantity(quantity);
				x = true;
				
				
			}
		}
		if(x ==false) {
		FreshProducts addFresh = new FreshProducts(products.getName(),products.getPrice(),products.getBarCodeId(),quantity);
		freshProducts.addLast(addFresh);
		}
		
	
		
		
			
		}
//	public void removeAll() {
//		int i = product.size();
//		for (int j=0;j<i;j++) {
//			product.removeFirst();
//		}
//		int x = freshProducts.size();
//		for (int y=0;y<x;y++) {
//			freshProducts.removeFirst();
//
//
//		}
//	}
	public  void print() {
		System.out.println("************************");
		//System.out.println("The basket of Client contains :");
		System.out.println("\nProducts are :");
		for (int j=0;j<product.size();j++) {
			System.out.println(((Product)product.get(j)).toString());
			System.out.println();
			
		}
		System.out.println("Fresh products are :");
		
		for (int y=0;y<freshProducts.size();y++) {
			System.out.println(((FreshProducts) freshProducts.get(y)).toString());
			System.out.println();
		}
	}
	
		public float calculatePrice() {
			float a =0;
			for (int i=0;i<product.size();i++) {
				a = a + ((Product)product.get(i)).totalPrice();
			}
			for(int y=0;y<freshProducts.size();y++) {
				a = a + ((FreshProducts) freshProducts.get(y)).totalPrice();
			}
			return a;
			
		}
		
	
		

}
