import java.util.ArrayList;

public class FCFS{
	ArrayList<Proces> pom;
	int momentZ;
	int czasOcz;
	int srCzas;
	int srednia2;
	static int sred;
	static int liczbaCiagow;
	public static void a2(){
		System.out.println("Œredni czas oczekiwania procesów dla algorytmu FCFS to: " + sred/liczbaCiagow + " milisekund");
	}
	
	public FCFS(CiagProcesow lista){
		try {
			pom = lista.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		for ( int i = 0; i<pom.size(); i++){
		pom.get(i).momentZg = momentZ;
		pom.get(i).czasOcz = momentZ;
		momentZ += pom.get(i).dlFazy;
		this.czasOcz += pom.get(i).czasOcz;
		}
		srednia2 = czasOcz/pom.size();
		sred += srednia2;
		liczbaCiagow ++;
	}
	
		
			
}
