package atv1.cargos;

import atv1.classesPrincipais.Cargo;

public class Coordenador extends Cargo 
{
    private final int horas=8;
    public Coordenador(float bolsaBase) 
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
