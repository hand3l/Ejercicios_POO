
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String nombre;
//        double edad;
//        System.out.println("Ingrese su nombre y su edad:"); //sout
//        nombre = sc.nextLine();
//        edad = sc.nextDouble();
//
//        System.out.println(nombre + " " + edad);
//
//
//        System.out.printf("Ejercicios en clase\n");
//
//        System.out.printf("Ejercicio 1: Conteo de n a m con un incremento de i\n");
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Ingrese el valor de n: ");
//        int n = scanner.nextInt();
//
//        System.out.print("Ingrese el valor de m: ");
//        int m = scanner.nextInt();
//
//        System.out.print("Ingrese el incremento i: ");
//        int i = scanner.nextInt();
//
//        for (int j = n; j <= m; j += i) {
//            System.out.println(j);
//        }
//        scanner.close();
//        //cambios de mejora en el codigo
//        System.out.println("Hola a clase de Programacion Orientada a Objetos ");
//        ///cambios de mejora en el codigo
//        System.out.println("Hola a clase de Programacion Orientada a Objetos ");
//        System.out.println("te quiero xD");

        //CLASE3
        //CREACION DE OBJETO
        OPERACIONES operaciones = new OPERACIONES();
        operaciones.setN1(20.0);
        operaciones.setN2(2.0);

        operaciones.imprimirDatos();

        System.out.println("Sumatoria: " + operaciones.sumatoria());
        operaciones.sumaeimpresion();

        System.out.println("La raiz: ");
        operaciones.raiz();

        System.out.println("Resta: " + operaciones.resta());
        operaciones.restaeimpresion();
    }
}

