package com.example.unittest.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.Objects;

public class EmployeeBuilder {



    private int    eId;
    private String firstName;
    private String lastName;


    private EmployeeBuilder(Builder builder) {
        eId = builder.eId;
        firstName = builder.firstName;
        lastName = builder.lastName;
    }

    public int geteId() {
        return eId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static final class Builder {


        private int    eId;
        private String firstName;
        private String lastName;


        public Builder() {
        }

        public Builder withEid(int val) {
            eId = val;
            return this;
        }

        public Builder withFirstname(String val) {
            firstName = val;
            return this;
        }

        public Builder withlastName(String val) {
            lastName = val;
            return  this;
        }

        public EmployeeBuilder build() {
            return new EmployeeBuilder(this);
        }

    }

    @Override
    public String toString() {
        return "EmployeeBuilder{" +
                "eId=" + eId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeBuilder that = (EmployeeBuilder) o;
        return eId == that.eId &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eId, firstName, lastName);
    }
}
