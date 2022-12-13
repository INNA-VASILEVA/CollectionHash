package Passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Passport {
    private String passportNumber; // Номер паспорта
    private String surname;         // Фамилия
    private String name;            // Имя
    private String MiddleName;      // Отчество
    private LocalDate dateOfBirth;     // Дата рождения
    static Set<Passport> human = new HashSet<>();

    public Passport(String passportNumber, String surname, String name, String middleName, LocalDate dateOfBirth) {
        this.passportNumber = passportNumber;
        this.surname = surname;
        this.name = name;
        MiddleName = middleName;
        this.dateOfBirth = dateOfBirth;
        addSetHuman();
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    void addSetHuman() {
        Passport passport;
        for (Passport passport1 : human) {
            if (passport1.passportNumber.equals(this.passportNumber)) {
                human.clear(); // Будем перезаписывать новые значения
            }
        }
        human.add(this);
    }

    public static String getHuman(String numpas) {
        Passport passport;
        for (Passport passport1 : human) {
            if (passport1.passportNumber == numpas) {
                return passport1.surname + " " + passport1.name + " " + passport1.MiddleName;
            }
        }
        return null;
    }

    static String infoHuman(Passport passport) {
        return passport.surname + " " + passport.name + " " + passport.MiddleName + " " + passport.passportNumber;

    }
}