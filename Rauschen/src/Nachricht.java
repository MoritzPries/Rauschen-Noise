
public class Nachricht {

	private String text;
	
	private int anzahlWiederholungen;
	
	public Nachricht(String n) {
		
		this.text = n ;
		
	}
	
	
	
	public void setText(String text) {
		this.text = text;
	}



	public int berechneVerhältnis(int laenge, double rauschstaerke) {
		
		int verhältnis = 0;
		
		verhältnis =  (int)( laenge * rauschstaerke ) / 100;
		
		return verhältnis;
		
	}
	
	public String getText() {
		return text;
	}



	public void schreibeInDatei(String s) {
		
		
		
	}
	
}
