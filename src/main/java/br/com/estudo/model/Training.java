package br.com.estudo.model;

public class Training {

    private String name;
    private int durationInMin;
    private Intensity intensity;
    private Type type;

    public Training(String name, int durationInMin, Intensity intensity, Type type) {
        this.name = name;
        this.durationInMin = durationInMin;
        this.intensity = intensity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getDurationInMin() {
        return durationInMin;
    }

    public Intensity getIntensity() {
        return intensity;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Training{" +
                "name='" + name + '\'' +
                ", durationInMin=" + durationInMin +
                ", intensity=" + intensity +
                ", type=" + type +
                '}';
    }
}
