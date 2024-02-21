import java.util.Scanner;
public class Prova {
    Alunos candidato;
    Questao  q1, q2, q3, q4;
    private  int a1;
    private int a2;
    private int a3;
    private int a4;
    private  float nota;
    public Prova(Alunos candidato, Questao q1,Questao q2,Questao q3, Questao q4){
        this.candidato = candidato;
        this.q1= q1;
        this.q2= q2;
        this.q3= q3;
        this.q4= q4;
        a1=9999;
        a2=9999;
        a3=9999;
        a4=9999;
        nota=0;
    }

    public void aplicarrProva() {
        Scanner lerProva = new Scanner(System.in);

        System.out.println(q1.Mostrar());
        System.out.println("Qual é a alternativa correta?");
        a1=lerProva.nextInt();
        System.out.println(q2.Mostrar());
        System.out.println("Qual é a alternativa correta?");
        a2=lerProva.nextInt();
        System.out.println(q3.Mostrar());
        System.out.println("Qual é a alternativa correta?");
        a3=lerProva.nextInt();
        System.out.println(q4.Mostrar());
        System.out.println("Qual é a alternativa correta?");
        a4=lerProva.nextInt();
    }

    public void corrigirProva(){
    nota=0;
    if(q1.respostaCorreta(a1)) nota+=2.5f;
    if(q2.respostaCorreta(a2)) nota+=2.5f;
    if(q3.respostaCorreta(a3)) nota+=2.5f;
    if(q4.respostaCorreta(a4)) nota+=2.5f;
    exibaResultado();
    }

    public void  exibaResultado() {
        System.out.println("O prova do aluno(a) " + candidato.getNome());
        System.out.println("---------------------------------------");
        System.out.println("nota da prova é " + nota);
    }
}
