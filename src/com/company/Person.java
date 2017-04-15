package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Person implements Comparable<Person>, Serializable {
  // Constructor
  public Person(String firstName, String surname) {
    this.firstName = firstName;
    this.surname = surname;
  }

  @Override
  public String toString() {
    return firstName + " " + surname;
  }

  // Compare Person objects
  public int compareTo(Person person) {
    int result = surname.compareTo(person.surname);
    return result == 0 ? firstName.compareTo(person.firstName):result;
  }


  @Override
  public boolean equals(Object person) {
    return compareTo((Person)person) == 0;
  }


  @Override
  public int hashCode() {
    return 7*firstName.hashCode() + 13*surname.hashCode();
  }


  public String getFirstName() {
    return firstName;
  }

  public String getSurname() {
    return surname;
  }

  private static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

  private String firstName;                                                                        // First name of person
  private String surname;                                                                          // Second name of person
  private static final long serialVersionUID = 1002L;
}
