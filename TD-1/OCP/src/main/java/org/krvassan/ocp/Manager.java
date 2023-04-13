package org.krvassan.ocp;

public class Manager extends Employe {

private final int pers;

  public Manager(String nom, int nbannee, int pers) {
    super(nom, nbannee);
    this.pers = pers;
  }

  @Override
  public double calculSalaire() {
    return super.calculSalaire() + 100 *pers;
  }
}
