public class Questao {
    String enunciado;
    String alternativa1;
    String alternativa2;
    String alternativa3;
    String alternativa4;
    private final int alternativacerta;

    public  Questao (String enunciado,String  alternativa1,  String  alternativa2,String  alternativa3,String alternativa4, int alternativacerta){
        this.enunciado = enunciado;
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3= alternativa3;
        this.alternativa4= alternativa4;
        this.alternativacerta =alternativacerta;
    }

      public String Mostrar(){
         return  enunciado + "\n"+
        "1-" + alternativa1 +
          "\n2-" + alternativa2+
          "\n3-" + alternativa3+
          "\n4-" + alternativa4;
    }
      public boolean respostaCorreta(int alternativa){
        return  this.alternativacerta == alternativa;
      }

}
