package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Ejercicio4 {

	public static void main(String[] args) {

	}
	
	public static Collection cadenaOrdenadaSinSortYConRepetidos(Collection lista) {
		List<Integer> cadena = new ArrayList<>(lista);
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

}
