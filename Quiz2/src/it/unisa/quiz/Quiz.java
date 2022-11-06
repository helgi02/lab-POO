package it.unisa.quiz;

public class Quiz implements Measurable {

    private final double score;

    public Quiz(double score) {
        this.score = score;
    }

    public double getMeasure() {
        return score;
    }


    public int compareTo(Double sc){
        return Double.compare(this.score, sc);
    }
}
