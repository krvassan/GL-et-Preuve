package org.krvassan.ocp;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {

  private List<salaire> salarieList;

  public Entreprise() {
    salarieList = new ArrayList<salaire>();
  }

  public double getSommeTotaleSalaires() {
    double sum = 0;
    for (salaire s : salarieList) {
      sum += s.calculSalaire();
    }
    return sum;
  }

}
