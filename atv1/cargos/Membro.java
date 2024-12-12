package atv1.cargos;

import atv1.classesPrincipais.Cargo;

public class Membro extends Cargo 
{
    private final int horas=4;
    public Membro(float bolsaBase)
    {
        super(bolsaBase);
    }

    public float calcularBolsa()
    {
        return this.horas * (bolsaBase * this.categoria.percentualAumento());
    }

    public int getHoras() {
        return horas;
    }
    
}
