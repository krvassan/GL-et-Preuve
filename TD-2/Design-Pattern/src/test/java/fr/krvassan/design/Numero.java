package fr.krvassan.design;

import java.util.Objects;

public class Numero {

  private final String numero;
  private final NumeroType numeroType;


  public Numero(String numero, NumeroType numeroType) {
    this.numero = numero;
    this.numeroType = numeroType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Numero that = (Numero) o;
    return Objects.equals(numero, that.numero) && numeroType == that.numeroType;
  }

  @Override
  public int hashCode() {
    return Objects.hash(numero, numeroType);
  }

  public NumeroType getNumeroType() {
    return this.numeroType;
  }

  public String getNumero(){
    return this.numero;
  }
}
