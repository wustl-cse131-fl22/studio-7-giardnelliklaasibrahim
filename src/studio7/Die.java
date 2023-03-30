package studio7;

public class Die {
	private int n;

	public Die() {
		
	}

	public Die(int n) {
		this.n = n;
	}
	
	public int getSide() {
		return (int)(Math.random()*n)+1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<5; i++) {
		
			Die L = new Die(10);
			System.out.println(L.getSide());
		
		}

	}

}
