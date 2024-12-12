package atv1.cargos;

import atv1.classesPrincipais.Cargo;

public class Gerente extends Cargo
{
    private final int horas=6;
    public Gerente(float bolsaBase)
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