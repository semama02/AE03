package es.florida.ae03;

public class Mina {

	int stock;
	
	//Método: Mina
	//Descripción: Inicializamos mina
	//Parametros entrada: stock
	//Parametros salida: ninguno
	public Mina (int stock) {
		this.stock = stock;
	}

	//Método: getStock
	//Descripción: Nos devuelve stock
	//Parametros entrada: ninguno
	//Parametros salida: stock
	public int getStock() {
		return stock;
	}

	//Método: setStock
	//Descripción: Modificamos el stock
	//Parametros entrada: stock
	//Parametros salida: ninguno
	public void setStock(int stock) {
		this.stock = stock;
	}

}
