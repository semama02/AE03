package es.florida.ae03;


public class Minero implements Runnable{

	String nombre;
	Mina mina;
	int bolsa;
	int tiempoExtraccion = 10;
	
	//Método: getBolsa
	//Descripción: Devolvemos objeto bolsa
	//Parametros entrada: ninguno
	//Parametros salida: objeto bolsa
	public int getBolsa() {
		return this.bolsa;
	}

	//Método: setBolsa
	//Descripción: Modificamos objeto bolsa
	//Parametros entrada: int bolsa
	//Parametros salida: ninguno
	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	//Método: Minero
	//Descripción: Creamos constructor minero
	//Parametros entrada: Mina, nombre
	//Parametros salida: ninguno
	public Minero(Mina mina, String nombre){
		this.bolsa = 0;
		this.mina = mina;
		this.nombre=nombre;
	}
	
	//Método: extraerRecurso
	//Descripción: Mientras haya stock restamos y añadimos a la bolsa, haciendo una parada
	//Parametros entrada: ninguno
	//Parametros salida: ninguno
	public void extraerRecurso() {
		try {
			synchronized (this){
				while(mina.stock > 0) {
					mina.stock -= 1;
					bolsa ++;
					Thread.sleep(tiempoExtraccion);
					System.out.println(nombre + " Ha metido oro en la bolsa");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}					
	}

	//Método: run
	//Descripción: Ejecutamos extraerRecurso
	//Parametros entrada: ninguno
	//Parametros salida: ninguno
	@Override
	public void run() {
		// TODO Auto-generated method stub
		extraerRecurso();
	}

}
