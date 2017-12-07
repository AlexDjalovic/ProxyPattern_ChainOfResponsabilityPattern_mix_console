package slobodanZubar;

public class test {

	public static void main(String[] args) {
		//MORAJU SE OVERLOADOVATI KONSTRUKTORI KLASE PACIJENT!!!!!!!!!!!

		Pacijent p1;
		p1=new Pacijent("aca",23000);//prvi konstruktor koji je bitan za proxy
		aljosa al=new aljosa(true);
		Sebastijan s=new Sebastijan(true);
		al.setNext(s);
		
		proxySestra ps=new proxySestra(p1,al);
		ps.provera();
		p1=new Pacijent(al);//drugi konstruktor koji je bitan za chain of responsability
		//ovde je pacijent u ulozi klijenta
		System.out.println(p1.mojZubar());
	}

}
