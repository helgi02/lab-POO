package it.unisa.school;

public class Professor extends Person {

    private String topic;
    private double wage;

    public Professor(String name, String surname, int birthYear, String spec, int stip)  {
        super(name, surname, birthYear);

        this.topic = spec;
        this.wage = stip;
    }


    public double getWage() {
        return wage;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Argomento='" + topic + '\'' +
                ", Stipendio=" + wage;
    }
}
