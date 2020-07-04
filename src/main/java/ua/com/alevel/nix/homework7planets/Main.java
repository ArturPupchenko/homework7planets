package ua.com.alevel.nix.homework7planets;

import ua.com.alevel.nix.homework7planets.Service.impl.*;
import ua.com.alevel.nix.homework7planets.view.PlanetReporter;

public class Main {

    public static void main(String[] args) {
        PlanetReporter.print(new Mercury());
        PlanetReporter.print(new Venus());
        PlanetReporter.print(new Earth());
        PlanetReporter.print(new Mars());
        PlanetReporter.print(new Jupiter());
        PlanetReporter.print(new Saturn());
        PlanetReporter.print(new Uranus());
        PlanetReporter.print(new Neptune());
    }

}
