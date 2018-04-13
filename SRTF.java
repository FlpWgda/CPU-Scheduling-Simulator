import java.util.ArrayList;
import java.util.Collections;

public class SRTF {
		ArrayList<Proces> pom;
		ArrayList<Proces> pom2;
		ArrayList<Proces> pom3;
		int czasOcz;
		int momentZ;
		int sumaDlFaz;
		int srednia2;
		static int sred;
		static int liczbaCiagow=1;
		public static void a2(){
			System.out.println("Œredni czas oczekiwania procesów dla algorytmu SRTF to: " + sred/liczbaCiagow + " milisekund");
		}
		public SRTF(CiagProcesow lista){
			try {
				pom = lista.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int losowa =(int) (Math.random()*(0.2*pom.size()+1)+0.7*pom.size());
				pom2 = new ArrayList<Proces>(losowa);
				pom3 = new ArrayList<Proces>();
			for (int i=0; i<losowa;i++){
				pom2.add(pom.get(i));
		    }
			Collections.sort(pom2,Proces.Comparators.ComparatorDlFazy);
			for (int i =0; i<pom.size()-losowa; i++){
				pom3.add(pom.get(losowa+i));
				pom3.get(i).numer = (int)(Math.random()*(0.8*pom2.size()+1)+0.1*pom2.size());
			}
			a1();
			srednia2 = czasOcz/pom2.size();
			sred += srednia2;
			liczbaCiagow ++;
		}
		public void a1(){
			for (int i = 0; i<pom2.size();i++){
				int loso = (int)(Math.random()*(pom2.get(i).dlFazy-1)+1);
				for(int j =0; j<pom3.size(); j++){
					if(pom2.get(i).numer == pom3.get(j).numer){
						if(pom2.get(i).dlFazy-loso > pom3.get(j).dlFazy){
							this.czasOcz += 
							pom2.get(i).dlFazy -= loso;
							pom2.add(i+1, pom3.get(j));
							
						}
						else{pom2.add(i+1, pom3.get(j));}
						pom3.remove(j);
					}
				}
				pom2.get(i).momentZg = momentZ;
				pom2.get(i).czasOcz = momentZ;
				this.czasOcz += pom2.get(i).czasOcz;
				momentZ += pom2.get(i).dlFazy;
			}
		}
}
