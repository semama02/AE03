package es.florida.ae03;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	//Método: main
	//Descripción:Ejecutamos la aplicación
	//Parametros entrada: ninguno
	//Parametros salida: ninguno
	public static void main(String[] args) {
		String nombre;
        Scanner sc = new Scanner(System.in);
		
		int stock;
		
		int total = 0;
		
		System.out.println("Cuanto stock tienes ahora mismo?");
		
		stock = Integer.parseInt(sc.nextLine());
		
		System.out.println("Como quieres llamar al minero?");
		
		String nombre1 = sc.nextLine();
		
		Mina mina = new Mina(stock);
		
		ArrayList<Minero> mineros = new ArrayList<>();
		
		Minero op;
		
		for (int i = 0; i < 10; i++) {
			try {
				nombre = (nombre1 + " " + (i+1));
				op = new Minero(mina, nombre);
				mineros.add(op);
				Thread t = new Thread(op);
				t.setName("Nombre " + (i+1));
				t.start();
				
			}catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
			}	
		}

		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < mineros.size();i++) {
			total += mineros.get(i).getBolsa();
		}
		
		System.out.println("Suma total de las bolsas = " + total);
		System.out.println("Stock restante = " + mina.stock);
	}

}
