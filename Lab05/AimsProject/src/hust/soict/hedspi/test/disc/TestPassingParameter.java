package hust.soict.hedspi.test.disc;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jugle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}

	public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
		String oldTitle = o1.getTitle();
		String oldCategory = o1.getCategory();
		String oldDirector = o1.getDirector();
		int oldLength = o1.getLength();
		float oldCost = o1.getCost();
		
		
		o1.setTitle(o2.getTitle());
		o2.setTitle(oldTitle);
		
		o1.setCategory(o2.getCategory());
		o2.setCategory(oldCategory);
		
		o1.setDirector(o2.getCategory());
		o2.setDirector(oldDirector);
		
		o1.setLength(o2.getLength());
		o2.setLength(oldLength);
		
		o1.setCost(o2.getCost());
		o2.setCost(oldCost);
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
