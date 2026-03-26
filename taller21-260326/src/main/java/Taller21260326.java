import java.util.Scanner;

public class Taller21260326 {
    public static void main(String[] args) {
        System.out.println("Ingrese un valor");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        
        ListaSimple lista = new ListaSimple();

        
        for (int i = 0; i < n - 1; i++) {
            int valor = sc.nextInt();
            lista.insertar(valor);
        }
    }       

    }