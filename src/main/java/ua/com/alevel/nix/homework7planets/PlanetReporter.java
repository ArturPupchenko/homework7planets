package ua.com.alevel.nix.homework7planets;

public class PlanetReporter {

    public static void print(Planet planet) {
        System.out.format("\nwAcceleration on " + planet.getName() + " is %.3f", planet.getGravityAccelerationOnCelestialBody());
        System.out.print(" m/s^2");
    }

}
