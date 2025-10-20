package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
        for(int rad[] : matrise) {
            for(int kolonne : rad) {
                System.out.print(kolonne + " ");
            }
			System.out.println();
        }
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String svar = "";
		
		for (int[] rad : matrise) {
			for (int j = 0; j < rad.length; j++) {
				svar += rad[j];
				if (j < rad.length - 1) {
					svar += " ";
				}
			}
			svar += "\n";
		}
		return svar;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

        int[][] nyMatrise = new int[matrise.length][];

        for(int i = 0; i < matrise.length; i ++){

            nyMatrise[i] = new int[matrise[i].length];

            for(int j = 0; j < matrise[i].length; j++){

                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }
        return nyMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

        for(int i = 0; i < a.length; i++){
            if(a.length != b.length || a[i].length != b[i].length){
                return false;
            }
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] != b[i][j]){
                    return false;
                }
            }
        }
        return true;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		public static void skrivUt(int[][] matrise) {
		
        for(int rad[] : matrise) {
            for(int kolonne : rad) {
                System.out.print(kolonne + " ");
            }
			System.out.println();
        }
	}
	public static int[][] speile(int[][] matrise) {
		
		int rad = matrise.length;
		int kol = matrise[0].length;
		int[][] speil = new int[kol][rad];

		for (int i = 0; i < rad; i++) {
			for (int j = 0; j < kol; j++) {
				speil[j][i] = matrise[i][j];
			}
		}
		return speil;
	}
	public static void main(String[] args) {
		
		int[][] matrise = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
		skrivUt(speile(matrise));
	}
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
