package main.com.contabancaria.usescases;

import main.com.contabancaria.entities.Transacao;

import java.util.ArrayList;
import java.util.List;

public class TransacaoRepository {

    private List<Transacao> transacoes = new ArrayList<>();

    public void salvar(Transacao transacao){
        transacoes.add(transacao);
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
