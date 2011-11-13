package projekt_mpr;

import java.util.Calendar;



public class C_mecz {

	private Calendar datarozegrania;
	private C_druzyna Gosc;
	private C_druzyna Gospodarz;
	private 
	
	

	public C_mecz(Calendar datarozegrania){
		
		this.setDatarozegrania(datarozegrania);
		C_bramka b=new C_bramka();
		
	}
	
	public C_mecz(){
		
		C_druzyna Gosc=new C_druzyna();
		C_druzyna Gospodarz=new C_druzyna();
		
	}

	public Calendar getDatarozegrania() {
		return datarozegrania;
	}

	public void setDatarozegrania(Calendar datarozegrania) {
		this.datarozegrania = datarozegrania;
	}

	public C_druzyna getGosc() {
		return Gosc;
	}

	public void setGosc(C_druzyna gosc) {
		Gosc = gosc;
	}

	public C_druzyna getGospodarz() {
		return Gospodarz;
	}

	public void setGospodarz(C_druzyna gospodarz) {
		Gospodarz = gospodarz;
	}
	
	
	
}
