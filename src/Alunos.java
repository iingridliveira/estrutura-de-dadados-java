public class Alunos {
    String nome;
    int matricula;
    public Alunos (String nome, int matricula){
        this.setNome(nome);
        this.setMatricula(matricula);

    }

    public String getNome( ) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}

