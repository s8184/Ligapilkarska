package projekt_mpr;

public class C_bramka {
	
	private int czas_zdobycia;
	private E_sposob_zdob sposob_zdobycia;
	private E_okolicznosc_zdobycia okolicznosc_zdobycia;
	private E_zdobywca_bramki zdobywca;
	private C_zawodnik z;
	
	
	public C_bramka (int czas_zdobycia,E_sposob_zdob sposob_zdobycia, E_okolicznosc_zdobycia okolicznosc_zdobycia, E_zdobywca_bramki zdobywca, C_zawodnik z){
		
		this.z=new C_zawodnik();
		this.setZ(z);
		this.setCzas_zdobycia(czas_zdobycia);
		this.setOkolicznosc_zdobycia(okolicznosc_zdobycia);
		this.setSposob_zdobycia(sposob_zdobycia);
	}
	
	public C_bramka(){
	
		C_zawodnik z=new C_zawodnik();
		
	}

	public int getCzas_zdobycia() {
		return czas_zdobycia;
	}

	public void setCzas_zdobycia(int czas_zdobycia) {
		this.czas_zdobycia = czas_zdobycia;
	}

	public C_zawodnik getZ() {
		return z;
	}

	public void setZ(C_zawodnik z) {
		this.z = z;
	}

	public E_zdobywca_bramki getZdobywca() {
		return zdobywca;
	}

	public void setZdobywca(E_zdobywca_bramki zdobywca) {
		this.zdobywca = zdobywca;
	}

	public E_okolicznosc_zdobycia getOkolicznosc_zdobycia() {
		return okolicznosc_zdobycia;
	}

	public void setOkolicznosc_zdobycia(E_okolicznosc_zdobycia okolicznosc_zdobycia) {
		this.okolicznosc_zdobycia = okolicznosc_zdobycia;
	}

	public E_sposob_zdob getSposob_zdobycia() {
		return sposob_zdobycia;
	}

	public void setSposob_zdobycia(E_sposob_zdob sposob_zdobycia) {
		this.sposob_zdobycia = sposob_zdobycia;
	}

	public void info(){
		String dr="";
		if (this.getZdobywca()==E_zdobywca_bramki.Gosc)
			dr="goœci";
		else
			dr="gospodarzy";
		System.out.println("Zdobyto bramkê dla "+dr+"! Zawodnik=");
		this.getZ().pokaz();
	}
}

