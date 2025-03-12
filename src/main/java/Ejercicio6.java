package main.java;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio6 {

	public static void main(String[] args) {

	}

	public static Map<String, Integer> contarFrecuenciaPalabras(String str) {
		Map<String, Integer> frecuenciaPalabras = new HashMap<>();
		if (!(str == null || str.isEmpty())) {
			String[] palabras = str.toLowerCase().split("\\s+");
			for (String palabra : palabras) {
				frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
			}
		}
		return frecuenciaPalabras;
	}
}