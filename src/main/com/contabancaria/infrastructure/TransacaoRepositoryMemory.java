package main.com.contabancaria.infrastructure;

import main.com.contabancaria.entities.ITransacaoRepository;
import main.com.contabancaria.entities.Transacao;

import java.util.ArrayList;
import java.util.List;

public class TransacaoRepositoryMemory implements ITransacaoRepository {

    private List<Transacao> transacoes = new ArrayList<>();

    @Override
    public void salvar(Transacao transacao){
        transacoes.add(transacao);
    }

    @Override
    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
