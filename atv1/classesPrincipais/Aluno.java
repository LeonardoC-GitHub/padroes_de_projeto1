package atv1.classesPrincipais;

public class Aluno {

    private String nome = "";
    private String matricula = "";
    private float bolsa;
    private Cargo cargo;
    private Certificado certificado;



    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    private void setBolsa() {
        this.bolsa=this.cargo.calcularBolsa();
    }

    public String emitirCertificado() {
        return this.certificado.emitir();
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public Cargo getCargo() {
        return cargo;
    }


    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }


    public Certificado getCertificado() {
        return certificado;
    }


    public void setCertificado(Certificado certificado) {
        this.certificado = certificado;
    }

    public String userCertificado()
    {
        return this.certificado.emitir();
    }
}