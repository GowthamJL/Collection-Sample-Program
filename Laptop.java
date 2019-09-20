import java.util.Comparator;

public class Laptop{// implements Comparable<Laptop> {

	//@Override
	//public int compareTo(Laptop o) {
		/*if(this.getGp()>o.getGp())
			return 1;
		else
		return -1;
	}*/
	private String brand;
	private int ram;
	private int gp;
	
	public Laptop(String brand, int ram, int gp) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.gp = gp;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getGp() {
		return gp;
	}
	public void setGp(int gp) {
		this.gp = gp;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", gp=" + gp + "]";
	}
	
}