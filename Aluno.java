import java.util.Scanner;

public class Aluno extends Pessoa{
   private int nota1;
    private int nota2;
    private int nota3;
    String
            nomea;
    Scanner Scan = new Scanner(System.in);
    public Aluno(String nomea, int idadep, String nivelescolarP) {
        super(nomea, idadep, nivelescolarP);


    }

    public void print(){

        System.out.println("\nAluno: "+super.nome+"\nIdade:"+super.idade+"\nNível escolar:"+super.nivelescolar);
    }

public void Avaliacao(){
    System.out.println("Digite a primeira nota: ");
    nota1 = Scan.nextInt();
    System.out.println("Digite a segunda nota: ");
    nota2 = Scan.nextInt();
    System.out.println("Digite a terceira nota: ");
    nota3 = Scan.nextInt();


}



public void Aprovacao(){
        //media nota
    int media= (nota1+nota2+nota3)/3;
    System.out.println("A média foi: "+media);
    if(media>=7){
        System.out.println("Aprovado");
    }else{
        System.out.println("Reprovado");
    }



}


    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
}
