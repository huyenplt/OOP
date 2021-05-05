
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	//Xay dung cac phuong thuc khoi tao cho lop
	//Constructor 
	public DigitalVideoDisc() {
		this.title = "noname";
		this.category = "unknow";
		this.director = "unknow";
		this.length = 0;
		this.cost = 0.0f;
	}
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	
	
	
}
