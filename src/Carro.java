public class Carro extends Veiculo{


    public Carro(String marca, String modelo, boolean luxo, double diaria, int km) {
        super(marca, modelo, luxo, diaria, km);
    }

    public Carro(String marca, String modelo, boolean luxo, String tipo, double diaria, int km){
        super();
    }

    public Carro() {

    }

    private static void exibirCarro() {
        System.out.println("     _____");
        System.out.println("____/_____\\____");
        System.out.println("-(o)--------(o)");
    }


}
