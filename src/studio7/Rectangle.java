package studio7;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle() {
		length = 0.0;
		width = 0.0;
	}
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	/**
	 * hey whats good. this returns the area of a rect
	 * @return area of rec
	 * thanks
	 */
	public double getArea() {
		return length * width;
	}
	/**
	 * hey
	 * @return rim of tangle
	 * bye
	 */
	public double getRim() {
		return ((2 * length) + (2 * width));
	}
	/**
	 * if you have a rectangle you can see if its a square or like no
	 * @return if its a square of nah
	 */
	public boolean isSquare() {
		if(length ==width) {
			return true;
		}
		return false;
	}
	/**
	 * hey
	 * @param other is the rectangle you're comparing it to 
	 * @return true if the original is smaller
	 * but size doesn't matter
	 */
	public boolean isSmaller(Rectangle other) {
		if(other.getArea() < this.getArea()) {
			return false;
		}
		return true;
	}
	

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(5.0 , 5.0);
		Rectangle r2 = new Rectangle(123.4, 456.7);
		System.out.println(r1.isSmaller(r2));
		//System.out.println(r2.getRim());
		

	}

}
