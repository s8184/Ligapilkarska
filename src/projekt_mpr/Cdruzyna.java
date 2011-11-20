package projekt_mpr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cdruzyna {
	private String nazwa;
	private String miasto;
	private Map<Integer, Czawodnik> zawodnicy;
	private Cstadion stadion;
	
	
// ******************************* konstruktory ************************************************	
	
	public Cdruzyna (){
		this.zawodnicy = new HashMap<Integer,Czawodnik>();
		this.stadion = new Cstadion();
		
	}
	
	
// ******************************* metody   ************************	
	
	
	public void usunWszystkichZawodnikow() {
		this.zawodnicy.clear();
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
	
	public Cstadion getStadion() {
		return stadion;
	}

	public void setStadion(Cstadion stadion) {
		this.stadion = stadion;
	}

	public void dodajZawodnika(Integer nr , Czawodnik z) {
		this.zawodnicy.put(nr, z);
	}
	
	public void usunZawodnika(Integer nr) {
		this.zawodnicy.remove(nr);
		System.out.println("Usuniêto zawodnika "+nr);
	}



	public String pokaz (){
		String out="";
		
		out="Druzyna sklada sie z "+this.zawodnicy.size()+" zawodników.\n\n";
		out+="Lista zawodników dru¿yny "+this.getNazwa()+" z "+this.getMiasto()+":\n";
		if (zawodnicy.size()==0) out += "Brak zawodników! \n\n";
		else 
		
		for (Map.Entry<Integer, Czawodnik> z: zawodnicy.entrySet()){
			out+="Numer: "+z.getKey()+"\n";
			out+="Zawodnik: "+z.getValue().pokaz()+"\n\n";
		}
		if (this.getStadion().getPojemnosc()==0)
			System.out.println(" Nie przypisano stadionu!!! \n\n");
		else
		out+="Stadionem dru¿yny jest:"+this.getStadion().pokaz();
		return out;
		}
	
	
	
	
	



	
}
