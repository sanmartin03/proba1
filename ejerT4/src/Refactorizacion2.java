import java.util.Scanner;



//otro comentario que nos e va  aver
public class Refactorizacion2 {
	private static Scanner entrada;

	public static void main(String[] args) {
		 entrada = new Scanner(System.in);
		 int a[], b[], c[];
		 int tam = 10;
		a=new int[tam];
		 b=new int[tam];
		 // la tabla c tendr√° que tener el doble de tama√±o que a y b.
		 c = new int [2*tam];
		 // leemos la tabla a
		 System.out.println("Leyendo la tabla a");
		 iniciar_vector(a, tam);
		 // leemos la tabla b
		 System.out.println("Leyendo la tabla b");
		 iniciar_vector(b, tam);
		// asignaremos los elementos de la tabla c
		// para las tablas a y b utilizaremos como √ ndice i
		// y para la tabla c utilizaremos como √ ndice j.
		 unir_tablas(a, b, c, tam);
		 System.out.println("La tabla c queda: ");
		 mostrar_tabla(c, tam);
		}

	private static void mostrar_tabla(int[] c, int tam) {
		int j;
		for (j=0;j<(2*tam);j++){ // seguimos utilizando j, para la tabla c. Aunque se podr√ a utilizar i.
		 System.out.print(c[j]+" ");
		}
		 System.out.println(" ");
	}

	private static void unir_tablas(int[] a, int[] b, int[] c, int tam) {
		int i;
		int j;
		j=0;
		 for (i=0;i<tam;i++){
		 c[j]=a[i];
		 j++;
		 c[j]=b[i];
		 j++;
		 }
	}

	private static int iniciar_vector(int[] a, int tam) {
		int i;
		for (i=0;i<tam;i++){
		 System.out.print("n√∫mero: ");
		 a[i]=entrada.nextInt();
		 }
		return i;
	}
}
