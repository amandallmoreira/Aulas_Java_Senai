package Atividades.Atividade5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

class Tarefa{
    private String descricao;
    private LocalDate prazo;

    public Tarefa(String descricao, LocalDate prazo){
        this.descricao = descricao;
        this.prazo = prazo;
    }

    public String getDescricao(){
        return descricao;
    }
    public LocalDate getPrazo(){
        return prazo;
    }
    @Override
    public String toString(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return descricao + "(prazo: " + prazo.format(formato) + ")";
    }
}

public class ListaTarefas {
    static ArrayList<Tarefa> tarefas = new ArrayList<>();
    static ArrayList<Tarefa> tarefasConcluidas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do{
            exibirMenu();
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao){
                case 1 -> adicionarTarefa();
                case 2 -> listarTarefa();
                case 3 -> ordenarAlfabeticamente();
                case 4 -> removerTarefaEspecifica();
                case 5 -> removerFIFO();
                case 6 -> removerLIFO();
                case 7 -> removerFEFO();
                case 8 -> concluirTarefa();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");

            }
        }while (opcao != 0);

    }
    static void exibirMenu() {
        System.out.println("\n=== MENU DE TAREFAS ===");
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Listar tarefas");
        System.out.println("3. Ordenar tarefas (alfabética)");
        System.out.println("4. Remover tarefa específica");
        System.out.println("5. Remover tarefa (FIFO)");
        System.out.println("6. Remover tarefa (LIFO)");
        System.out.println("7. Remover tarefa (FEFO)");
        System.out.println("8. Concluir tarefa");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    // Adiciona uma nova tarefa pedindo descrição e prazo
    static void adicionarTarefa() {
        System.out.print("Descrição da tarefa: ");
        String descricao = scanner.nextLine();

        System.out.print("Prazo (dd/MM/yyyy): ");
        String dataTexto = scanner.nextLine();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate prazo = LocalDate.parse(dataTexto, formato);

        tarefas.add(new Tarefa(descricao, prazo));
        System.out.println("Tarefa adicionada!");
    }

    static void listarTarefa() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa registrada.");
            return;
        }
        System.out.println("Total de tarefas registadas: " + tarefas.size());
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));
        }
    }
    // Ordena a lista pela descrição, em ordem alfabética
    static void ordenarAlfabeticamente() {
        Collections.sort(tarefas, Comparator.comparing(Tarefa::getDescricao));
        System.out.println("Tarefas ordenadas alfabeticamente!");
        listarTarefa();
    }
    // Remove uma tarefa específica pelo texto da descrição
    static void removerTarefaEspecifica() {
        System.out.print("Digite a descrição exata da tarefa a remover: ");
        String descricao = scanner.nextLine();

        Tarefa encontrada = null;
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equals(descricao)) {
                encontrada = t;
                break;
            }
        }

        if (encontrada != null) {
            tarefas.remove(encontrada);
            System.out.println("Tarefa removida!");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }
    // FIFO: remove a primeira tarefa que foi adicionada (posição 0)
    static void removerFIFO() {
        if (tarefas.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }
        Tarefa removida = tarefas.remove(0);
        System.out.println("Removida (FIFO): " + removida);
    }

    // LIFO: remove a última tarefa adicionada
    static void removerLIFO() {
        if (tarefas.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }
        Tarefa removida = tarefas.remove(tarefas.size() - 1);
        System.out.println("Removida (LIFO): " + removida);
    }
    // FEFO: remove a tarefa com o prazo mais próximo (a que "vence" primeiro)
    static void removerFEFO() {
        if (tarefas.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        Tarefa maisProxima = tarefas.get(0);
        for (Tarefa t : tarefas) {
            if (t.getPrazo().isBefore(maisProxima.getPrazo())) {
                maisProxima = t;
            }
        }

        tarefas.remove(maisProxima);
        System.out.println("Removida (FEFO): " + maisProxima);
    }

    // Opcional: move uma tarefa da lista de pendentes para a de concluídas
    static void concluirTarefa() {
        System.out.print("Digite a descrição da tarefa concluída: ");
        String descricao = scanner.nextLine();

        Tarefa encontrada = null;
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equals(descricao)) {
                encontrada = t;
                break;
            }
        }

        if (encontrada != null) {
            tarefas.remove(encontrada);
            tarefasConcluidas.add(encontrada);
            System.out.println("Tarefa marcada como concluída!");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

}
