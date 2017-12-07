package slobodanZubar;

public class proxySestra implements zdravstvenazastita {

	Pacijent p;
	Handler h;
	public proxySestra(Pacijent p,Handler h){
		this.p=p;
		this.h=h;
	}
	@Override
	public void provera() {
		// TODO Auto-generated method stub

		if(p.getIznosOsiguranja()>20000){
			
			h.provera();
		}else{
			System.out.println("nemate pravo na lecenje o trosku fonda, platite iz svog dzepa");
		}
	}

}
