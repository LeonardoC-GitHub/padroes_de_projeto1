package atv1.factory;

public class ServicoDesligamento implements IServico
{
    public String executar() {
        return "Desligamento efetivado";
    }

    public String cancelar() {
        return "Matrícula cancelado";
    }    
}
