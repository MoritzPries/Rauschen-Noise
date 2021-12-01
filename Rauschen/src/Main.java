import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Nachricht nachricht1 = new Nachricht("Hallo Deutschland"
				+ "");
		
		Rauschmodul rauscher  = new Rauschmodul();
		
		
		

		
		
		
		
		int wiederholungen = 6; 
		
		int i = 0;
		
		
		
	rauscher.verrausche(nachricht1, wiederholungen, nachricht1.berechneVerhältnis(nachricht1.getText().length(), 40));
		
	rauscher.entrausche(nachricht1, nachricht1.getText().length(),40);
		
		
		
	}

}
