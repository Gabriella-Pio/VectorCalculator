
import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Vetor {
    //atributos do vetor
    public double x;
    public double y;
    public double z;

    //constructor - três dimensões
    public Vetor(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //constructor
    public Vetor() {}

    //inserir vetor
    public void inserirVetor(ArrayList<Vetor> vetores, Scanner scanner)  {
        String continuar = "sim";
        do {
            Util.coordenadas(vetores, scanner);
            continuar = Util.loop(scanner, "Deseja adicionar outro vetor? (S/N): ");
            continuar = scanner.nextLine();
        } while(continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s"));
    }

    //listar vetores
    public static void listarVetores(ArrayList<Vetor> vetores) {
        for (int i = 0; i < vetores.size(); i++) {
            System.out.println("Vetor " + (i + 1) + ": (" + vetores.get(i).x + ", " + vetores.get(i).y + ", " + vetores.get(i).z + ")");
        }
        System.out.println("");
    }

    //selecionar vetor
    public static ArrayList<Vetor> selecionarVetor(ArrayList<Vetor> vetores, Scanner scanner) {
        ArrayList<Vetor> selecionados = new ArrayList<Vetor>();
        
            System.out.print("Digite o número do vetor para selecioná-lo: ");
            int v1 = scanner.nextInt();
            selecionados.add(vetores.get(v1));
            

        return selecionados;
    }

    //método para calcular o módulo
    public double modulo() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    //método para calcular o produto escalar
}