package fr.krvassan.design;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Personnel {

  private final String nom;
  private final String prenom;
  private final String fonction;
  private final LocalDate datedenaissance;
  private final List<Numero> numeroList;

  public Personnel(PersonnelBuilder personnelBuilder) {
    this.nom = personnelBuilder.nom;
    this.prenom = personnelBuilder.prenom;
    this.fonction = personnelBuilder.fonction;
    this.numeroList = personnelBuilder.numeroList;
    this.datedenaissance = personnelBuilder.datedenaissance;
  }

  public String getNom() {
    return nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public String getFonction() {
    return fonction;
  }

  public LocalDate getDatedenaissance() {
    return datedenaissance;
  }

  public List<Numero> getNumeroList() {
    return numeroList;
  }

  public static class PersonnelBuilder {

    //Requis
    private final String nom;
    private final String prenom;

    private final String fonction;

    //Optionnel
    private LocalDate datedenaissance = null;
    private final List<Numero> numeroList = new ArrayList<Numero>();

    public PersonnelBuilder(String nom, String prenom,String fonction){
      this.nom = nom;
      this.prenom = prenom;
      this.fonction = fonction;
    }

    public PersonnelBuilder numero (Numero numeros) {
      this.numeroList.add(numeros);
      return this;
    }

    public PersonnelBuilder dateNaissance(LocalDate date) {
      this.datedenaissance = date;
      return this;
    }

    public Personnel build() {
      return new Personnel(this);
    }

  }


}
