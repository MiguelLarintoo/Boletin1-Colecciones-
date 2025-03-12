package main.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {

	public static void main(String[] args) {
		String frase = "Pues ná, que me dijo no ni ná";
        System.out.println(palabrasDuplicadas(frase)); 
	}
	
	public static Set<String> palabrasDuplicadas(String str) {
        Map<String, Integer> frecuenciaPalabras = contarFrecuenciaPalabras(str);
        Set<String> palabrasRepetidas = new HashSet<>();

        for (String palabra : frecuenciaPalabras.keySet()) {
            int frecuencia = frecuenciaPalabras.get(palabra); 
            if (frecuencia > 1) {
                palabrasRepetidas.add(palabra);
            }
        }

        return palabrasRepetidas;
    }
	
	
	public static Map<String, Integer> contarFrecuenciaPalabras(String str) {
		 Map<String, Integer> frecuenciaPalabras = new HashMap<>();
	        if (str != null && !str.isEmpty()) {
	            String[] palabras = str.toLowerCase().split("\\s+|[,;:.!?]+");
	            for (String palabra : palabras) {
	                frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
	            }
	        }
	        return frecuenciaPalabras;
	    }
}