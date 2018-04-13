import java.util.ArrayList;
import java.util.Collections;

public class SJF {
	ArrayList<Proces> pom;
	int czasOcz;
	int momentZ;
	public SJF(CiagProcesow lista){
		try {
			pom = lista.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.sort(pom, Proces.Comparators.ComparatorDlFazy);	
		for ( int i = 0; i<pom.size(); i++){
			pom.get(i).momentZg = momentZ;
			pom.get(i).czasOcz = momentZ;
			momentZ += pom.get(i).dlFazy;
			this.czasOcz += pom.get(i).czasOcz;
		}
			System.out.println("Œredni czas oczekiwania procesów dla algorytmu SJF to: " + (long)czasOcz/pom.size() + " milisekund");
	}
	
}


