import java.util.Scanner;

public class Ordenar {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        System.out.print("Dime un par de palabras separadas por espacios: ");
        String palabras = sc.nextLine().trim(); //Palabras por teclado sin los espacios del principio y final
        String palabra1 = ""; //Primera palabra
        String palabra2 = ""; //Segunda palabara

        //Se guarda la primera palabra sin ningun espacio desde la posicion 0
        palabra1 = palabras.substring(0, palabras.indexOf(" "));

        //Se guarda la segunda palabra partiendo desde la primera y luego quitando los espacios
        palabra2 = palabras.substring(palabras.indexOf(" "), palabras.length()).trim();


        //Si la palabra1 devuelve valor 0 o mayor con el metodo compareTo las cambiamos el orden
        if (palabra1.compareToIgnoreCase(palabra2)>= 0) {
            System.out.print(palabra2 + " ");
            System.out.print(palabra1);
            

        //Si devuelve menor que 0 las dejamos igual
        } else {
            System.out.print(palabra1 + " ");

            System.out.print(palabra2);
        }
    }
}