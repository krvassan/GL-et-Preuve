package org.krvassan.ocp;

public class Employe implements salaire {

  private final String nom;
  private final int nbannee;

  public Employe(String nom,int nbannee) {
    this.nom = nom;
    this.nbannee = nbannee;
  }

  @Override
  public double calculSalaire() {
    return 1500 + 20 * nbannee;
  }

}
