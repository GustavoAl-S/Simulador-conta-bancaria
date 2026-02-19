package main.com.contabancaria.entities;

import java.util.List;

public interface ITransacaoRepository {

    void salvar(Transacao transacao);

    List<Transacao> getTransacoes();
}
