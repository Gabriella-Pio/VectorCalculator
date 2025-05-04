
import java.util.Scanner;

public class Menu {

    public int inicial(Scanner scanner) {
        System.out.println("--- MENU INICIAL ---");
        System.out.println("1. Inserir novo(s) vetor(es)");
        System.out.println("2. Listar vetor(es)");
        System.out.println("3. Selecionar vetor(es)");
        System.out.println("4. Sair");

        System.out.print("Insira o número da operação: ");
        return scanner.nextInt();
    }

    public int operacoes(Scanner scanner) {
        System.out.println("--- MENU DE OPERAÇÕES ---");
        System.out.println("1. Calcular Módulo");
        System.out.println("2. Calcular Produto Escalar");
        System.out.println("3. Verificar Ortogonalidade");
        System.out.println("4. Calcular Ângulo entre Vetores");
        System.out.println("5. Calcular Produto Vetorial");
        System.out.println("6. Voltar");

        System.out.print("Insira o número da operação: ");
        return scanner.nextInt();
    }
}
