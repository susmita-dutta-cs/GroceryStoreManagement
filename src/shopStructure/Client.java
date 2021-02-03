package shopStructure;

import implementedDatastructures.LinkedList;

import implementedDatastructures.Graph;


public class Client implements Comparable{
	private String clientName;
	private String clientID;
	private Basket basket;
	private LinkedList history;
	private Basket shoppingList;
	private Graph optimalPath;
	
	
	public Client(String name, int clientID) {
		clientName = name;
		clientID = clientID;
		basket = new Basket();
		history = new LinkedList();
		shoppingList = new Basket();
		optimalPath = new Graph();
		
	
	}

	public void addBasket(Product products, int qty) {
		basket.addItem(products,qty);
	}
	
	public void clearShoppingList() {
		shoppingList = null;
	}
		
	public void removeBasket(Product products, int quantity) {
		basket.removeItem(products,quantity);
	}
	public void Client1(String name) {
		this.clientName = name;
		
	}
	//public void addFreshProduct(FreshProducts products,float qty){
		//basket.addFreshProduct(products,qty);
	//}
	
	
	
	public Basket getBasket()
	{
		return basket;
	}	
	
	public String getName() {
		return clientName;
		
	}
	public String getId() {
		return clientID;
		
	}
//	public void removeAll() {
//		basket.removeAll();
//	}
	public void printAll() {
		basket.print();
	}

	public float computeBasketPrice() {
		return basket.calculatePrice();
	}

	public String toString() {
		return "Client name is :" + " "+ clientName+"Client Id is  :"+ " "+ clientID+" ";
	}


	public LinkedList gethistory() {
		return history;
	}
	public void checkout() {
		history.addLast(history);
		this.basket = new Basket();
		}
	public void printHistory() {
		for(int i=0;i<history.size();i++) {
			((Basket)history.get(i)).print();
		}
	}

	@Override
	public int compareTo(Object o) {
		Client x = (Client) o;
		return ((Comparable)clientID).compareTo(x.getId());
		//return 0;
	}
	public Basket getShoppingList() {
		
		return shoppingList;
	}
	public Graph pathL() {
		
	return optimalPath;
	
	}


}
