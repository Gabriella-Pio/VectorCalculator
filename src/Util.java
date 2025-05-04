
import java.util.ArrayList;
import java.util.Scanner;

public class Util {

    //método para capturar respostas do usuário
    public static String getInput(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    //método de loop
    public static String loop(Scanner scanner, String message) {
        String continuar;
        do {
            continuar = getInput(scanner, message);
        } while (continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s"));
        return continuar;
    }

    public static void coordenadas(ArrayList<Vetor> vetores, Scanner scanner) {
            System.out.println("Insira as coordenadas do vetor: ");
            System.out.print("x: ");
            double x = scanner.nextDouble();
            System.out.print("y: ");
            double y = scanner.nextDouble();
            System.out.print("z: ");
            double z = scanner.nextDouble();

            Vetor v = new Vetor(x, y, z);
            vetores.add(v);

            System.out.println("Vetor adicionado com sucesso!");
    }
}
