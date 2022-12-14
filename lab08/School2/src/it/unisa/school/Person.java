package it.unisa.school;

public class Person {

    final private String name;
    final private String surname;
    final private int birthYear;
    private String userId;
    private String password;

    public Person(String name, String surname, int birthYear, String userId, String password) {
        if(userId.length() < 5 || userId.contains(" "))
            throw new IllegalArgumentException();

        if(password.length() < 5 || password.contains(" "))
            throw new IllegalArgumentException();

        if(name == null || name.length() == 0)
            throw new IllegalArgumentException("Nome dell'utente con formato errato.");

        if(surname == null || surname.length() == 0)
            throw new IllegalArgumentException("Cognome dell'utente con formato errato.");

        if(birthYear < 1900)
            throw new IllegalArgumentException("Data di nascita dell'utente con formato errato.");
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.userId = userId;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setPassword (String password)   {
        if(password.length() < 5 || password.contains(" "))
            throw new IllegalArgumentException("Login dell'utente con formato errato.");
        this.password = password;
    }

    public void setUserId(String userId) {
        if(userId.length() < 5 || userId.contains(" "))
            throw new IllegalArgumentException("Password dell'utente con formato errato.");
        this.userId = userId;
    }


    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Nome='" + name + '\'' +
                ", Cognome='" + surname + '\'' +
                ", Anno di nascita=" + birthYear;
    }
}
