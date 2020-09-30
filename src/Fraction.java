
public class Fraction {
	private int numerateur;
    private int denominateur;
	
    public Fraction(int n,int d){
        this.setNumerateur(n);
        this.setDenominateur(d);
    }
    
    public int getDenominateur() {
		return denominateur;
	}
	public void setDenominateur(int denominateur) {
		if (denominateur == 0) {
			System.out.print("Impossible");
			throw new ArithmeticException("denominator is zero");
		}
		this.denominateur = denominateur;
	}
	public int getNumerateur() {
		return numerateur;
	}
	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}
	
	@Override
    public String toString(){
        return getNumerateur()+"/"+getDenominateur();
    }
    
}
