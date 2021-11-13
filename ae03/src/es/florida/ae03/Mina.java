package es.florida.ae03;

public class Mina {

	int stock;
	
	//M�todo: Mina
	//Descripci�n: Inicializamos mina
	//Parametros entrada: stock
	//Parametros salida: ninguno
	public Mina (int stock) {
		this.stock = stock;
	}

	//M�todo: getStock
	//Descripci�n: Nos devuelve stock
	//Parametros entrada: ninguno
	//Parametros salida: stock
	public int getStock() {
		return stock;
	}

	//M�todo: setStock
	//Descripci�n: Modificamos el stock
	//Parametros entrada: stock
	//Parametros salida: ninguno
	public void setStock(int stock) {
		this.stock = stock;
	}

}
