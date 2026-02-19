package main.com.contabancaria.usescases;

import main.com.contabancaria.entities.*;

import java.time.LocalDateTime;

public class TransacaoService {

    private TransacaoRepository transacaoRepository;

    public TransacaoService(TransacaoRepository transacaoRepository){
        this.transacaoRepository = transacaoRepository;
    }

    public void transferir(Conta origem, Conta destino, double valor){
        if (origem.getSaldo() >= valor){
            origem.sacar(valor);
            destino.depositar(valor);
            transacaoRepository.salvar(new Transacao(origem, destino, valor,LocalDateTime.now()));
        }else {
            throw new RuntimeException("Saldo insuficiente.");
        }
    }
}
