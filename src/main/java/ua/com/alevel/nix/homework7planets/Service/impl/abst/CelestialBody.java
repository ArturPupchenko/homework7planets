package ua.com.alevel.nix.homework7planets.Service.impl.abst;


import ua.com.alevel.nix.homework7planets.Service.Planet;

public abstract class CelestialBody implements Planet {

    private String name;
    private Double weight;
    private Double radius;
    private static final Double GRAVITY_CONST = 6.6720 * Math.pow(10,-11);

    public CelestialBody(Double weight, Double radius,String name) {
        this.weight = weight;
        this.radius = radius;
        this.name = name;
    }

    public Double getGravityAccelerationOnCelestialBody() {
        return GRAVITY_CONST * (weight / Math.pow(radius, 2));
    }

    public String getName() {
        return name;
    }


    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
