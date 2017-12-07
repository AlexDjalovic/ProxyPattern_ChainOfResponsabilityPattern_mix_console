package slobodanZubar;

public class Pacijent {

	private String ime;
	private double iznosOsiguranja;
	Handler h;
	public Pacijent(String ime, double iznosOsiguranja) {
		super();
		this.ime = ime;
		this.iznosOsiguranja = iznosOsiguranja;
	}
	public Pacijent(Handler h){
		this.h=h;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public double getIznosOsiguranja() {
		return iznosOsiguranja;
	}
	public void setIznosOsiguranja(double iznosOsiguranja) {
		this.iznosOsiguranja = iznosOsiguranja;
	}
	
	public String toString(){
		return ime;
	}
	public String mojZubar(){
		return h.mojZubar();
	}
}
