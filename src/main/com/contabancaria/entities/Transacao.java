package main.com.contabancaria.entities;

import java.time.LocalDateTime;

public class Transacao {
    private Conta origem;
    private Conta destino;
    private double valor;
    private LocalDateTime data;

    public Transacao(Conta origem, Conta destino, double valor, LocalDateTime data) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Transferencia de " + origem + " para " + destino + " - Valor: R$ " + valor + " - " + data;
    }
}
