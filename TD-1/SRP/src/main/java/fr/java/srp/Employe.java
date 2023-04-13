package fr.java.srp;

public class Employe {

  private final String nom;
  private final String adresse;

  Employe(String nom, String adresse) {
    this.nom = nom;
    this.adresse = adresse;
  }

  @Override
  public String toString() {
    return nom + " - " + adresse;
  }

}
