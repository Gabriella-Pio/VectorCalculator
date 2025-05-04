
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vetor> vetores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //menu inicial
        Menu menu = new Menu();
        int operacao;

        do {
            operacao = menu.inicial(scanner);

            switch (operacao) {
                case 1: //inserir novo vetor
                Vetor vetor = new Vetor();                    
                vetor.inserirVetor(vetores, scanner);
                    break;
                case 2: //listar vetores
                    Vetor.listarVetores(vetores);
                    break;
                case 3: //selecionar e fazer operações
                String continuar3 = "sim";
                do {
                    Vetor.listarVetores(vetores);
                    ArrayList<Vetor> vetoresSelecionados = Vetor.selecionarVetor(vetores, scanner);
                    System.out.println("Deseja selecionar outro vetor? (S/N)");
                    continuar3 = scanner.nextLine();
                } while (continuar3.equalsIgnoreCase("sim") || continuar3.equalsIgnoreCase("s"));
                break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (operacao != 4);
    }
}
/*String continuar2 = "sim";
                do {
                System.out.println("Deseja realizar outra operação?");continuar2 = scanner.nextLine();} while (continuar2.equalsIgnoreCase("sim") || continuar2.equalsIgnoreCase("s")); */

/*String continuar4 = "sim";
                    while (continuar3.equalsIgnoreCase("sim") || continuar3.equalsIgnoreCase("s")) {
                        Menu menuOperacoes = new Menu();
                        menuOperacoes.operacoes(scanner);
                        System.out.println("Deseja realizar outra operação?");
                        continuar4 = scanner.nextLine();
                    } */