public class Professor extends Pessoa{
    int registroProf;
   private String login=nome;
    private int senha=12;
    int senhaP;

    public Professor(String nomeprf, int idadep, String nivelescolarP) {
        super(nomeprf, idadep, nivelescolarP);

    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }


    public void acesso(){

        System.out.println("Digite seu nome: ");
        login =o.next();
        System.out.println("Digite seu registro: ");
         senhaP =o.nextInt();


    }
}
