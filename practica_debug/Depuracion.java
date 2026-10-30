import java.util.Scanner;
public static void main(String[] args) {

        int numero1;
        int numero2;
        int suma;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta el primer numero: ");
        numero1 = teclado.nextInt();

        System.out.println("Inserta el primer numero: ");
        numero2 = teclado.nextInt();

        suma = sumar(numero1, numero2);

        System.out.println("La suma es: " + suma);

 
 
        teclado.close();
}

public static int sumar(int a, int b) {
    return a + b; // Devuelve el resultado
}