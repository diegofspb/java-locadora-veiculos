import java.text.DecimalFormat;
import java.util.Scanner;

public class Aluguel {

    public static void painel_inicial() {
        System.out.println("           _____");
        System.out.println("      ____/_____\\____");
        System.out.println("      -(o)--------(o)");
        System.out.println("############################");
        System.out.println("### Locadora de Veículos ###");
        System.out.println("############################");
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

                System.out.println("#### Serviço de aluguel contratado: ####");
                System.out.println("Veículo: Automóvel");
                System.out.println("Marca: " + carro.getMarca());
                System.out.println("Modelo: " + carro.getModelo());
                System.out.println("Luxo: " + (carro.getLuxo() ? "Sim" : "Não"));
                System.out.println("Diária: " + carro.getDiaria());
                System.out.println("Quilometragem prevista: " + carro.getKm() + " km");

                String totalFormatado = CalculoDiarias.calculo(dias, km, carro.getDiaria());

                System.out.println("Total a pagar: R$" + totalFormatado);

            } else if (escolha == 2) {

                Moto moto = new Moto();
                System.out.println("Você escolheu uma Motocicleta!");

                System.out.println("Informe a Marca: \n(1) Honda  (2) kawasaki");
                int escolha_marca = entrada.nextInt();
                if (escolha_marca == 1) {
                    moto.setMarca("Honda");
                } else {
                    moto.setMarca("kawasaki");
                }

                int escolha_modelo;
                if (moto.getMarca().equals("Honda")) {
                    System.out.println("Informe o Modelo: \n(1) CG 160 Start  (2) CB 500");
                    escolha_modelo = entrada.nextInt();
                    if (escolha_modelo == 1) {
                        moto.setModelo("CG 160 Start");
                        moto.setLuxo(false);
                        moto.setDiaria(55.00);
                    } else {
                        moto.setModelo("CB 500");
                        moto.setLuxo(true);
                        moto.setDiaria(73.80);
                    }
                } else if (moto.getMarca().equals("kawasaki")) {
                    System.out.println("Informe o Modelo: \n(1) Ninja 300R  (2) Ninja 900R");
                    escolha_modelo = entrada.nextInt();
                    if (escolha_modelo == 1) {
                        moto.setModelo("Ninja 300R");
                        moto.setLuxo(false);
                        moto.setDiaria(74.00);
                    } else {
                        moto.setModelo("Ninja 900R");
                        moto.setLuxo(true);
                        moto.setDiaria(98.00);
                    }
                }

                System.out.println("O valor da diária é R$ " + moto.getDiaria() + " até 100km, acima disso acrescenta-se 10%");
                System.out.println("Quantos dias você ficará com o veículo ?");
                int dias = entrada.nextInt();

                System.out.println("Quantos Quilômetros você vai percorrer por dia ?");
                int km = entrada.nextInt();
                moto.setKm(km * dias);

                System.out.println("#### Serviço de aluguel contratado: ####");
                System.out.println("Veículo: Motocicleta");
                System.out.println("Marca: " + moto.getMarca());
                System.out.println("Modelo: " + moto.getModelo());
                System.out.println("Luxo: " + (moto.getLuxo() ? "Sim" : "Não"));
                System.out.println("Diária: " + moto.getDiaria());
                System.out.println("Quilometragem prevista: " + moto.getKm() + " km");

                String totalFormatado = CalculoDiarias.calculo(dias, km, moto.getDiaria());

                System.out.println("Total a pagar: R$" + totalFormatado);
                System.out.println("############################");
                System.out.println("##Obrigado. Volte sempre!###");
                System.out.println("############################");
            } else {
                System.out.println("Você não digitou nenhuma das opções acima");
                condicao = true;
            }
        } while (condicao);

    }
}
