package shopStructure;

public class Product extends Allproducts {
	
	public Product(String depart,String nameProduct, float priceProduct, int barCodeId, int amount) {
		name = nameProduct;
		price = priceProduct;
		barCode = barCodeId;
		quantity = amount;
		department = department;
	}
	public String toString() {
		return "\nDepartment: "+department+" "+"\nName: "+name + " "+"\nPrice: "+price +" "+"\nBarcode: "+ barCode+" "+"\nQuantity: "+ quantity;
	}

}
