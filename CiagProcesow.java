import java.util.ArrayList;

public class CiagProcesow implements Cloneable{	
		ArrayList<Proces> ciagProcesow;
		int czasOcz = 0;
		int momentZ = 0;
		public CiagProcesow(int p){
			ciagProcesow = new ArrayList<Proces>(p);
			for(int i = 0; i<p; i++ ){
			ciagProcesow.add(new Proces(i, (int) (Math.random() * 100 + 3), momentZ, czasOcz));
			}
		}	
		public Proces getObj(int i){
			return ciagProcesow.get(i);
		}
		public ArrayList<Proces> clone() throws CloneNotSupportedException {
			ArrayList<Proces> pom = new ArrayList<Proces>(ciagProcesow.size());
			for (Proces item : ciagProcesow) pom.add((Proces) item.clone());
	        return pom;
	    }
		
}
