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

                    case 3:
                        System.out.print("Ingrese una frase: ");
                        String frase = sc.nextLine();
                        System.out.print("Ingrese la letra que desea contar: ");
                        char letra = sc.next().charAt(0);
                        int contador = 0;
                    case 4:

                    default:
                }
            }while (opcion!=4);
        }
    }



