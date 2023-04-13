package org.krvassan.ocp;

public class Venndeur implements salaire {

  private final String nom;
  private final int nbannee;

  private final int comm;

  public Venndeur(String nom,int nbannee,int comm) {
    this.nom = nom;
    this.nbannee = nbannee;
    this.comm = comm;
  }

  @Override
  public double calculSalaire() {
    return 1500 + (20 * nbannee) + comm;
  }

}
