import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.DialogTypeSelection;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<formandos> listaFormandos = new ArrayList<>();
        ArrayList<cursos> listaCursos = new ArrayList<>();
        ArrayList<disciplinas> listaDisciplinas = new ArrayList<>();
        ArrayList<DisciplinasCurso> listaDisciplinasCurso = new ArrayList<>();
        ArrayList<Inscricoes> listaInscricoes = new ArrayList<>();

        menus menu = new menus();
        int escolha = 0;
        int escolhaSec = 0;
        int escolhaTer = 0;
        int idFormando = 1;
        int idCurso = 1;
        int idDisciplina = 1;
        int idInscricao = 1;

        do {
            escolha = menu.menuPrincipal();
            switch (escolha) {

            case 1:
                // Menu Principal
                do {
                    escolhaSec = menu.menuFormandos("");
                    switch (escolhaSec) {
                    // Menu Formandos
                    case 1:
                        // 1. Inserir Formando
                        System.out.println("Inserir Formando");
                        formandos inserirFormando = new formandos();
                        Scanner sc = new Scanner(System.in);
                        Scanner sc1 = new Scanner(System.in);

                        System.out.println("Formando com o ID: " + idFormando);

                        System.out.println("Nome do Formando: ");
                        inserirFormando.setNomeFormando(sc1.nextLine());

                        System.out.println("Gênero do Formando (Male/Female): ");
                        inserirFormando.setGeneroFormando(sc1.nextLine());

                        System.out.println("Número de Telefone do Formando: ");
                        inserirFormando.setTelefoneFormando(sc.nextInt());

                        inserirFormando.setIdFormando(idFormando++);

                        listaFormandos.add(inserirFormando);
                        break;

                    case 2:
                        // 2. Modificar Formando
                        if (listaFormandos.isEmpty()) {
                            System.out.println("Não há formandos inseridos.");
                        } else {
                            Scanner sc4 = new Scanner(System.in);

                            for (formandos f : listaFormandos) {
                                System.out.println(f.toString());
                            }

                            System.out.println("ID do formando:");
                            int id = sc4.nextInt();

                            try {
                                formandos modificarFormando = listaFormandos.get(id - 1);

                                sc4 = new Scanner(System.in);
                                System.out.println("Nome do Formando: ");
                                modificarFormando.setNomeFormando(sc4.nextLine());

                                sc4 = new Scanner(System.in);
                                System.out.println("Genero do Formando (Male/Female): ");
                                modificarFormando.setGeneroFormando(sc4.nextLine());

                                sc4 = new Scanner(System.in);
                                System.out.println("Telefone do Formando: ");
                                modificarFormando.setTelefoneFormando(sc4.nextInt());

                            } catch (Exception e) {

                                System.out.println("O formando com o ID " + id + " não existe");

                            }
                        }
                        break;

                    case 3:
                        // 3. Eliminar Formando
                        System.out.println("Eliminar Formando");
                        if (listaFormandos.isEmpty()) {
                            System.out.println("Não há quaisquer formandos, neste momento.");
                        } else {

                            Scanner sc2 = new Scanner(System.in);

                            for (formandos f : listaFormandos) {
                                System.out.println(f.toString());
                            }

                            System.out.println("Insira o ID do formando que deseja eliminar: ");
                            int id = sc2.nextInt();
                            formandos formando = new formandos();

                            listaFormandos.remove(id - 1);
                            idFormando = 1;
                            int y = listaFormandos.size();
                            for (int x = 1; x < y + 1; x++) {
                                formando = listaFormandos.get(x - 1);
                                formando.setIdFormando(idFormando++);
                            }
                            System.out.println("Formando com o id " + id + " foi removido");
                            for (formandos f : listaFormandos) {
                                System.out.println(f.toString());
                            }
                        }
                        break;

                    case 4:
                        // 4. Listar Formandos
                        System.out.println("Lista de Formandos inseridos:");

                        for (formandos f : listaFormandos) {
                            System.out.println(f.toString());
                        }
                        break;
                    }
                } while (escolhaSec != 9);
                break;

            case 2:
                // Menu Gestão Escolar
                do {
                    escolhaSec = menu.menuGestaoEscolar("");
                    switch (escolhaSec) {

                    case 1:
                        // Menu Disciplinas
                        do {
                            escolhaTer = menu.menuDisciplinas("");
                            switch (escolhaTer) {
                            case 1:
                                // 1. Inserir Disciplina
                                System.out.println("Inserir Formando");
                                disciplinas inserirDisciplina = new disciplinas();
                                Scanner sc = new Scanner(System.in);
                                Scanner sc1 = new Scanner(System.in);

                                System.out.println("Disciplina com o ID: " + idDisciplina);

                                System.out.println("Nome do Formando: ");
                                inserirDisciplina.setNomeDisciplina(sc1.nextLine());

                                System.out.println("Carga horária: ");
                                inserirDisciplina.setHorasDisciplina(sc.nextInt());

                                inserirDisciplina.setIdDisciplina(idDisciplina++);

                                listaDisciplinas.add(inserirDisciplina);
                                break;

                            case 2:
                                // 2. Modificar Disciplina
                                if (listaDisciplinas.isEmpty()) {
                                    System.out.println("Não há disciplinas inseridas.");
                                } else {
                                    Scanner sc4 = new Scanner(System.in);

                                    for (disciplinas f : listaDisciplinas) {
                                        System.out.println(f.toString());
                                    }

                                    System.out.println("ID da disciplina:");
                                    int id = sc4.nextInt();

                                    try {
                                        disciplinas modificarDisciplina = listaDisciplinas.get(id - 1);

                                        sc4 = new Scanner(System.in);
                                        System.out.println("Nome da Disciplina: ");
                                        modificarDisciplina.setNomeDisciplina(sc4.nextLine());

                                        sc4 = new Scanner(System.in);
                                        System.out.println("Carga Horária: ");
                                        modificarDisciplina.setHorasDisciplina(sc4.nextInt());

                                    } catch (Exception e) {

                                        System.out.println("A disciplina com o ID " + id + " não existe");

                                    }
                                }
                                break;

                            case 3:
                                // 3. Eliminar Disciplina
                                System.out.println("Eliminar Disciplina");
                                if (listaDisciplinas.isEmpty()) {
                                    System.out.println("Não há quaisquer disciplinas, neste momento.");
                                } else {

                                    Scanner sc2 = new Scanner(System.in);

                                    for (disciplinas d : listaDisciplinas) {
                                        System.out.println(d.toString());
                                    }

                                    System.out.println("Insira o ID da disciplina que deseja eliminar: ");
                                    int id = sc2.nextInt();
                                    disciplinas disciplina = new disciplinas();

                                    listaDisciplinas.remove(id - 1);
                                    idDisciplina = 1;
                                    int y = listaDisciplinas.size();
                                    for (int x = 1; x < y + 1; x++) {
                                        disciplina = listaDisciplinas.get(x - 1);
                                        disciplina.setIdDisciplina(idDisciplina++);
                                    }
                                    System.out.println("Disciplina com o ID " + id + " foi removido");
                                    for (disciplinas d : listaDisciplinas) {
                                        System.out.println(d.toString());
                                    }
                                }
                                break;

                            case 4:
                                // 4. Listar Disciplinas
                                System.out.println("Listar de Disciplinas inseridas:");

                                for (disciplinas d : listaDisciplinas) {
                                    System.out.println(d.toString());
                                }
                                break;
                            }
                        } while (escolhaTer != 9);
                        break;

                    // Menu Cursos
                    case 2:
                        do {
                            escolhaTer = menu.menuCursos("");
                            switch (escolhaTer) {
                            case 1:
                                // 1. Inserir Curso
                                System.out.println("Inserir Curso");
                                cursos inserirCurso = new cursos();
                                Scanner sc1 = new Scanner(System.in);

                                System.out.println("Curso com o ID: " + idCurso);

                                System.out.println("Nome do Curso: ");
                                inserirCurso.setNomeCurso(sc1.nextLine());

                                inserirCurso.setIdCurso(idCurso++);

                                listaCursos.add(inserirCurso);
                                break;

                            case 2:
                                // 2. Associar Disciplinas a um Curso
                                System.out.println("Associar disciplinas a um curso.");
                                if (listaDisciplinas.isEmpty() || listaCursos.isEmpty()) {
                                    System.out.println("Não existem disciplinas ou cursos neste momento.");
                                } else {
                                    Scanner sc2 = new Scanner(System.in);

                                    DisciplinasCurso adicionarDisciplina = new DisciplinasCurso();

                                    for (cursos cursos : listaCursos) {
                                        System.out.println(cursos.toString1());
                                    }

                                    System.out.println("ID do Curso: ");
                                    int idC = sc2.nextInt();
                                    cursos cursos = listaCursos.get(idC - 1);
                                    adicionarDisciplina.setNomeCurso(cursos.getNomeCurso());

                                    adicionarDisciplina.setIdCurso(idC);

                                    for (disciplinas disciplinas : listaDisciplinas) {
                                        System.out.println(disciplinas.toString());
                                    }

                                    System.out.println("ID da Disciplina: ");
                                    int idD = sc2.nextInt();
                                    disciplinas disciplina = listaDisciplinas.get(idD - 1);
                                    adicionarDisciplina.setNomeDisciplina(disciplina.getNomeDisciplina());

                                    listaDisciplinasCurso.add(adicionarDisciplina);

                                    for (DisciplinasCurso mostra : listaDisciplinasCurso) {
                                        System.out.println(mostra.toString());
                                    }
                                }
                                break;

                            case 3:
                                // 3. Remover Disciplinas de um Curso
                                break;

                            case 4:
                                // 4. Ver informações dos Cursos
                                System.out.println("Lista de Cursos inseridos:");

                                for (cursos c : listaCursos) {
                                    System.out.println(c.toString());
                                }
                                break;

                            case 5:
                                // 5. Ver alunos inscritos nos Cursos
                                for (Inscricoes mostra : listaInscricoes) {
                                    System.out.println(mostra.toString());
                                }
                                break;
                            }
                        } while (escolhaTer != 9);
                        break;

                    case 3:
                        // Menu Inscrições
                        do {
                            escolhaTer = menu.menuInscricoes("");
                            switch (escolhaTer) {
                            case 1:
                                // 1. Inscrever Formando
                                System.out.println("Inscrever Formando");
                                if (listaFormandos.isEmpty() || listaCursos.isEmpty()) {
                                    System.out.println("Não existem formandos ou cursos neste momento.");
                                } else {
                                    Scanner sc2 = new Scanner(System.in);

                                    Inscricoes adicionarFormando = new Inscricoes();

                                    System.out.println("ID de Inscrição: " + idInscricao);

                                    for (cursos cursos : listaCursos) {
                                        System.out.println(cursos.toString1());
                                    }

                                    System.out.println("ID do Curso: ");
                                    int idC = sc2.nextInt();
                                    cursos cursos = listaCursos.get(idC - 1);
                                    adicionarFormando.setNomeCurso(cursos.getNomeCurso());

                                    adicionarFormando.setIdCurso(idC);

                                    for (formandos formandos : listaFormandos) {
                                        System.out.println(formandos.toString());
                                    }

                                    System.out.println("ID do Formando: ");
                                    int idF = sc2.nextInt();
                                    formandos formando = listaFormandos.get(idF - 1);
                                    adicionarFormando.setNomeFormando(formando.getNomeFormando());

                                    adicionarFormando.setIdInscricao(idInscricao++);

                                    listaInscricoes.add(adicionarFormando);

                                    for (Inscricoes mostra : listaInscricoes) {
                                        System.out.println(mostra.toString());
                                    }
                                }
                                break;

                            case 2:
                                // 2. Anular Inscrição
                                System.out.println("Anular Inscrição de Formando");
                                if (listaInscricoes.isEmpty()) {
                                    System.out.println("Não existem incrições.");
                                } else {
                                    Scanner sc2 = new Scanner(System.in);

                                    Inscricoes anularFormando = new Inscricoes();

                                    for (Inscricoes mostra : listaInscricoes) {
                                        System.out.println(mostra.toString());
                                    }
                                    
                                    System.out.println("ID de inscrição a anular: ");
                                    int id = sc2.nextInt();

                                    listaInscricoes.remove(id - 1);
                                    idInscricao = 1;
                                    int y = listaInscricoes.size();
                                    for (int x = 1; x < y + 1; x++) {
                                        anularFormando = listaInscricoes.get(x - 1);
                                        anularFormando.setIdInscricao(idInscricao++);
                                    }
                                    System.out.println("Inscricao com o ID " + id + " foi removida.");
                                    for (Inscricoes i : listaInscricoes) {
                                        System.out.println(i.toString());
                                    }
                                }
                                break;

                            case 3:
                                // 3. Ver alunos inscritos nos Cursos
                                for (Inscricoes mostra : listaInscricoes) {
                                    System.out.println(mostra.toString());
                                }
                                break;
                            }
                        } while (escolhaTer != 9);
                        break;
                    }
                } while (escolhaSec != 9);
                break;
            }
        } while (escolha != 9);

    }
}