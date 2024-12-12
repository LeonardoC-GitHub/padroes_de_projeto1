package atv1.classesPrincipais;

public abstract class Cargo {

    protected Categoria categoria;
    protected float bolsaBase = 100;


    public Cargo(float bolsaBase)
    {
        this.bolsaBase=bolsaBase;
    }
    
    public void setCategoria(Categoria categoria)
    {
        this.categoria=categoria;
    }
    public void setBolsaBase(float bolsaBase) {
        this.bolsaBase = bolsaBase;
    }

    public abstract float calcularBolsa();

}
