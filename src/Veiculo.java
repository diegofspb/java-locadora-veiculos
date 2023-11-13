public class Veiculo {
    protected String marca;
    protected String modelo;
    protected boolean luxo;
    protected double diaria;
    protected int km;

    public Veiculo(String marca, String modelo, boolean luxo, double diaria, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.luxo = luxo;
        this.diaria = diaria;
        this.km = km;
    }

    Veiculo(){};

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getLuxo() {
        return luxo;
    }

    public void setLuxo(boolean luxo) {
        this.luxo = luxo;
    }
    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public double getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
