package br.com.estudo.model;

public enum Intensity {

    LEVE(1),
    MODERADO(2),
    INTENSO(3);

    private final int nivel;

    Intensity(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}
