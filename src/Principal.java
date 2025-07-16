import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cofrinho cofrinho = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Moeda");
            System.out.println("2. Remover Moeda");
            System.out.println("3. Listar Moedas");
            System.out.println("4. Calcular Total em Reais");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
//criando menu para listar as opções //
            switch (opcao) {
 //botao do primeiro caso que é a escolha da moeda//
                case 1:
                    System.out.println("Escolha a moeda a adicionar:");
                    System.out.println("1. Dólar");
                    System.out.println("2. Euro");
                    System.out.println("3. Real");
                    int tipoMoeda = scanner.nextInt();

                    System.out.print("Digite o valor da moeda: ");
                    double valorMoeda = scanner.nextDouble();

                    switch (tipoMoeda) {
                        case 1:
                            cofrinho.adicionarMoeda(new Dolar(valorMoeda));
                            break;
                        case 2:
                            cofrinho.adicionarMoeda(new Euro(valorMoeda));
                            break;
                        case 3:
                            cofrinho.adicionarMoeda(new Real(valorMoeda));
                            break;
                        default:
                            System.out.println("Moeda inválida.");
                    }
                    break;

                case 2:
                    System.out.println("Funcionalidade de remoção não implementada completamente.");
                    // Aqui seria necessário permitir a remoção de uma moeda específica com base na lista.
                    break;

                case 3:
                    cofrinho.listarMoedas();
                    break;

                case 4:
                    System.out.printf("Total no cofrinho em Reais: R$ %.2f\n", cofrinho.calcularTotalEmReais());
                    break;

                case 5:
                    System.out.println("Encerrando o sistema.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
