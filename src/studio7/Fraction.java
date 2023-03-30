package studio7;

public class Fraction {

	private int num;
	private int denom;
	
	public Fraction() {}
	public Fraction(int num, int denom) {
		this.num = num;
		this.denom = denom;
	}
	
	public Fraction addFraction(Fraction other) {
		return new Fraction ((this.num* other.denom) + (other.num*this.denom) , (other.denom * this.denom));
	}
	
	public String toString() {
		return num + "/" + denom;
	}
	
public static void main(String[] args) {
		
		Fraction r1 = new Fraction(1 , 4);
		Fraction r2 = new Fraction(5, 6);
		System.out.println(r1.addFraction(r2));
		//System.out.println(r2.getRim());
		

	}
}
