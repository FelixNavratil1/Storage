package test;

import java.util.Scanner;

public class Sekundy {
	public static void main(String[] args) {

		String[]  coChceUserVedet = {"a", "b", "c"};
		
		System.out.println("napiste co chcete vedet: ");
		System.out.println("A) promile (napiste A):");
		System.out.println("B) mnozstvi potrebneho alkoholu na to aby jste meli nejake promile (napiste B): ");
		System.out.println("C) jestli vite proceFnta i mnozstvi ale chcete vedet kolik toho alkoholu mate vypit(napiste C}");
		Scanner scannerCoChceVedet = new Scanner(System.in);
		String coChceVedet = scannerCoChceVedet.next();
		
		System.out.println("vase vaha(v cislech):");
		Scanner scannerVaha = new Scanner(System.in);
		int vaha = scannerVaha.nextInt();
		// zde se vaha ulozi to int "vaha"
		
		if(coChceVedet.equals(coChceUserVedet[0])){
			
			System.out.println("Vlozte procenta alkoholu ktery chcete pit: ");
			Scanner scanner = new Scanner(System.in);
			int procenta = scanner.nextInt();
			// veci za scanneru se ulozi do intu "hledany napoj"

			System.out.println("kolik ml chcete vypit danneho akloholu: ");
			Scanner scannerMnozstvi = new Scanner(System.in);
			int mnozstvi = scannerMnozstvi.nextInt()/100;
			// toto zjisti kolik ml chce user vypit

			//System.out.println("vase vaha(v cislech):");
			//Scanner scannerVaha = new Scanner(System.in);
			//int vaha = scannerVaha.nextInt();
			// zde se vaha ulozi to int "vaha"

			System.out.println("vase pohlavi napiste muz nebo zena");
			Scanner scannerPohlavi = new Scanner(System.in);
			String pohlavi = scannerPohlavi.next();
			// zde se pohlavi ulozi
			String[] stringPohlavi = { "muz", "zena" };

			if (pohlavi.startsWith(stringPohlavi[0])) {
				double konstMuz = 100 / 58;
				
					int prvniCastRovniceM = procenta*mnozstvi;
					double druhaCastRovniceM = vaha*konstMuz;
					double promile3 = prvniCastRovniceM/druhaCastRovniceM;
					System.out.println(promile3);
				 }
			
			if (pohlavi.startsWith(stringPohlavi[1])) {
				double konstZen = 100 / 49;
				
				int prvniCastRovniceZ = procenta*mnozstvi;
				double druhaCastRovniceZ = vaha*konstZen;
				
				double promile3 = prvniCastRovniceZ/druhaCastRovniceZ;
				System.out.println(promile3);				
				
			}
			
		}
		
		
		
		if(coChceVedet.equals(coChceUserVedet[1])) {
			
			System.out.println("Vlozte procenta alkoholu ktery chcete pit: ");
			Scanner scanner = new Scanner(System.in);
			int procenta = scanner.nextInt();
			// veci za scanneru se ulozi do intu "hledany napoj"
			
			System.out.println("kolik chcete mit promili");
			Scanner scannerPromile = new Scanner(System.in);
			int promile = scanner.nextInt();
			//zde user vlozi kolik chce mit promili a ulozi se to do intu promile
			
			//System.out.println("vase vaha(v cislech):");
			//Scanner scannerVaha = new Scanner(System.in);
			//int vaha = scannerVaha.nextInt();
			// zde se vaha ulozi to int "vaha"
			
			System.out.println("vase pohlavi napiste muz nebo zena");
			Scanner scannerPohlavi = new Scanner(System.in);
			String pohlavi = scannerPohlavi.next();
			// zde se pohlavi ulozi
			String[] stringPohlavi = { "muz", "zena" };
			
			if(pohlavi.startsWith(stringPohlavi[0])){
				double konstMuz = 100 / 58;
				double prvniCastRovniceM = vaha*konstMuz;
				double druhaCasRovnice = promile*prvniCastRovniceM;
				double dl = druhaCasRovnice/procenta;
				double l = dl/10;
				
				System.out.print(l);
				System.out.print(" litru");
			}
			
			if(pohlavi.startsWith(stringPohlavi[1])) {
				double konstZen = 100 / 49;
				double prvniCastRovniceM = vaha*konstZen;
				double druhaCasRovnice = promile*prvniCastRovniceM;
				double dl = druhaCasRovnice/procenta;
				double l = dl/10;
				
				System.out.print(l);
				System.out.print(" litru");
			}
			
		}
		
		
		
		if(coChceVedet.equals(coChceUserVedet[2])) {
			
			System.out.println("kolik ml chcete vypit danneho akloholu: ");
			Scanner scannerMnozstvi = new Scanner(System.in);
			int mnozstvi = scannerMnozstvi.nextInt()/100;
			// toto zjisti kolik ml chce user vypit
			
			//System.out.println("vase vaha(v cislech):");
			//Scanner scannerVaha = new Scanner(System.in);  
			//int vaha = scannerVaha.nextInt();
			// zde se vaha ulozi to int "vaha"
			
			System.out.println("kolik chcete mit promili");
			Scanner scannerPromile = new Scanner(System.in);
			double promile = scannerPromile.nextDouble();
			//zde user vlozi kolik chce mit promili a ulozi se to do intu promile	
			
			System.out.println("vase pohlavi napiste muz nebo zena");
			Scanner scannerPohlavi = new Scanner(System.in);
			String pohlavi = scannerPohlavi.next();
			// zde se pohlavi ulozi
			String[] stringPohlavi = { "muz", "zena" };
			
			if (pohlavi.startsWith(stringPohlavi[0])) {
				double konstMuz = 100 / 58;
				
				double konstKratVaha = konstMuz*vaha;
				double PromileKratKonstKratVaha = konstKratVaha*promile;
				double procenta2 = PromileKratKonstKratVaha/mnozstvi;
				System.out.print(procenta2);
				System.out.print(" procent");
				
			}
			if (pohlavi.startsWith(stringPohlavi[1])) {
				double konstZen = 100 / 49;
				
				double konstKratVaha = konstZen*vaha;
				double PromileKratKonstKratVaha = konstKratVaha*promile;
				double procenta2 = PromileKratKonstKratVaha/mnozstvi;
				System.out.print(procenta2);
				System.out.print(" procent");
			}	
		}
	}
}
