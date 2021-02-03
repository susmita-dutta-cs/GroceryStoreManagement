package shopStructure;

public class Allproducts implements Comparable{
	protected String name;
	protected float price;
	protected int barCode;
	protected float quantity;
	protected String department;
	
	public String getName() {
		return name;
		
	}
	public void removeQuantity(int number) {
		quantity -= number;
	}
	
	public float getPrice() {
		return price;
	}
	
	public int getBarCodeId() {
		return barCode;
	}


	public float getQuantity() {
		return quantity;
	}

	public String getDepartment() {
		return department;
	}

	public void addQuantity(float newQuantity) {
		quantity +=newQuantity;
	}
	
	public void setPrice(float newPrice) {
		price = newPrice;
	}

	public float totalPrice() {

		return quantity*price;
	}
	
	@Override
	public int compareTo(Object o) {
		Allproducts x = (Allproducts) o;
		return ((Comparable) barCode).compareTo(x.getBarCodeId());

	}
	

}
