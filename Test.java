public class Test {
		public static void main(String[] args) {
			CiagProcesow a;
			FCFS b;
			SJF2 c;
			SRTF d;
		
			for(int i=0; i<20; i++){
			a = new CiagProcesow(20);
			
			b = new FCFS(a);
			c = new SJF2(a);
			d = new SRTF(a);
			System.out.println(b.srednia2);
			}
			FCFS.a2();
			SJF2.a2();
			SRTF.a2();
		}
}		
