package projekt_mpr;

public class C_stadion {
	
	private String nazwa;
	private String miasto;
	private int pojemnosc;
	
	
	public C_stadion ( String nazwa, String miasto , int pojemnosc){
		
		this.setNazwa(nazwa);
		this.setMiasto(miasto);
		this.setPojemnosc(pojemnosc);
		
	}

	public C_stadion(){
		
	}
	
	public void pokaz(){
		
		System.out.println(this.getNazwa()+" o pojemnoœci:"+this.getPojemnosc());
		
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

	public int getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(int pojemnosc) {
		this.pojemnosc = pojemnosc;
	}
	
}
