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
                        System.out.print("Ingrese la primera palabra: ");
                        String palabra1 = sc.nextLine();
                        System.out.print("Ingrese la segunda palabra: ");
                        String palabra2 = sc.nextLine();
                        String resultado = palabra1 + palabra2;
                        System.out.println("La concatenación de las palabras es: " + resultado);

                    case 2:
                        System.out.print("Ingrese una frase: ");
                        String frase = sc.nextLine();
                        String[] palabras = frase.trim().split("\\s+");
                        int numeroDePalabras = palabras.length;
                        System.out.println("La frase contiene " + numeroDePalabras + " palabras.");
                        break;
                    case 3:
                        System.out.print("Ingrese una frase: ");
                        String frase = sc.nextLine();
                        System.out.print("Ingrese la letra que desea contar: ");
                        char letra = sc.next().charAt(0);
                        int contador = 0;
                        for (int i = 0; i < frase.length(); i++) {
                            if (frase.charAt(i) == letra) {
                                contador++;
                            }
                        }
                        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
                    case 4:

                    default:
                }
            }while (opcion!=4);
        }
    }



