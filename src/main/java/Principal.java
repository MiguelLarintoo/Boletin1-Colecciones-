package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
			System.out.println(listaAleatoriaDe30SinRepetidosLista());
			/*
			System.out.println(ListaASC());
			System.out.println(ListaDESC());
			*/
		}
		
	
	
	public static Set listaAleatoriaDe30SinRepetidos () {
		Set<Integer> lista = new HashSet<>();
		Random numerosAleatorios = new Random();
		while (lista.size()< 30) {
				lista.add(numerosAleatorios.nextInt(100));				
		
		}	 
		return lista;

	}
	
	
	public static List listaAleatoriaDe30SinRepetidosLista () {
		List<Integer> lista = new ArrayList<>();
		Random numerosAleatorios = new Random();
		while (lista.size()< 30) {
			if(!(lista.contains(numerosAleatorios.nextInt(100))))
				lista.add(numerosAleatorios.nextInt(100));				
		
		}	 
		return lista;

	}
	
	public static List ListaASC() {
		Set<Integer> lista = listaAleatoriaDe30SinRepetidos();
		List<Integer> listaAsc = new ArrayList<>(lista);
		Collections.sort(listaAsc);
		return listaAsc;
	}
	
	public static List ListaDESC() {
		 Set<Integer> conjunto = listaAleatoriaDe30SinRepetidos();
	     List<Integer> listaDesc = new ArrayList<>(conjunto); 
	     listaDesc.sort(Collections.reverseOrder());
	     return listaDesc;
	}
	
	
	
}
