package com.test;

public class VariableRef {
    public static void main(String[] args) {
        VariableRef variableRef = new VariableRef();
        Name name = new Name();
        name.setFirstName("Bob");
        name.setLastName("Don");
        System.out.println(name.toString());
        variableRef.changeName(name);
        System.out.println(name.toString());
    }


    void changeName(Name name){
        name.setFirstName("Nanu");
        name.setLastName("Kaku");
    }

}

class Name {
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
