package application;


import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/*
Contratos - Gerar parcelas

Serviço de pagamento - Interface

Serviço do Paypal - implementa interface

 Ler dados do contrato

 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int numParcelas = sc.nextInt();
        Contract contrato = new Contract(numero, data, valor);

        ContractService servicoDeContrato = new ContractService(new PaypalService());

        servicoDeContrato.processContract(contrato, numParcelas);

        System.out.println("Parcelas:");
        for (Installment parcela : contrato.getInstallments()) {
            System.out.println(parcela);
        }

        sc.close();

    }
}
