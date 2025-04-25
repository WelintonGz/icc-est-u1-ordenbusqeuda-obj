package models;

public class Direccion {
    private String calle;
    private int numeroCalle;
    private int codigo;
    public Direccion(String calle, int numeroCalle, int codigo) {
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.codigo = codigo;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getNumeroCalle() {
        return numeroCalle;
    }
    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        return "Direccion [calle=" + calle + ", numeroCalle=" + numeroCalle + ", codigo=" + codigo + "]";
    }

    
    
}
