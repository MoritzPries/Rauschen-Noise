import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Rauschmodul {
	
		Rauschmodul(){
			
		}
	

		public Nachricht verrausche(Nachricht nach,int i,double verhältnis) throws IOException {
		String fertigeNachricht = null;
		
		int wiederholungen = i;
		
		int laengeNachricht = nach.getText().length();
		
		int anzahlrauschen = nach.berechneVerhältnis(laengeNachricht, 40);
		
		
		ArrayList<Integer> positionen = new ArrayList<Integer>();
		
		int y = 0;
		
		System.out.println("Die Nachricht:     ");
		System.out.println(nach.getText());
		
	
		String nachricht = nach.getText();
		
			int x = 0;
			
			int pos;
		
			for (; x < anzahlrauschen ; x++)
				
			{
				
			pos = getRandomNumberInRange(0,laengeNachricht-1);
			
			
			if( positionen . contains(pos)) {
				
				x--;
				
			}
			else {
				positionen.add(pos);
			}
				
			
			}
		
			//System.out.println(positionen);
			
			
		
		
		for ( int in : positionen ) {
			
			String neuerText;
			
			
			char neu = 	(char) getRandomNumberInRange(0,127);
			
			//System.out.println(neu);
			
			char alt = nach.getText().charAt(in);
			
			String neuS = Character.toString(neu);
			String altS = Character.toString(alt);
			
			ArrayList<Character> text = new ArrayList<Character>();
			
			neuerText = nach.getText();
			
			//String ganzneu = ersetze(altS,neuS,neuerText);
			
			String ganzneu = nach.getText().replace((nach.getText().charAt(in)), neu);
			
			nach.setText(ganzneu);
			
			//System.out.println(ganzneu);
			
		}
		System.out.println("Die verrauschte Nachricht:     ");
		System.out.println(nach.getText());
		WriteFile inDatei = new WriteFile(nach.getText(),"ausgabe.txt");
		
		
		return nach;
		
		
		
	}

			public Nachricht entrausche(Nachricht nach,int i,double verhältnis) throws IOException {
				
				
				String fertigeNachricht = null;
				
				int wiederholungen = i;
				
				int laengeNachricht = nach.getText().length();
				
				int anzahlrauschen = nach.berechneVerhältnis(laengeNachricht, 40);
				
				
				ArrayList<Integer> positionen = new ArrayList<Integer>();
				
				int y = 0;
				
			
				String nachricht = nach.getText();
				
					int x = 0;
					
					int pos;
				
					for (; x < anzahlrauschen ; x++)
						
					{
						
					pos = getRandomNumberInRange(0,laengeNachricht-1);
					
					
					if( positionen . contains(pos)) {
						
						x--;
						
					}
					else {
						positionen.add(pos);
					}
						
					
					}
				
					//System.out.println(positionen);
					
					
				
				
				for ( int in : positionen ) {
					
					String neuerText;
					
					
					char neu = 	(char) getRandomNumberInRange(0,127);
					
					//System.out.println(neu);
					
					char alt = nach.getText().charAt(in);
					
					String neuS = Character.toString(neu);
					String altS = Character.toString(alt);
					
					ArrayList<Character> text = new ArrayList<Character>();
					
					neuerText = nach.getText();
					
					//String ganzneu = ersetze(altS,neuS,neuerText);
					
					String ganzneu = nach.getText().replace((nach.getText().charAt(in)), neu);
					
					nach.setText(ganzneu);
					
					
					
					
					
					
				}
				
				System.out.println("Eine mögliche entrauschte Nachricht:   ");
				System.out.println(nach.getText());
				
				
				WriteFile inDatei = new WriteFile(nach.getText(),"ausgabe.txt");
				
				
				return nach;
	
				}
			
			/**
			 * Methode zum generieren eines Integer in Range
			 * 
			 * @param min
			 * @param max
			 * @return
			 */

		    public  int getRandomNumberInRange(int min, int max) {

		        if (min >= max) {
		            throw new IllegalArgumentException("max must be greater than min");
		        }

		        Random r = new Random();
		        return r.nextInt((max - min) + 1) + min;
		    }
	
		    

		        public String ersetze(String suche, String ersatz, String str) {
		            int start = str.indexOf(suche);

		            while (start != -1) {
		                str = str.substring(0, start) + ersatz + str.substring(start + suche.length(), str.length());
		                start = str.indexOf(suche, start + ersatz.length());
		            }
		            return (str);
		        } 
		    
}
