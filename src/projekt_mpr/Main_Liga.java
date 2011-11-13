package projekt_mpr;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.Date;

public class Main_Liga {

	public static void main(String[] args) {
	// ****************** deklarujemy i tworzymy obiekty klasy Calendar które bêd¹ parametrami konstruktora ojektu klasy C_zawodnik ****	
	
	Calendar c1 = new GregorianCalendar();
	Calendar c2 = new GregorianCalendar();
	c1.set(1974, Calendar.APRIL, 15);
	c2.set(1999, Calendar.MAY, 29);
	
	//************************ tworzymy obiekt klasy C_zawodnik ***************************************************************	
	C_zawodnik z1 = new C_zawodnik("Wojciech","Damer", c1 , c2 );
	
	Calendar c3 = new GregorianCalendar();
	Calendar c4 = new GregorianCalendar();
	c3.set(1984,Calendar.MAY,16);
	c4.set(2001,Calendar.DECEMBER,29);
	
	C_zawodnik z2 = new C_zawodnik("Andrzej","Lisowski", c3 , c4 );
	
	Calendar c5 = new GregorianCalendar();
	Calendar c6 = new GregorianCalendar();
	c5.set(1979,Calendar.JANUARY,7);
	c6.set(2011,Calendar.JULY,15);
	
	C_zawodnik z3 = new C_zawodnik("Joanna","Damer", c5 , c6 );
	
	//**************** tworzymy dru¿ynê - obiekt klasy C_dru¿yna ***************************************************
	C_druzyna d1 = new C_druzyna();
	
	d1.setMiasto("Gdañsk");   // nadajemy wartoœci jej sk³adowym
	d1.setNazwa("Lechia");
	//**************** wywo³ujemy na obiekcie naszej klasy metode poka¿ ********************************************
	d1.pokaz();
	
	// *************** do dru¿yny dodajemy wczeœniej utworzonych zawodników ****************************************
	d1.dodajZawodnika(z1);
	d1.dodajZawodnika(z2);
	d1.pokaz();
	d1.usunZawodnika(z1);
	d1.pokaz();
	C_stadion s1 = new C_stadion("Œledziarnia","Gdañsk",50000);
	d1.setStadion(s1);
	d1.pokaz();
	/*
	C_druzyna d2 = new C_druzyna();
	d2.setNazwa("Damry");
	d2.setMiasto("Rumunii");
	d2.dodajZawodnika(z1);
	d2.dodajZawodnika(z3);
	C_stadion s2 = new C_stadion("Damerowo","Rumia",2);
	d2.setStadion(s2);
	d2.pokaz2();*/
	}

}
