package shopStructure;

class FreshProducts extends Allproducts{



	public FreshProducts(String nameFp, float priceFp, int barcodeId, float amount) {
		name = nameFp;
		price = priceFp;
		barCode = barcodeId;
		quantity = amount;
	}
	public void removeFresh(float amount) {
		quantity = quantity - amount;

		
	}
	public String toString() {
		return "\nName: "+name + " "+"\nPrice: "+price +" "+"\nBarcode: "+ barCode+" "+"\nQuantity: "+ quantity;
	}

}
