import java.util.ArrayList;

public class Rotacyjny{
	ArrayList<Proces> pom;
	ArrayList<Proces> pom2;
	int momentZ;
	int czasOcz;
	int srCzas;
	int srednia2;
	int kw;
	static int sred;
	static int liczbaCiagow;
	public static void a2(){
		System.out.println("Œredni czas oczekiwania procesów dla algorytmu FCFS to: " + sred/liczbaCiagow + " milisekund");
	}

	public Rotacyjny(CiagProcesow lista, int kw){
		this.kw = kw;
		try {
			pom = lista.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		while(pom.size() != 0){
		for(int i =0; i<pom.size(); i++){
			if(pom.get(i).dlFazy >=  kw){
				momentZ += kw;
				pom.get(i).dlFazy -= kw;
				pom.get(i).czasOcz -= kw;}
			else if(pom.get(i).dlFazy <kw & pom.get(i).dlFazy >0){
				momentZ += pom.get(i).dlFazy;
				pom.get(i).dlFazy = 0;
				pom.get(i).czasOcz += momentZ-pom.get(i).dlFazy;
				pom2.add(pom.get(i));
				pom.remove(i);
				}
			}
		}
	}

}
