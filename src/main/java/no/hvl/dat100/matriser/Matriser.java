package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int j=0; j<matrise.length; j++) {
			for(int i=0; i<matrise[j].length; i++){
				System.out.print(matrise[j][i]);
			}
			System.out.println(" ");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String s="";
		for(int j=0; j<matrise.length; j++) {
			for(int i=0; i<matrise[j].length; i++){
				String b=String.valueOf(matrise[j][i]);
				s=s+b+" ";
			}
			s=s+"\n";
		}
		return s;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) { 
		int skalertMatrise[][] = new int[matrise.length][matrise[0].length];
		for(int j=0; j<matrise.length; j++) {
			for(int i=0; i<matrise[j].length; i++) {
				skalertMatrise[j][i]=matrise[j][i]*tall;
			}
		}
		return skalertMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length) {
            return false;  // If row count differs
        }
		for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) {
                return false; 
            }
		}
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]!=b[i][j]) {
					return false;
				}
			}
		}
	
		return true;	
	}
				
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
