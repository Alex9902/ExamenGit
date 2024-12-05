import java.util.Scanner;

public class ExamenGit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int opcion;
            do {
                System.out.println("[1] Concatenar dos palabras");
                System.out.println("[2] Visualizar el número de palabras de una frase");
                System.out.println("[3] Contar cuántas veces aparece una letra en una frase:");
                System.out.println("[4] Salir");
                opcion = sc.nextInt();
                switch (opcion) {

                    case 1:

                    case 2:
                        System.out.print("Ingrese una frase: ");
                        String frase = sc.nextLine();
                        String[] palabras = frase.trim().split("\\s+");
                        int numeroDePalabras = palabras.length;

                    case 3:

                    case 4:

                    case 5:

                    default:
                }
            }while (opcion!=4);
        }
    }



