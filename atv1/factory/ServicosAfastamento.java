package atv1.factory;

public class ServicosAfastamento implements IServico
{
    public String executar() {
        return "Afastamento efetivado";
    }

    public String cancelar() {
        return "Afastamento cancelado";
    }
}
