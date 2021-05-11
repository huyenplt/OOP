
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private int qtyOrdered;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
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
}
