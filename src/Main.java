import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroMax = 10;
        String[] lojas = new String[numeroMax];

        int lojaCadastrata = 0;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("============ Menu Lojas ==============");
            System.out.println("1. Cadastrar Lojas");
            System.out.println("2. Listar Lojas");
            System.out.println("3. Excluir todas as Lojas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        if (lojaCadastrata < numeroMax) {
                            System.out.print("Digite o nome da loja: ");
                            String nomeLoja = scanner.nextLine();
                            lojas[lojaCadastrata] = nomeLoja;
                            lojaCadastrata++;
                            System.out.println("Loja cadastrada com sucesso.");
                        } else {
                            System.out.println("Lista cheia! Não é possível cadastrar novas lojas.");
                        }
                        break;

                    case 2:
                        if (lojaCadastrata == 0) {
                            System.out.println("Nenhuma loja cadastrada.");
                        } else {
                            System.out.println("============ Lista de Lojas ==============");
                            for (int i = 0; i < lojaCadastrata; i++) {
                                System.out.println("Nome da loja: " + lojas[i]);
                            }
                        }
                        break;

                    case 3:
                        for (int i = 0; i < lojas.length; i++) {
                            lojas[i] = null;
                        }
                        lojaCadastrata = 0;
                        System.out.println("Lojas excluídas com sucesso!");
                        break;

                    case 4:
                        System.out.println("Fechando o programa... Até breve :)");
                        break;

                    default:
                        System.out.println("Essa opção não é válida!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número válido!");
            }
        }

        scanner.close();
    }
}
