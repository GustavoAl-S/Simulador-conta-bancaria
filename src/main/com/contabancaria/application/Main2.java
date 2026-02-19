package main.com.contabancaria.application;

import main.com.contabancaria.entities.*;
import main.com.contabancaria.usescases.TransacaoService;
import main.com.contabancaria.usescases.TransacaoRepository;

public class Main2 {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Joao");
        Cliente cliente1 = new Cliente("Maria");

        Conta c1 = new Conta(cliente, 5000);
        Conta c2 = new ContaCorrente(cliente1, 0);
        int valor = 1000;

        TransacaoRepository repository = new TransacaoRepository();
        TransacaoService transferencia = new TransacaoService(repository);

        transferencia.transferir(c1, c2, valor);

        System.out.println(repository.getTransacoes());
        System.out.println(c2.getSaldo());
        System.out.println(c1.getSaldo());
    }
}
