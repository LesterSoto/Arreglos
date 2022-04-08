import java.util.Scanner;
/**
 * Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas
 * entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha
 * sacado y la menor.
 */
public class Practica_3 {
    int[] notas;
    Scanner leer;
    public Practica_3() {
        notas = new int[5];
        leer = new Scanner(System.in);

    }
    public void ejecutador(){
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas ["+i+"]: ");
            int nota = leer.nextInt();

            notas[i]= nota;
        }
        int suma=0;
        int promedio;
        int maximo=10;
        int minimo=0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas ["+i+"]: "+ notas[i]);

            suma=suma+notas[i];

            if (notas[i]<minimo){
                minimo = notas[i];
            }
            if (notas[i]>maximo){
                maximo=notas[i];
            }
        }
        promedio = suma/ notas.length;
        System.out.println("Promedio:  "+promedio);
        System.out.println("Minino: "+minimo);
        System.out.println("Maximo: "+maximo);
    }
}
