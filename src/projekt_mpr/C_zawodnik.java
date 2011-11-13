package projekt_mpr;

import java.util.Calendar;


public class C_zawodnik {

//***************** lista zmiennych klasy ****************************************	
	
	private String Imie;
	private String Nazwisko;
	private Calendar DataUrodzenia;
	private Calendar DataPozyskania;

//****************** konstruktor niesparametryzowany *******************************	
	
		public C_zawodnik(){
			
		
		}
		
// ***************** konstruktor sparametryzowany ************************************		
		
		public C_zawodnik(String Imie, String Nazwisko, Calendar DataUrodzenia, Calendar DataPozyskania){
			
			this.setImie(Imie);
			this.setNazwisko(Nazwisko);
			this.setDataUrodzenia(DataUrodzenia);
			this.setDataPozyskania(DataPozyskania);
			
		}
//*********************** Get i Set dla Imiê **********************************************************
		public String getImie() {
			return Imie;
		}

		public void setImie(String imie) {
			Imie = imie;
		}
//***********************Get i Set dla Nazwisko ***********************************************************
		public String getNazwisko() {
			return Nazwisko;
		}

		public void setNazwisko(String nazwisko) {
			Nazwisko = nazwisko;
		}
//*********************** Get i Set dla Data urodzenia***********************************************************		
		public Calendar getDataUrodzenia() {
			return DataUrodzenia;
		}

		public void setDataUrodzenia(Calendar dataUrodzenia) {
			DataUrodzenia = dataUrodzenia;
		}
//*********************** Get i Set dla Data pozyskania ************************************************************
		public Calendar getDataPozyskania() {		
			return DataPozyskania;
		}

		public void setDataPozyskania(Calendar dataPozyskania) {
			DataPozyskania = dataPozyskania;
		}
//************************** Metoda wyœwietlaj¹ca dane obiektu zawodnik *********************************************************		
		public void pokaz(){
			String d1,d2;
			Calendar c1,c2;
			
			c1 = this.getDataUrodzenia();
			c2 = this.getDataPozyskania();
			d1 = c1.get(Calendar.YEAR)+"/"+(c1.get(Calendar.MONTH)+1)+"/"+c1.get(Calendar.DAY_OF_MONTH);
			d2 = c2.get(Calendar.YEAR)+"/"+(c2.get(Calendar.MONTH)+1)+"/"+c2.get(Calendar.DAY_OF_MONTH);
			
			System.out.println(this.getImie()+" "+this.getNazwisko()+" "+d1+" "+d2);

		}

		

}
