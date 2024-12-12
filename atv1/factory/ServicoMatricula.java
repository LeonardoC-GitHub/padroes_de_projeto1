package atv1.factory;

public class ServicoMatricula implements IServico 
{
    public String executar() {
        return "Matrícula efetivada";
    }

    public String cancelar() {
        return "Matrícula cancelada";
    }
}