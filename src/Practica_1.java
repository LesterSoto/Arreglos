/**
Ejercicio 1
Realizar un programa que defina un vector llamado “vector_numeros” de 10 enteros, a continuación lo
inicialice con valores aleatorios (del 1 al 10) y posteriormente muestre en pantalla cada elemento del
vector junto con su cuadrado y su cubo.
 */
public class Practica_1 {
    int[] vector_numeros = new int[10];
    public Practica_1() {

    }
    public void ejecutor(){
        for (int i = 0; i < vector_numeros.length; i++) {
            int aleatorio = (int) (Math.random() * 10 + 1);

            vector_numeros[i]=aleatorio;
        }

        for (int i = 0; i < vector_numeros.length; i++) {

            int numero = vector_numeros[i];
            int cuadrado = (int) Math.pow(numero , 2);
            int cubo = (int) Math.pow(numero, 3);
            System.out.println("Vector numero ["+i+"]: "+numero+ ", "+cuadrado+", "+cubo);
        }
    }
}
