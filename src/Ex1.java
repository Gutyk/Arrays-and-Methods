import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alunos;

        System.out.println("Qual a quantidade de alunos: ");
        alunos = input.nextInt();
        if (alunos < 0 || alunos > 30) {
            System.out.println("O valor deve ser maior quer 0 e menor que 30...");
        } else {
            int[] rm = new int[alunos];
            double[] primeira_nota = new double[alunos];
            double[] segunda_nota = new double[alunos];
            double[] media = new double[alunos];
            String[] aprovado = new String[alunos];
            int[] rms_aprovados = new int[alunos];


            for (int i = 0; i < alunos; i++) {
                System.out.println("Digite o " + (i + 1) + " RM:");
                rm[i] = input.nextInt();
                if (rm[i] < 0) {
                    System.out.println("O Rm deve ser maior que 0...");
                } else {
                    System.out.println("Digite a primeira nota:");
                    primeira_nota[i] = input.nextDouble();
                    System.out.println("Digite a segunda nota:");
                    segunda_nota[i] = input.nextDouble();

                    media[i] = (primeira_nota[i] + segunda_nota[i]) / 2;

                    if (media[i] >= 6) {
                        aprovado[i] = "Aprovado";
                        rms_aprovados[i] = rm[i];
                    } else {
                        aprovado[i] = "Reprovado";
                    }
                    System.out.println("\tRM: " + rm[i]);
                    System.out.println("\tMédia: " + media[i]);
                    System.out.println("\tStatus: " + aprovado[i]);
                    System.out.println("----------------------------");
                }
            }
            System.out.print("\tAprovados: ");
            for (int i = 0; i < alunos; i++){
                if (rms_aprovados[i] > 0){
                    System.out.print(rms_aprovados[i] + " ");
                }
            }
        }
    }
}
