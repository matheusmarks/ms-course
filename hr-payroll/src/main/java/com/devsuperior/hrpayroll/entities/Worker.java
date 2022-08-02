package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;
import java.util.Objects;

public class Worker implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nome;

    private Double dailyIncome;

    public Worker() {}

    public Worker(Long id, String nome, Double dailyIncome) {
        this.id = id;
        this.nome = nome;
        this.dailyIncome = dailyIncome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return id.equals(worker.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
