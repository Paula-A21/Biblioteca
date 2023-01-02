package biblioteca;


public class Notebook extends Computadoras {
	
	private String [] marca;
	
	public Notebook(String numeroDeSerie, String procesador, String velocidadDelProcesador, String memoria,
			String mhz, String[] marca) {
		super(numeroDeSerie, procesador, velocidadDelProcesador, memoria, mhz);
		
		Computadoras[] listaNotebook = new Computadoras [5];
		
		listaNotebook [1] = new Computadoras ("C00016", "INTEL CORE I3 6300 HQ", "3.7 Ghz", "MEMORIA DDR4 8 GB", "2400 MHZ");
		listaNotebook [2] = new Computadoras("C00017", "INTEL CORE I3 6300 HQ", "3.7 Ghz", "MEMORIA DDR4 8 GB", "2400 MHZ");
		listaNotebook [3] = new Computadoras("C00018", "INTEL CORE I3 6300 HQ", "3.7 Ghz", "MEMORIA DDR4 8 GB", "2400 MHZ");
		listaNotebook [4] = new Computadoras("C00019", "INTEL CORE I3 6300 HQ", "3.7 Ghz", "MEMORIA DDR4 8 GB", "2400 MHZ");
		listaNotebook [5] = new Computadoras("C00020", "INTEL CORE I3 6300 HQ", "3.7 Ghz", "MEMORIA DDR4 8 GB", "2400 MHZ");
	
		for (int i = 0; i > 5; i++) {
			
			marca [i] = new String ("HP"); 
			
			System.out.println(marca);
			
		}
		
	}

	
	public void tamanio () {
		
		char tamanio [] = {'G', 'P', 'M'};
		
		System.out.println("El tamaño de la Notebook es: " + tamanio [1]);
		System.out.println("El tamaño de la Notebook es: " + tamanio [2]);
		System.out.println("El tamaño de la Notebook es: " + tamanio [3]);
	}


	public String[] getMarca() {
		return marca;
	}


	public void setMarca(String[] marca) {
		this.marca = marca;
	}
	
	
	
}
