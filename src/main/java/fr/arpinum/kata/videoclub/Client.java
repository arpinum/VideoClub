package fr.arpinum.kata.videoclub;

import com.google.common.collect.Lists;

import java.util.List;

public class Client {

    private String nom;
    private List<Location> locations = Lists.newArrayList();

    public Client(String nom) {
        this.nom = nom;
    }

    public void ajouteLocation(Location location) {
        locations.add(location);
    }

    public String getNom() {
        return nom;
    }

    public String résumé() {
        String résultat = "Liste des locations pour " + getNom() + "\n";
        for (Location location : locations) {
            résultat += "\t" + location.getFilm().getTitre() + "\t" +
                    String.valueOf(location.montant()) + "\n";
        }
        résultat += "Le montant dû est " + String.valueOf(montantTotal()) + "\n";
        résultat += "Vous avez gagné " + String.valueOf(pointsDeFidélitésTotaux()) + " points de fidélité";
        return résultat;
    }

    private double montantTotal() {
        double résultat = 0;
        for (Location location : locations) {
            résultat += location.montant();
        }
        return résultat;
    }

    private int pointsDeFidélitésTotaux() {
        int pointsDeFidélités = 0;
        for (Location location : locations) {
            pointsDeFidélités += location.pointsDeFidélité();
        }
        return pointsDeFidélités;
    }

}
