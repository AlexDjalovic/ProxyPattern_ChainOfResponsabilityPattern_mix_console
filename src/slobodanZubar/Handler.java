package slobodanZubar;

public abstract class Handler implements zdravstvenazastita {

	Handler sledeci;
	protected boolean slobodan;
	public Handler(boolean slobodan){
		this.slobodan=slobodan;
	}
	public void setNext(Handler sledeci){
		this.sledeci=sledeci;
	}
	@Override
	public void provera() {

		System.out.println("imate pravo na lecenje o trosku fonda");
	}
	public String mojZubar(){
		String x="";
		if(slobodan==true){
			x="zubar koji vam stoji na raspolaganju je: "+konkretanZubar();
			return x;
		}
		if(sledeci!=null)
			x=sledeci.mojZubar();
		return x;
	}
public abstract String konkretanZubar();
}
