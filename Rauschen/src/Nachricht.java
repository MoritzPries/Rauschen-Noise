
public class Nachricht {

	private String text;
	
	private int anzahlWiederholungen;
	
	public Nachricht(String n) {
		
		this.text = n ;
		
	}
	
	
	
	public void setText(String text) {
		this.text = text;
	}



	public int berechneVerh�ltnis(int laenge, double rauschstaerke) {
		
		int verh�ltnis = 0;
		
		verh�ltnis =  (int)( laenge * rauschstaerke ) / 100;
		
		return verh�ltnis;
		
	}
	
	public String getText() {
		return text;
	}



	public void schreibeInDatei(String s) {
		
		
		
	}
	
}
