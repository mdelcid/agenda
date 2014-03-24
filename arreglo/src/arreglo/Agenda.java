package arreglo;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner mi_s = new Scanner(System.in);
		int agenda[]=new int [5];

		System.out.println("Ingrese un numero : ");
		agenda[0]= mi_s.nextInt();
		System.out.println("Ingrese un numero : ");
		agenda[1]= mi_s.nextInt();
		System.out.println("Ingrese un numero : ");
		agenda[2]= mi_s.nextInt();
		System.out.println("Ingrese un numero : ");
		agenda[3]= mi_s.nextInt();
		System.out.println("Ingrese un numero : ");
		agenda[4]= mi_s.nextInt();


		System.out.println("Agenda: ");

		System.out.println(agenda[0]);
		System.out.println(agenda[1]);
		System.out.println(agenda[2]);
		System.out.println(agenda[3]);
		System.out.println(agenda[4]);


	}

}
