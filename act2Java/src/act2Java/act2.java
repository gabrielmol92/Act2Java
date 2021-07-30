package act2Java;

import java.util.Scanner;

public class act2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		String nombre = sc.next();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Ingrese su apellido");
		String apellido = sc2.next();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Ingrese su edad");
		int edad = sc3.nextInt();
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Ingrese un hobbie");
		String hobbie = sc4.next();
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Ingrese editor preferido");
		String editor = sc5.next();
		Scanner sc6 = new Scanner(System.in);
		System.out.println("Ingrese Sistema Operativo Utilizado");
		String so = sc6.next();
		sc.close();
		sc2.close();
		sc3.close();
		sc4.close();
		sc5.close();
		sc6.close();
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Edad: "+edad);
		System.out.println("Hobbie: "+hobbie);
		System.out.println("Editor: "+editor);
		System.out.println("SO: "+so);
	}

}
