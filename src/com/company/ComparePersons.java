package com.company;

import java.util.Comparator;

/**
 * Created by Kellindill on 13.04.2017.
 */
public class ComparePersons implements Comparator<Person> {
    public int compare(Person person1, Person person2) {
        int result = -person1.getSurname().compareTo(person2.getSurname());
        return result == 0 ?
                -person1.getFirstName().compareTo(person2.getFirstName()) : result;
    }

    public boolean equals(Object comparator) {
        if(this == comparator) {
            return true;
        }
        if(comparator == null) {
            return false;
        }

        return getClass() == comparator.getClass();
    }
}
