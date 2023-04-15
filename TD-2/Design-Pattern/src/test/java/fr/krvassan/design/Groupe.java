package fr.krvassan.design;

import java.util.ArrayList;
import java.util.List;

public class Groupe implements PersonnelInterface{

  private List<PersonnelInterface> pers;

  public Groupe() {
    pers = new ArrayList<>();
  }

  public void add(PersonnelInterface pers) {
    this.pers.add(pers);
  }

  public void remove(PersonnelInterface pers) {
    this.pers.remove(pers);
  }

  public void contains(PersonnelInterface pers) {
    this.pers.contains(pers);
  }

}
