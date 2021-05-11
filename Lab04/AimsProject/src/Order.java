
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITTED_ORDERED = 5;
	
	private int qtyOrdered;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private	MyDate dateOrdered;
	public static int nbOrder = 0;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.print("Order list if full");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered ++;
			System.out.println("Added!");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered > 0) {
			for (int i = 0; i < qtyOrdered; i++) {
				if (itemsOrdered[i].getTitle().equals(disc.getTitle())) {
					for (int j = i; j < qtyOrdered -1 ; j++) {
						itemsOrdered[j] = itemsOrdered[j+1];
					}
					qtyOrdered--;
					System.out.println("Removed!");
				}
			}
		}
		else System.out.println("Order list is empty!");
	}
	public float totalCost() {
		float totalCost = 0.0f;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}
	
	// Overload
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
			System.out.println("Order list is full!");
			return;
		}
		else {
			for (int i = 0; i < dvdList.length; i++) {
				this.addDigitalVideoDisc(dvdList[i]);
			}
			System.out.println("Added!");
		}
	}
	// Overload
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
			System.out.println("Orderlist is full! ");
			return;
		}
		else {
			this.addDigitalVideoDisc(dvd1);
			this.addDigitalVideoDisc(dvd2);
			System.out.println("Added!");
		}
	}
	
	public MyDate getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(MyDate dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	public void print() {
		System.out.println("***********************Order***********************");
		System.out.print("Date: ");
		System.out.println(this.getDateOrdered());

		System.out.println("Ordered Items:");
		int c = 1;
		for (int i = 0; i < qtyOrdered ;  i++){
			if(this.itemsOrdered[i]!=null) {
			System.out.println(c + ".DVD - " + this.itemsOrdered[i].getTitle() + " - "  + this.itemsOrdered[i].getDirector() + " - " + this.itemsOrdered[i].getLength() + ": " + this.itemsOrdered[i].getCost());
			c++;
			}
		}
		System.out.println("Total cost: " + this.totalCost());
		System.out.println("***************************************************");
	}
	
}
