import java.util.Scanner;

public class menus {
    Scanner sc = new Scanner(System.in);

    int menuPrincipal() {
        int escolha = 0;

        do {
            System.out.println("===================");
            System.out.println(" 1. Formandos ");
            System.out.println(" 2. Gestão Escolar");
            System.out.println(" 9. Sair");
            System.out.println("===================");
            System.out.println("===================");
            System.out.println("Escolha uma opção:");
            escolha = sc.nextInt();
        } while (escolha != 1 && escolha != 2 && escolha != 9);
        return escolha;
    }

    int menuFormandos(String tipo) {
        int escolha = 0;
        do {
            System.out.println("===================");
            System.out.println(" 1. Inserir Formando");
            System.out.println(" 2. Modificar Formando");
            System.out.println(" 3. Eliminar Formando");
            System.out.println(" 4. Listar Formandos");
            System.out.println();
            System.out.println("9. Voltar");
            System.out.println("===================");
            System.out.println("===================");
            System.out.println("Escolha uma opção: ");
            escolha = sc.nextInt();
        } while (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 9);
        return escolha;
    }

    int menuGestaoEscolar(String tipo) {
        int escolha = 0;
        do {
            System.out.println("===================");
            System.out.println(" 1. Disciplinas");
            System.out.println(" 2. Cursos");
            System.out.println(" 3. Inscrições");
            System.out.println();
            System.out.println("9. Voltar");
            System.out.println("===================");
            System.out.println("===================");
            System.out.println("Escolha uma opção: ");
            escolha = sc.nextInt();
        } while (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 9);
        return escolha;
    }

    int menuDisciplinas(String tipo) {
        int escolha = 0;
        do {
            System.out.println("===================");
            System.out.println(" 1. Inserir Disciplina");
            System.out.println(" 2. Modificar Disciplina");
            System.out.println(" 3. Eliminar Disciplina");
            System.out.println(" 4. Listar Disciplinas");
            System.out.println();
            System.out.println("9. Voltar");
            System.out.println("===================");
            System.out.println("===================");
            System.out.println("Escolha uma opção: ");
            escolha = sc.nextInt();
        } while (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 9);
        return escolha;
    }

    int menuCursos(String tipo) {
        int escolha = 0;
        do {
            System.out.println("===================");
            System.out.println(" 1. Inserir Curso");
            System.out.println(" 2. Associar Disciplinas a um Curso");
            System.out.println(" 3. Remover Disciplinas de um Curso");
            System.out.println(" 4. Ver informações dos Cursos");
            System.out.println(" 5. Ver alunos inscritos nos Cursos");
            System.out.println();
            System.out.println("9. Voltar");
            System.out.println("===================");
            System.out.println("===================");
            System.out.println("Escolha uma opção: ");
            escolha = sc.nextInt();
        } while (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4 && escolha != 5 && escolha != 9);
        return escolha;
    }

    int menuInscricoes(String tipo) {
        int escolha = 0;
        do {
            System.out.println("===================");
            System.out.println(" 1. Inscrever Formando");
            System.out.println(" 2. Anular Inscrição");
            System.out.println(" 3. Ver alunos inscritos nos Cursos");
            System.out.println();
            System.out.println("9. Voltar");
            System.out.println("===================");
            System.out.println("===================");
            System.out.println("Escolha uma opção: ");
            escolha = sc.nextInt();
        } while (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 9);
        return escolha;
    }

}