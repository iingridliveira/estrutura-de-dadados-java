public class Main {
    public static void main(String[] args) {
        Questao q1 = new Questao("Qual  é a raiz quadrada de 16?" , "3", "4", "8","6",2);
        Questao q2 = new Questao("Quanto é 430 divido para 2?" , "204","210", "400","215", 4);
        Questao q3 = new Questao("Quanto mede o volume de cubo cujo as aresta medem 10m?" , "100", "500","1000","10000", 3);
        Questao q4 = new Questao("  Quanto é 50 x 40?", "2000", "200", "10", "400", 1);
        Alunos aluno01= new Alunos("Ingrid", 22345);
        Prova p = new Prova(aluno01, q1, q2, q3,q4);
           p.aplicarrProva();
           p.corrigirProva();



    }
}