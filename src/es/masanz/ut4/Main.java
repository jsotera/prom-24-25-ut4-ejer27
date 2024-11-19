package es.masanz.ut4;

import es.masanz.ut4.model.Persona;
import es.masanz.ut4.util.ColoresConsola;

public class Main {
    public static void main(String[] args) {

        String palabra = "COMUNION";
        String estadoAhorcado = "_O____O_";
        String letra = "N";
        System.out.println(estadoAhorcado);
        System.out.println("Letra introducida: "+letra);
        boolean estaLaLetra = false;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            String letraAux = c + "";
            if(letraAux.equals(letra)){
                estaLaLetra = true;
                String estadoAux = estadoAhorcado.substring(0,i);
                estadoAux = estadoAux + letra;
                estadoAux = estadoAux + estadoAhorcado.substring(i+1);
                estadoAhorcado = estadoAux;
            }
        }
        System.out.println(estadoAhorcado);

    }
}