package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Ejercicio3 {
	/*
	 * 	Crea una clase java que almacene una colección de números ordenados
		crecientemente. Esta clase agregará un valor numérico en cada ocasión y lo
		posicionará de forma ordenada en la posición que le corresponda sin hacer uso del
		método sort, pudiendo existir valores repetidos.

	 * */
	public static void main(String[] args) {
		System.out.println(cadenaOrdenadaSinSortYConRepetidos(listaAleatoriaDe30ConRepetidos()));
		List<String> cadena = new ArrayList<>();
		cadena.add("A");
		cadena.add("C");
		cadena.add("B");
		cadena.add("E");
		cadena.add("D");
		System.out.println(cadena);
	}
	public static Collection cadenaOrdenadaSinSortYConRepetidos(Collection lista) {
		List<Object> cadena = new ArrayList<>(lista);
		boolean ordenado;
		 do {
		        ordenado = true;
		        for (int i = 1; i < cadena.size(); i++) {
		            if (cadena.get(i - 1) > cadena.get(i)) {
		                int temp = cadena.get(i - 1);
		                cadena.set(i - 1, cadena.get(i));
		                cadena.set(i, temp);
		                ordenado = false;
		            }
		        }
		    } while (!ordenado);
		
		return cadena;
	}
	
	public static List listaAleatoriaDe30ConRepetidos () {
		List<Integer> lista = new ArrayList<>();
		Random numerosAleatorios = new Random();
		while (lista.size()< 30) {
			lista.add(numerosAleatorios.nextInt(100));				
		}	 
		return lista;

	}
	

}
