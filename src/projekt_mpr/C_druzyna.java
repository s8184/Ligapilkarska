package projekt_mpr;

import java.util.ArrayList;

public class C_druzyna {
	private String nazwa;
	private String miasto;
	private ArrayList<C_zawodnik> lista_zawodnikow;
	private C_stadion stadion;
	
	public C_druzyna (){
		this.lista_zawodnikow = new ArrayList<C_zawodnik>();
		this.stadion = new C_stadion();
	}
	
	public void usunWszystkichZawodnikow() {
		this.lista_zawodnikow.clear();
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}	
	
	public void pokaz (){
		System.out.println("Druzyna sklada sie z "+this.lista_zawodnikow.size()+".");
		System.out.println("Lista zawodników dru¿yny "+this.getNazwa()+" z "+this.getMiasto()+":");
		for(C_zawodnik z: this.lista_zawodnikow) {
			z.pokaz();
		System.out.println("Stadionem dru¿yny jest:");
		this.stadion.pokaz();
		}
	}
	public void pokaz2(){
		
		System.out.println("Cz³onkami podstawowej komórki spo³ecznej sa"+this.getNazwa()+" z "+this.getMiasto()+":");
		for(C_zawodnik z: this.lista_zawodnikow) {
			z.pokaz();
		System.out.println("Siedzib¹ rodziny jest:");
		this.stadion.pokaz();
		}
	}
	
	public ArrayList<C_zawodnik> getListaZawodnikow() {
		return this.lista_zawodnikow;
	}

	public void setListaZawodnikow(ArrayList<C_zawodnik> z) {
		this.lista_zawodnikow = z;
	}

	public C_stadion getStadion() {
		return stadion;
	}

	public void setStadion(C_stadion stadion) {
		this.stadion = stadion;
	}

	public void dodajZawodnika(C_zawodnik z) {
		this.lista_zawodnikow.add(z);
	}
	
	public void usunZawodnika(C_zawodnik z) {
		this.lista_zawodnikow.remove((Object)z);
	}
	
}
