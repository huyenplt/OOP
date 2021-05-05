
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10; //Khai bao hang
	private int qtyOrdered;
	private DigitalVideoDisc itemsOrdered[] = new
		   DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.print("Đã đạt số lượng max. Không thể thêm");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered ++;
			System.out.println("Đã thêm vào giỏ hàng!");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc dics) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i] == dics) {
				for (int j =i; j< qtyOrdered -1 ; j++) {
					itemsOrdered[j] = itemsOrdered[j+1];
				}
				qtyOrdered--;
			}
		}
	}
	public float totalCost() {
		float totalCost = 0.0f;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}
}
