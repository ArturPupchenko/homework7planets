package ua.com.alevel.nix.homework7planets.view;

import ua.com.alevel.nix.homework7planets.Service.Planet;

public class PlanetReporter {

    public static void print(Planet planet) {
        System.out.format("\nwAcceleration on " + planet.getName() + " is %.3f", planet.getGravityAccelerationOnCelestialBody());
        System.out.print(" m/s^2");
    }

}
