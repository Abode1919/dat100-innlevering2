package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for(int i = 0; i < tabell.length; i++) {
			System.out.print( i+" " );
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String resultat = "[";

		for (int i = 0; i < tabell.length; i++) {
			resultat += tabell[i];

			if (i < tabell.length - 1) {
				resultat += ",";

			}
		}

		resultat += "]";

		return resultat;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
	
		// Iterer gjennom alle elementene i tabellen og legg dem til summen
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
	
		// Returner den totale summen
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return true; // Returner true hvis tallet finnes
			}
		}
		return false; // Returner false hvis tallet ikke finnes
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i; // Returner indeksen til det første forekomsten
			}
		}
		return -1; // Returner -1 hvis tallet ikke finnes
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] nyTabell = new int[tabell.length]; // Ny tabell med samme lengde
		for (int i = 0; i < tabell.length; i++) {
			nyTabell[i] = tabell[tabell.length - 1 - i]; // Sett inn elementene i motsatt rekkefølge
		}
		return nyTabell; // Returner den nye reverserte tabellen
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i - 1]) {
				return false; // Returner false hvis et element er mindre enn det forrige
			}
		}
		return true; // Returner true hvis tabellen er sortert
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nyTabell = new int[tabell1.length + tabell2.length]; // Ny tabell med summen av lengdene
		int index = 0;
	
		// Legg til elementene fra tabell1
		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[index++] = tabell1[i];
		}
	
		// Legg til elementene fra tabell2
		for (int i = 0; i < tabell2.length; i++) {
			nyTabell[index++] = tabell2[i];
		}
	
		return nyTabell; // Returner den sammensatte tabellen
	}
}
