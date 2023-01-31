import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //POO - ESCOLA
        //PESSOA- PROFESSOR,ALUNO vou usar construtor e herança

        //colocar acesso apenas para professor autorizado
        Scanner i = new Scanner(System.in);
        int escolha = 0;
        Professor Profum = new Professor("Vitor", 35, "Superior");


        System.out.println("Ficha escola DD");


        do {
            System.out.println("Caro professor para lançamento das notas digite os dados para acesso");
            Profum.acesso();
            System.out.println();

            if (Profum.senhaP == Profum.getSenha()) {


                Aluno Alunoum = new Aluno("João", 16, "Ensino Médio");
                Alunoum.print();
                Alunoum.Avaliacao();
                Alunoum.Aprovacao();
                Aluno Alunodois = new Aluno("Jessica", 15, "Ensino Médio");
                Alunodois.print();
                Alunoum.Avaliacao();
                Alunoum.Aprovacao();


            } else {
                System.out.println("Dados de acesso incorreto");
                System.out.println("Deseja tentar novamente? Digite 1 para sim ou 2 para não");
                escolha = i.nextInt();
            }


        } while (escolha == 1);


    }
}