package ch.cern.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by zuber on 03.03.17.
 */
@Entity
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String town;
  private String street;
  private Integer houseNumber;

  public String getTown() {
    return town;
  }

  public String getStreet() {
    return street;
  }

  public Integer getHouseNumber() {
    return houseNumber;
  }
}
