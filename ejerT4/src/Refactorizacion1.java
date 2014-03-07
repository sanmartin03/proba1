import java.util.Scanner;

public class Refactorizacion1 {
private static Scanner entrada;

public static void main(String[] args) {
entrada = new Scanner(System.in);
bucle_cuadrados();
}

private static void bucle_cuadrados() {
	int num;
	System.out.print("Introduzca número: ");
	num=entrada.nextInt();
	
	while(num>=0){ // repetimos el proceso mientras el número le� do no sea negativo
	cuadrado(num);
	num=entrada.nextInt();
	
	}
}

private static void cuadrado(int num) {
	int cuadrado;
	cuadrado=num*num;
	System.out.println(num+ " es igual a "+ cuadrado);
	System.out.print("Introduzca otro número: ");
}
}