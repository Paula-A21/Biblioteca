package biblioteca;

public class Computadoras {
	
	protected String numeroDeSerie;
	protected String procesador;
	protected String velocidadDelProcesador;
	protected String memoria;
	protected String mhz;
	
	public Computadoras(String numeroDeSerie, String procesador, String velocidadDelProcesador, String memoria,
			String mhz) {
		super();
		this.numeroDeSerie = numeroDeSerie;
		this.procesador = procesador;
		this.velocidadDelProcesador = velocidadDelProcesador;
		this.memoria = memoria;
		this.mhz = mhz;
	}
	
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getVelocidadDelProcesador() {
		return velocidadDelProcesador;
	}
	public void setVelocidadDelProcesador(String velocidadDelProcesador) {
		this.velocidadDelProcesador = velocidadDelProcesador;
	}
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}
	public String getMhz() {
		return mhz;
	}
	public void setMhz(String mhz) {
		this.mhz = mhz;
	}
	

}
