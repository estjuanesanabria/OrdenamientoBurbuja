import java.util.Scanner;

public class Taller21260326 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese n:");
        int n = sc.nextInt();

        Lista lista = new Lista();

        System.out.println("Ingrese los " + (n - 1) + " valores con un espacio entre cada valor:");

        for (int i = 0; i < n - 1; i++) {
            int valor = sc.nextInt();
            lista.insertar(valor);
        }

        System.out.println("Lista:");
        lista.mostrar();

        int sumaLista = lista.sumar();
        int sumaTotal = n * (n + 1) / 2;

        int faltante = sumaTotal - sumaLista;

        System.out.println("Faltante: " + faltante);
    }
}