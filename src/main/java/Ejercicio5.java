package main.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 *	Elabora una función que reciba una colección de elementos que puede contener
	repetidos y devuelva otra donde no existan duplicidades
 * */
public class Ejercicio5 {
	public static void main(String[] args) {
		List<String> cadena = new ArrayList<>();
		cadena.add("A");
		cadena.add("B");
		cadena.add("B");
		cadena.add("E");
		cadena.add("D");
		
		System.out.println(quitarDuplicadoEnUnaColecion(cadena));
	}
	public static Collection quitarDuplicadoEnUnaColecion(Collection lista) {
		Set<Object> listaVacia = new HashSet<>();
		List<Object> lista1 = new ArrayList<>(lista);
		for (int i = 0; i < lista.size(); i++) {
			if(!(listaVacia.contains(lista1.get(i)))) {
				listaVacia.add(lista1.get(i));
			}
		}
		
		return listaVacia;
		
	}
}
