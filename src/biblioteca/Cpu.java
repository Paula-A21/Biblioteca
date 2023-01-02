package biblioteca;


public class Cpu extends Computadoras {
	
	
	
	public Cpu(String numeroDeSerie, String procesador, String velocidadDelProcesador, String memoria, String mhz) {
		super(numeroDeSerie, procesador, velocidadDelProcesador, memoria, mhz);
		
				Computadoras[] listaCpu = new Computadoras [15];
				
				listaCpu [1] = new Computadoras("C0001", "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
				listaCpu [2] = new Computadoras("C0002", "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
				listaCpu [3] = new Computadoras("C0003", "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
				listaCpu [4] = new Computadoras("C0004", "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
				listaCpu [5] = new Computadoras("C0005", "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
				listaCpu [6] = new Computadoras("C0006", "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
				listaCpu [7] = new Computadoras("C0007", "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
				listaCpu [8] = new Computadoras("C0008", "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
				listaCpu [9] = new Computadoras("C0009", "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
				listaCpu [10] = new Computadoras("C00010", "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
				listaCpu [11] = new Computadoras("C00011", "INTEL CORE I5 6400 QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 4 GB", "1600 MHZ");
				listaCpu [12] = new Computadoras("C00012", "INTEL CORE I7 6700K QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 16 GB", "1600 MHZ");
				listaCpu [13] = new Computadoras("C00013", "INTEL CORE I7 6700K QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 16 GB", "1600 MHZ");
				listaCpu [14] = new Computadoras("C00014", "INTEL CORE I7 6700K QUAD CORE S1151", "3.3 Ghz", "MEMORIA DDR3 16 GB", "1600 MHZ");
				listaCpu [15] = new Computadoras("C00015", "INTEL CORE I7 6700K QUAD CORE S1151", "3.7 Ghz", "MEMORIA DDR3 16 GB", "1600 MHZ");
	}

	
	public void dispositivosDeEntradaYSalida () {
		
		String [] pantalla = new String [15];
		String [] parlantes = new String [15];
		String [] teclado = new String [15];
		String [] mouse = new String [15];
		
		for (int i = 0; i < 15; i++) {
			
			pantalla [i] = new String ("Monitor Dell IPS 27 E2720H 1080 60hz");
			parlantes [i] = new String ("Parlante Genius SP-HF180");
			teclado [i] = new String ("Teclado Usb Multimedia Nisuta Ns-kb27u 104");
			mouse [i] = new String ("Mouse Genius DX-110 USB");
		}
		
	}

}
