import java.util.Comparator;

public class Proces implements Cloneable {
		int numer;
		int dlFazy;
		int momentZg;
		int czasOcz;
		public Proces(int numer, int dlFazy, int momentZg, int czasOcz){
			this.numer = numer;
			this.dlFazy = dlFazy;
			this.momentZg = momentZg;
			this.czasOcz = czasOcz;
		}
		public String toString(){
			return  String.format("Proces nr: %d, d³ugoœæ fazy procesora: %d, moment zg³oszenia: %d, czas oczekiwania: %d" , numer,dlFazy,momentZg, czasOcz);
		}
		public Object clone()throws CloneNotSupportedException {
	        return super.clone();
		}
		public static class Comparators {
	        public static Comparator<Proces> ComparatorDlFazy = new Comparator<Proces>() {
	            public int compare(Proces o1, Proces o2) {
	                return o1.dlFazy - o2.dlFazy;}
	        };
		}
}
	     
