package it.unisa.medicaltests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class MedicalTestList {

    private final List<MedicalTest> medicalTestList;

    public MedicalTestList() {
        this.medicalTestList = new ArrayList<>();
    }

    public void addMedicalTest(MedicalTest mt) {
        this.medicalTestList.add(mt);
    }

    public List<MedicalTest> getMedicalTestByDate(GregorianCalendar date) {
        List<MedicalTest> result = new ArrayList<>();

        for(MedicalTest med : medicalTestList)   {
            if(med.getDate() != null && med.getDate().equals(date))
                result.add(med);
        }

        return result;
    }

    public List<MedicalTest> getMedicalTestByDoctor(String doctorName) {
        List<MedicalTest> result = new ArrayList<>();

        for(MedicalTest med : medicalTestList)   {
            if(med.getDoctorName().equals(doctorName))
                result.add(med);
        }

        return result;
    }

    public double getAverageCost() {
        double average = 0.0;

        for(MedicalTest med : medicalTestList)  {
            average += med.getCost();
        }
        average /= medicalTestList.size();

        return average;
    }

    public List<MedicalTest> getMedicalTestList() {
        return medicalTestList;
    }
}
