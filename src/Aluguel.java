import java.text.DecimalFormat;
import java.util.Scanner;

public class Aluguel {

    public static void painel_inicial() {
        System.out.println("### Locadora de Veículos ###");
        System.out.println("");
        System.out.println("Qual Veículo você quer alugar ?");
        System.out.println("");
        System.out.println("(1) Carro");
        System.out.println("(2) Moto\n");
    }

    public static void main(String[] args) {

        boolean condicao = false;

        do {
            painel_inicial();

            Scanner entrada = new Scanner(System.in);
            int escolha = entrada.nextInt();

            if (escolha == 1) {

                Carro carro = new Carro();

                System.out.println("Você escolheu um Carro!");

                System.out.println("Informe a Marca: \n(1) Fiat  (2) Chevrolet");
                int escolha_marca = entrada.nextInt();
                if (escolha_marca == 1) {
                    carro.setMarca("Fiat");
                } else {
                    carro.setMarca("Chevrolet");
                }

                int escolha_modelo;
                if (carro.getMarca().equals("Fiat")) {
                    System.out.println("Informe o Modelo: \n(1) Uno  (2) Cronos");
                    escolha_modelo = entrada.nextInt();
                    if (escolha_modelo == 1) {
                        carro.setModelo("Uno");
                        carro.setLuxo(false);
                        carro.setDiaria(82.87);
                    } else {
                        carro.setModelo("Cronos");
                        carro.setLuxo(true);
                        carro.setDiaria(105.23);
                    }
                } else if (carro.getMarca().equals("Chevrolet")) {
                    System.out.println("Informe o Modelo: \n(1) Chevete  (2) Camaro");
                    escolha_modelo = entrada.nextInt();
                    if (escolha_modelo == 1) {
                        carro.setModelo("Chevete");
                        carro.setLuxo(false);
                        carro.setDiaria(82.87);
                    } else {
                        carro.setModelo("Camaro");
                        carro.setLuxo(true);
                        carro.setDiaria(105.23);
                    }
                }

                System.out.println("O valor da diária é R$ " + carro.getDiaria() + " até 100km, acima disso acrescenta-se 10%");
                System.out.println("Quantos dias você ficará com o veículo ?");
                int dias = entrada.nextInt();

                System.out.println("Quantos Quilômetros você vai percorrer por dia ?");
                int km = entrada.nextInt();
                carro.setKm(km * dias);

                double total;
                if (carro.getKm() <= 100) {
                    total = dias * carro.getDiaria();
                } else {
                    total = dias * ((carro.getDiaria() * 0.1) + carro.getDiaria());
                }

                System.out.println("Serviço de aluguel contratado: ");
                System.out.println("Veículo: Automóvel");
                System.out.println("Marca: " + carro.getMarca());
                System.out.println("Modelo: " + carro.getModelo());
                System.out.println("Luxo: " + (carro.getLuxo() ? "Sim" : "Não"));
                System.out.println("Diária: " + carro.getDiaria());
                System.out.println("Quilometragem prevista: " + carro.getKm());

                DecimalFormat formato = new DecimalFormat("#.##");
                String totalFormatado = formato.format(total);

                System.out.println("Serviço de aluguel contratado: ");
                // ...
                System.out.println("Total a pagar: R$" + totalFormatado);

            } else if (escolha == 2) {
                System.out.println("Você escolheu uma Motocicleta!");
            } else {
                System.out.println("Você não digitou nenhuma das opções acima");
                condicao = true;
            }
        } while (condicao);

    }
}
