package it.unisa.quiz;

public class Quiz implements Measurable {

    private final double score;

    public Quiz(double score) {
        this.score = score;
    }

    @Override
    public double getMeasure() {
        return this.score;
    }


    @Override
    public int compareTo(Measurable o)  {
        return Double.compare(this.score, o.getMeasure());
    }
}
