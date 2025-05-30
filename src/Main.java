import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Animal> animal = new ArrayList<Animal>();

        while(true) {
            mostrarMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    adicionarAnimal(animal, scanner);
                    break;
                case 2:
                    buscarAnimal(animal, scanner);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }

    public static void mostrarMenu(){
        System.out.println("Menu do Zoologico:");
        System.out.println("[1] Adicionar Animal");
        System.out.println("[2] Procurar Animal");
        System.out.println("[3] Procurar especie de animais");
        System.out.println("[4] Abitate dos Animais");
        System.out.println("[5] Sair");
    }

    public static void adicionarAnimal(List<Animal> animal, Scanner scanner) {
        System.out.println("Digite o nome do animal:");
        String nome = scanner.nextLine();

        System.out.println("Digite Tipo do animal:");
        String tipo = scanner.nextLine();

        System.out.println("Digite a especie do animal:");
        String especie = scanner.nextLine();

        Animal novoAnimal = new Animal(nome,tipo,especie);
        animal.add(novoAnimal);

        System.out.println("Animal adicionado com sucesso!");
    }

    public static void buscarAnimal(List<Animal> animais, Scanner scanner) {
        System.out.println("Digite o nome do animal :");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;

        for (Animal animal : animais) {
            if (animal.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Animal encontrado:");
                System.out.println(animal);
                System.out.println("-------------------------");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum animal com esse nome foi encontrado.");
        }
    }
}
