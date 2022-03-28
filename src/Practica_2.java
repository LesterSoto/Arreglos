import java.util.Scanner;

/**
 * Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos leídos por el
 * teclado. Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo por la
 * pantalla.
 */
public class Practica_2 {
    String[] cadena1;
    String[] cadena2;

    Scanner leer;
    public Practica_2(){
        cadena1 = new String[5];
        cadena2 = new String[5];

        leer = new Scanner(System.in);

    }

    public void ejecutor(){

        for (int i = 0; i < cadena1.length; i++){
            System.out.println("Original ["+ i +"]: ");
            String repetidor = leer.nextLine();

            cadena1[i] = repetidor;
        }
        int indiceOriginal = 0;
        int indiceInvertido = 4;
        while (indiceOriginal < cadena1.length){
            cadena2[indiceInvertido] = cadena1[indiceOriginal];
            indiceOriginal++;
            indiceInvertido--;
        }
        for (int i = 0; i < cadena2.length; i++) {
            System.out.println("Vector Invertido: ["+ cadena2[i] +"]" );
        }

    }

}
