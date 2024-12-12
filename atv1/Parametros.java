package atv1;

import atv1.classesPrincipais.Aluno;

public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String nomeFacldade = "UFJF";
    private String nomeEquipe = "RinoBot";
    private Aluno alunoLogado;
    
    public String getNomeFacldade() {
        return nomeFacldade;
    }
    public void setNomeFacldade(String nomeFacldade) {
        this.nomeFacldade = nomeFacldade;
    }
    public String getNomeEquipe() {
        return nomeEquipe;
    }
    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }
    public Aluno getAlunoLogado() {
        return alunoLogado;
    }
    public void setAlunoLogado(Aluno alunoLogado) {
        this.alunoLogado = alunoLogado;
    } 
    
}
