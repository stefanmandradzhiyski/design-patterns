package com.snmi.structuralPatterns.adapter.employees;

/**
 * Employee from LDAP directory
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class EmployeeLDAP {

    /**
     * Variables
     */
    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    /**
     * Custom constructor
     * @param cn take the cn
     * @param surname take the surname
     * @param givenName take the given name
     * @param mail take the mail
     */
    public EmployeeLDAP(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }

    /**
     * Getters
     */
    public String getCn() {
        return cn;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }
}
