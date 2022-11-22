package it.unisa.school;

public class Student extends Person {

    private int numberOfAbsences;

    public Student(String name, String surnname, int birthYear, int numAbs)    {
        super(name, surnname, birthYear);
        this.numberOfAbsences = numAbs;
    }

    public int getNumberOfAbsences() {
        return numberOfAbsences;
    }

    public void addAbsences()    {
        this.numberOfAbsences++;
    }

    public void removeAbsence() {
        this.numberOfAbsences--;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Numero di assenze=" + numberOfAbsences;
    }
}
